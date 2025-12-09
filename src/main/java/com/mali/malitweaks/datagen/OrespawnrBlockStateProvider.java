package com.mali.malitweaks.datagen;


import com.mali.malitweaks.MaliTweaks;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class OrespawnrBlockStateProvider extends BlockStateProvider {
    private int maxAge;
    //══════════════════════════════════════════ ✰ CONSTRUCTOR ✰ ══════════════════════════════════════════════════//
    public OrespawnrBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MaliTweaks.MODID, exFileHelper);
    }
    //═════════════════════════════════════════ ✰ STATE REGISTRATION ✰ ══════════════════════════════════════════════//
    @Override
    protected void registerStatesAndModels() {










    }
    //═════════════════════════════════════════ ✰ HELPER METHODS ✰ ══════════════════════════════════════════════//


    private void blockWithSidesWithItem(DeferredBlock<?> deferredBlock, String bottomTexture, String sideTexture, String topTexture) {
        BlockModelBuilder model = models().cubeBottomTop(
                name(deferredBlock.get()),
                modLoc("block/" + sideTexture),
                modLoc("block/" + bottomTexture),
                modLoc("block/" + topTexture)
        );
        simpleBlockWithItem(deferredBlock.get(), model);
    }

    private void crystalLeavesBlockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(),
                models().cubeAll(name(deferredBlock.get()), blockTexture(deferredBlock.get()))
                        .renderType("cutout"));
    }
    private void axisBlockWithItem(DeferredBlock<RotatedPillarBlock> deferredBlock, String logSideTexture, String logTopTexture) {
        BlockModelBuilder model = models().cubeColumn(
                name(deferredBlock.get()),
                modLoc("block/" + logSideTexture),
                modLoc("block/" + logTopTexture)
        );

        axisBlock(deferredBlock.get(),
                modLoc("block/" + logSideTexture),
                modLoc("block/" + logTopTexture));

        simpleBlockItem(deferredBlock.get(), model);
    }

    private void crystalClusterBlockWithItem(DeferredBlock<?> deferredBlock) {
        BlockModelBuilder model = models().cross(
                        name(deferredBlock.get()),
                        blockTexture(deferredBlock.get()))
                .renderType("cutout");

        getVariantBuilder(deferredBlock.get())
                .forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.FACING);
                    return ConfiguredModel.builder()
                            .modelFile(model)
                            .rotationX(dir == Direction.DOWN ? 180 :
                                    dir.getAxis().isHorizontal() ? 270 : 0)
                            .rotationY(dir.getAxis().isVertical() ? 0 :
                                    ((int) dir.toYRot()) % 360)
                            .build();
                });

        itemModels().getBuilder(name(deferredBlock.get()))
                .parent(models().getExistingFile(mcLoc("item/generated")))
                .texture("layer0", blockTexture(deferredBlock.get()));
    }



    private void torchBlock(DeferredBlock<?> block) {
        BlockModelBuilder model = models().withExistingParent(name(block.get()), mcLoc("block/template_torch"))
                .texture("torch", modLoc("block/" + name(block.get())))
                .renderType("cutout");

        simpleBlock(block.get(), model);

        itemModels().withExistingParent(name(block.get()), mcLoc("item/generated"))
                .texture("layer0", modLoc("block/" + name(block.get())));
    }



    private void wallTorchBlock(DeferredBlock<?> block, String baseTorchName) {
        BlockModelBuilder wallModel = models().withExistingParent("wall_" + name(block.get()), mcLoc("block/template_torch_wall"))
                .texture("torch", modLoc("block/" + baseTorchName))
                .renderType("cutout");

        getVariantBuilder(block.get())
                .forAllStates(state -> {
                    Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
                    return ConfiguredModel.builder()
                            .modelFile(wallModel)
                            .rotationY(((int) dir.toYRot() + 90) % 360)
                            .build();
                });
    }



    private void transparentBLockWithSidesBlockWithItem(DeferredBlock<?> deferredBlock, String bottomTexture, String sideTexture, String topTexture) {
        BlockModelBuilder model = models().cubeBottomTop(
                name(deferredBlock.get()),
                modLoc("block/" + sideTexture),
                modLoc("block/" + bottomTexture),
                modLoc("block/" + topTexture)
        ).renderType("translucent");
        simpleBlockWithItem(deferredBlock.get(), model);
    }

    private void plantBlockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlock(deferredBlock.get(),
                models().cross(name(deferredBlock.get()), blockTexture(deferredBlock.get()))
                        .renderType("cutout"));

        itemModels().getBuilder(name(deferredBlock.get()))
                .parent(models().getExistingFile(mcLoc("item/generated")))
                .texture("layer0", modLoc("block/" + name(deferredBlock.get())));
    }


    private void fruitLeavesBlock(DeferredBlock<?> deferredBlock, IntegerProperty ageProperty) {
        String baseName = name(deferredBlock.get()).replace("_fruit_leaves", "");

        BlockModelBuilder leavesModel = models().withExistingParent(baseName + "_leaves", mcLoc("block/leaves"))
                .texture("all", modLoc("block/" + baseName + "_leaves"));

        BlockModelBuilder stage0 = models().withExistingParent(baseName + "_stage_0", mcLoc("block/leaves"))
                .texture("all", modLoc("block/" + baseName + "_stage_0"));

        BlockModelBuilder stage1 = models().withExistingParent(baseName + "_stage_1", mcLoc("block/leaves"))
                .texture("all", modLoc("block/" + baseName + "_stage_1"));

        BlockModelBuilder stage2 = models().withExistingParent(baseName + "_stage_2", mcLoc("block/leaves"))
                .texture("all", modLoc("block/" + baseName + "_stage_2"));

        getVariantBuilder(deferredBlock.get())
                .partialState().with(ageProperty, 0).addModels(new ConfiguredModel(leavesModel))
                .partialState().with(ageProperty, 1).addModels(new ConfiguredModel(stage0))
                .partialState().with(ageProperty, 2).addModels(new ConfiguredModel(stage1))
                .partialState().with(ageProperty, 3).addModels(new ConfiguredModel(stage2));

        simpleBlockItem(deferredBlock.get(), leavesModel);
    }








    private void basicLeaveBlock(DeferredBlock<?> deferredBlock) {
        BlockModelBuilder model = models().withExistingParent(name(deferredBlock.get()), mcLoc("block/leaves"))
                .texture("all", modLoc("block/" + name(deferredBlock.get())));
        simpleBlockWithItem(deferredBlock.get(), model);
    }




    private void saplingBlock(Block blockRegistryObject) {
        this.simpleBlock(blockRegistryObject,
                this.models().cross(BuiltInRegistries.BLOCK.getKey(blockRegistryObject).getPath(),
                        this.blockTexture(blockRegistryObject)).renderType("cutout"));

        itemModels().withExistingParent(BuiltInRegistries.BLOCK.getKey(blockRegistryObject).getPath(),
                        mcLoc("item/generated"))
                .texture("layer0", blockTexture(blockRegistryObject));
    }

    private void makeCrop(DeferredBlock<?> crop, String modelName, IntegerProperty ageProperty) {
        this.maxAge = 3;
        getVariantBuilder(crop.get()).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            String stageName = modelName + "_stage" + age;

            return ConfiguredModel.builder()
                    .modelFile(models().crop(stageName,
                                    modLoc("block/" + modelName + "_stage" + age))
                            .renderType("cutout"))
                    .build();
        });
    }

    private void makeCrossCrop(DeferredBlock<?> crop, String modelName, IntegerProperty ageProperty) {
        this.maxAge = 3;
        getVariantBuilder(crop.get()).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            String stageName = modelName + "_stage" + age;

            return ConfiguredModel.builder()
                    .modelFile(models().cross(stageName,
                                    modLoc("block/" + modelName + "_stage" + age))
                            .renderType("cutout"))
                    .build();
        });
    }



    private void makeCropWithItem(DeferredBlock<?> crop, String modelName, IntegerProperty ageProperty) {
        // Generate block states and models
        getVariantBuilder(crop.get()).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            String stageName = modelName + "_stage" + age;

            return ConfiguredModel.builder()
                    .modelFile(models().crop(stageName,
                                    modLoc("block/" + modelName + "_stage" + age))
                            .renderType("cutout"))
                    .build();
        });
        itemModels().withExistingParent(name(crop.get()), mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + modelName));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("orespawnr:block/" + deferredBlock.getId().getPath()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("orespawnr:block/" + deferredBlock.getId().getPath() + appendix));
    }















    private ResourceLocation key(Block block) {
        return BuiltInRegistries.BLOCK.getKey(block);
    }
    private String name(Block block) {
        return this.key(block).getPath();
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
    //══════════════════════════════════════════════════ ✰..✰ ═══════════════════════════════════════════════════════//

}

