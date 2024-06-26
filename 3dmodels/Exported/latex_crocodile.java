// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart Head;
	private final ModelPart Torso;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public custom_model(ModelPart root) {
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.Head = root.getChild("Head");
		this.Torso = root.getChild("Torso");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(60, 58).addBox(-2.4F, 15.0F, -2.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.049F)), PartPose.offset(-2.5F, 7.0F, 0.0F));

		PartDefinition Toe_r1 = RightLeg.addOrReplaceChild("Toe_r1", CubeListBuilder.create().texOffs(52, 20).addBox(-2.5F, -1.0F, -0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(52, 31).addBox(-1.0F, -1.0F, -0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(32, 64).addBox(-4.0F, -1.0F, -0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.6F, 15.95F, -3.325F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Toe_r2 = RightLeg.addOrReplaceChild("Toe_r2", CubeListBuilder.create().texOffs(52, 33).addBox(-1.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(39, 54).addBox(-2.5F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(28, 64).addBox(-4.0F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(1.6F, 19.0F, -1.85F, 0.0F, 0.0F, 0.0F));

		PartDefinition RightLowerLeg_r1 = RightLeg.addOrReplaceChild("RightLowerLeg_r1", CubeListBuilder.create().texOffs(60, 41).addBox(-2.0F, -8.5F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(-0.4F, 17.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

		PartDefinition RightMidLeg_r1 = RightLeg.addOrReplaceChild("RightMidLeg_r1", CubeListBuilder.create().texOffs(0, 43).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.4F, 5.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition RightUpperLeg_r1 = RightLeg.addOrReplaceChild("RightUpperLeg_r1", CubeListBuilder.create().texOffs(52, 20).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-0.4F, 1.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legspikes2 = RightLeg.addOrReplaceChild("legspikes2", CubeListBuilder.create(), PartPose.offset(2.5F, 1.0F, 0.0F));

		PartDefinition cube_r1 = legspikes2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 16).addBox(0.0F, -2.6F, -1.0F, 1.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-5.1F, 7.0F, 0.5F, -0.3491F, -0.0873F, -0.3491F));

		PartDefinition cube_r2 = legspikes2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(74, 44).addBox(-0.975F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-4.125F, 3.4F, -1.3F, -0.3491F, 0.1745F, -0.3491F));

		PartDefinition cube_r3 = legspikes2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(53, 74).addBox(-1.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-4.2F, 4.4F, -2.3F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r4 = legspikes2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(15, 30).addBox(-1.0F, -3.1F, -1.5F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.175F)), PartPose.offsetAndRotation(-4.4F, 5.0F, -2.0F, 0.1745F, 0.0F, 0.2182F));

		PartDefinition bone3 = RightLeg.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.7F, 3.0F, 0.0F));

		PartDefinition cube_r5 = bone3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 55).addBox(-0.7F, -1.5F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.5F, 6.9F, 4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = bone3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(20, 35).addBox(-1.6F, -0.8F, -0.2F, 3.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.5F, 6.9F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(32, 20).addBox(-1.6F, 15.0F, -2.75F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.049F)), PartPose.offset(2.5F, 7.0F, 0.0F));

		PartDefinition Toe_r3 = LeftLeg.addOrReplaceChild("Toe_r3", CubeListBuilder.create().texOffs(50, 64).addBox(-2.5F, -1.0F, -0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(58, 64).addBox(-1.0F, -1.0F, -0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(66, 13).addBox(-4.0F, -1.0F, -0.009F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.4F, 15.95F, -3.325F, -0.6109F, 0.0F, 0.0F));

		PartDefinition Toe_r4 = LeftLeg.addOrReplaceChild("Toe_r4", CubeListBuilder.create().texOffs(0, 65).addBox(-0.95F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(4, 65).addBox(-2.45F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F))
		.texOffs(8, 65).addBox(-3.95F, -3.0F, -1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.35F, 19.0F, -1.85F, 0.0F, 0.0F, 0.0F));

		PartDefinition LeftLowerLeg_r1 = LeftLeg.addOrReplaceChild("LeftLowerLeg_r1", CubeListBuilder.create().texOffs(28, 54).addBox(-2.0F, -8.5F, -1.0F, 4.0F, 7.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(0.4F, 17.25F, -1.25F, -0.5236F, 0.0F, 0.0F));

		PartDefinition LeftMidLeg_r1 = LeftLeg.addOrReplaceChild("LeftMidLeg_r1", CubeListBuilder.create().texOffs(48, 50).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.4F, 5.25F, -1.5F, 0.5672F, 0.0F, 0.0F));

		PartDefinition LeftUpperLeg_r1 = LeftLeg.addOrReplaceChild("LeftUpperLeg_r1", CubeListBuilder.create().texOffs(48, 0).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(0.4F, 1.0F, 0.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition legspikes = LeftLeg.addOrReplaceChild("legspikes", CubeListBuilder.create(), PartPose.offset(-2.5F, 1.0F, 0.0F));

		PartDefinition cube_r7 = legspikes.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(42, 54).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(4.0F, 7.0F, 0.5F, -0.3491F, 0.0873F, 0.3491F));

		PartDefinition cube_r8 = legspikes.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(47, 74).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(4.1F, 3.4F, -1.3F, -0.3491F, -0.1745F, 0.3491F));

		PartDefinition cube_r9 = legspikes.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(59, 74).addBox(0.0F, -3.0F, -1.0F, 1.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(4.2F, 4.4F, -2.3F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r10 = legspikes.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(62, 64).addBox(-3.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(-0.175F)), PartPose.offsetAndRotation(4.4F, 5.0F, -2.5F, 0.1745F, 0.0F, -0.2182F));

		PartDefinition bone2 = LeftLeg.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 0.0F));

		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(57, 41).addBox(-1.5F, -1.5F, -0.7F, 2.0F, 2.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 6.9F, 4.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 43).addBox(-1.6F, -0.8F, -0.2F, 3.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.4F, 6.9F, 4.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, CubeDeformation.NONE)
		.texOffs(64, 19).addBox(-2.0F, -3.0F, -6.5F, 4.0F, 2.0F, 3.0F, CubeDeformation.NONE)
		.texOffs(71, 41).addBox(-1.5F, -1.0F, -5.3F, 3.0F, 1.0F, 2.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition Snout_r1 = Head.addOrReplaceChild("Snout_r1", CubeListBuilder.create().texOffs(73, 55).addBox(0.225F, -1.0F, -1.55F, 1.0F, 2.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-2.5F, -2.0F, -5.0F, 0.0F, -0.1789F, 0.0F));

		PartDefinition Snout_r2 = Head.addOrReplaceChild("Snout_r2", CubeListBuilder.create().texOffs(73, 61).addBox(-1.225F, -1.0F, -1.55F, 1.0F, 2.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.5F, -2.0F, -5.0F, 0.0F, 0.1789F, 0.0F));

		PartDefinition Snout_r3 = Head.addOrReplaceChild("Snout_r3", CubeListBuilder.create().texOffs(64, 19).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, -2.2F, -5.5F, 0.48F, 0.0F, 0.0F));

		PartDefinition Fin = Head.addOrReplaceChild("Fin", CubeListBuilder.create().texOffs(32, 38).addBox(-1.0F, -1.9F, -1.0F, 2.0F, 2.0F, 2.0F, CubeDeformation.NONE), PartPose.offset(-0.5F, 1.0F, 0.4F));

		PartDefinition cube_r13 = Fin.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 71).addBox(-2.3F, -4.3F, -0.9F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.225F)), PartPose.offsetAndRotation(2.3F, -6.9F, 0.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Fin.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(32, 64).addBox(-2.3F, -4.425F, -3.5F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.3F, -6.9F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Fin.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(64, 7).addBox(-2.3F, -1.6F, 5.0F, 1.0F, 2.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(2.3F, -6.9F, 0.0F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Fin.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(52, 41).addBox(-2.3F, -2.6F, 3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.05F)), PartPose.offsetAndRotation(2.3F, -6.9F, 0.0F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r17 = Fin.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 0).addBox(-2.3F, -3.8F, 2.0F, 1.0F, 4.0F, 3.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.3F, -6.9F, 0.0F, -0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Fin.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 74).addBox(-2.3F, -3.3F, 0.7F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.125F)), PartPose.offsetAndRotation(2.3F, -6.9F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition bone = Fin.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition eyebrows = Head.addOrReplaceChild("eyebrows", CubeListBuilder.create(), PartPose.offset(-0.5F, -3.0F, 0.4F));

		PartDefinition cube_r19 = eyebrows.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 0).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(3.8F, -2.2F, -4.0F, -0.5236F, -0.2618F, -0.3491F));

		PartDefinition cube_r20 = eyebrows.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(2.4F, -1.6F, -4.0F, -0.5236F, -0.2618F, 0.1309F));

		PartDefinition cube_r21 = eyebrows.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(48, 28).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-2.8F, -2.2F, -4.0F, -0.5236F, 0.2618F, 0.3491F));

		PartDefinition cube_r22 = eyebrows.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(60, 51).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.4F, -1.6F, -4.0F, -0.5236F, 0.2618F, -0.1309F));

		PartDefinition LeftEar = Head.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offsetAndRotation(4.5F, -6.0F, -0.2F, -0.0873F, 0.1745F, 0.0F));

		PartDefinition Hair = Head.addOrReplaceChild("Hair", CubeListBuilder.create(), PartPose.offset(0.0F, 35.0F, 0.0F));

		PartDefinition facespikes = Head.addOrReplaceChild("facespikes", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -1.0F, -1.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r23 = facespikes.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(23, 71).addBox(-1.4F, -1.5F, -1.2F, 2.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-0.3F, -0.2F, 0.3F, -0.5236F, 0.0F, 0.5236F));

		PartDefinition cube_r24 = facespikes.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(16, 50).addBox(-0.8F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.2F, 0.3F, -1.4F, -0.5236F, 0.0F, 0.5236F));

		PartDefinition facespikes2 = Head.addOrReplaceChild("facespikes2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -1.0F, -1.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r25 = facespikes2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 71).addBox(-0.3F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(-0.2F, -0.3F, 0.3F, -0.5236F, 0.0F, -0.5236F));

		PartDefinition cube_r26 = facespikes2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(48, 38).addBox(-0.7F, -1.0F, -0.1F, 1.0F, 2.0F, 1.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.3F, 0.2F, -1.4F, -0.5236F, 0.0F, -0.5236F));

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create().texOffs(0, 16).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 8.0F, 6.0F, CubeDeformation.NONE)
		.texOffs(28, 26).addBox(-4.0F, 6.0F, -1.6F, 8.0F, 8.0F, 4.0F, new CubeDeformation(0.45F))
		.texOffs(16, 64).addBox(0.4F, 11.7F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.35F))
		.texOffs(46, 62).addBox(-2.4F, 11.7F, -2.2F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.35F))
		.texOffs(42, 68).addBox(0.1F, 8.9F, -2.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(50, 70).addBox(-3.1F, 8.9F, -2.8F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F))
		.texOffs(44, 20).addBox(0.3F, 6.4F, -3.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(68, 24).addBox(-3.3F, 6.4F, -3.2F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.1F))
		.texOffs(52, 11).addBox(0.8F, 1.2F, -3.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.625F))
		.texOffs(61, 69).addBox(-4.8F, 1.2F, -3.1F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.625F))
		.texOffs(27, 11).addBox(-5.0F, 14.0F, -2.1F, 10.0F, 4.0F, 5.0F, CubeDeformation.NONE), PartPose.offset(0.0F, -10.0F, 0.0F));

		PartDefinition FIN2 = Torso.addOrReplaceChild("FIN2", CubeListBuilder.create(), PartPose.offset(0.0F, 5.0F, 1.0F));

		PartDefinition cube_r27 = FIN2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(68, 35).addBox(-1.0F, 5.3F, -2.6F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.175F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r28 = FIN2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(38, 60).addBox(-1.0F, 2.3F, -2.6F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r29 = FIN2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(50, 62).addBox(-1.0F, 0.3F, -0.9F, 2.0F, 4.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r30 = FIN2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(65, 28).addBox(-1.0F, -2.9F, 1.9F, 2.0F, 4.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Tail = Torso.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 15.0F, 0.0F));

		PartDefinition Base_r1 = Tail.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(73, 49).addBox(-1.1F, 15.4F, -6.5F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.1F, 2.0F, 6.5F, 1.6581F, 0.0F, 0.0F));

		PartDefinition Base_r2 = Tail.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(64, 51).addBox(-1.6F, 13.0F, -5.8F, 3.0F, 4.0F, 3.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.1F, 2.0F, 6.5F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Base_r3 = Tail.addOrReplaceChild("Base_r3", CubeListBuilder.create().texOffs(0, 55).addBox(-1.6F, 6.5F, -4.6F, 3.0F, 7.0F, 3.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(0.1F, 2.0F, 6.5F, 1.4835F, 0.0F, 0.0F));

		PartDefinition Base_r4 = Tail.addOrReplaceChild("Base_r4", CubeListBuilder.create().texOffs(32, 0).addBox(-2.0F, 0.7F, -3.4F, 4.0F, 7.0F, 4.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 2.0F, 6.5F, 1.2654F, 0.0F, 0.0F));

		PartDefinition Base_r5 = Tail.addOrReplaceChild("Base_r5", CubeListBuilder.create().texOffs(0, 30).addBox(-2.5F, 0.0F, -2.0F, 5.0F, 8.0F, 5.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, 0.0F, 0.5F, 1.0036F, 0.0F, 0.0F));

		PartDefinition Fin3 = Tail.addOrReplaceChild("Fin3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 5.5F));

		PartDefinition cube_r31 = Fin3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(39, 72).addBox(-0.6F, 13.7F, 11.525F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.175F)), PartPose.offsetAndRotation(0.1F, -1.0F, -0.5F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r32 = Fin3.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(73, 4).addBox(-0.6F, 11.1F, 11.325F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.075F)), PartPose.offsetAndRotation(0.1F, -1.0F, -0.5F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r33 = Fin3.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(66, 7).addBox(-0.6F, 9.0F, 9.025F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.1F, -1.0F, -0.5F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r34 = Fin3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 67).addBox(-0.6F, 7.4F, 7.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.075F)), PartPose.offsetAndRotation(0.1F, -1.0F, -0.5F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r35 = Fin3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(64, 0).addBox(-1.0F, 5.3F, 5.2F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.275F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r36 = Fin3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 64).addBox(-1.0F, 3.5F, 2.65F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.175F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r37 = Fin3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(20, 64).addBox(-1.0F, 1.225F, 0.225F, 2.0F, 3.0F, 4.0F, new CubeDeformation(-0.05F)), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r38 = Fin3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(57, 11).addBox(-1.0F, -0.9F, -3.025F, 2.0F, 3.0F, 5.0F, CubeDeformation.NONE), PartPose.offsetAndRotation(0.0F, -1.0F, -0.5F, -0.1309F, 0.0F, 0.0F));

		PartDefinition Spikes = Torso.addOrReplaceChild("Spikes", CubeListBuilder.create().texOffs(24, 4).addBox(-1.0F, 0.0F, -8.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 5.4F, 3.8F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r39 = Spikes.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(24, 0).addBox(-1.5F, 0.5F, -8.1F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r40 = Spikes.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(71, 69).addBox(-1.0F, -1.0F, -8.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(52, 31).addBox(-3.25F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F))
		.texOffs(36, 38).addBox(-3.25F, 5.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.125F))
		.texOffs(32, 66).addBox(-0.275F, 17.05F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
		.texOffs(28, 66).addBox(-3.275F, 17.05F, 1.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
		.texOffs(20, 66).addBox(-3.275F, 17.05F, -0.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
		.texOffs(16, 66).addBox(-3.275F, 17.05F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(-6.0F, -9.0F, 0.0F));

		PartDefinition armspikes2 = RightArm.addOrReplaceChild("armspikes2", CubeListBuilder.create(), PartPose.offset(-10.7F, 9.0F, -0.8F));

		PartDefinition cube_r41 = armspikes2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(20, 38).addBox(-1.2F, 4.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(11.4F, -2.7F, 3.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = armspikes2.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(71, 13).addBox(-1.45F, -1.9F, -0.975F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(8.4F, -6.7F, 2.3F, -0.2618F, 0.0F, -0.2618F));

		PartDefinition cube_r43 = armspikes2.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(44, 0).addBox(-0.5F, -1.3F, -2.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(9.0F, -0.7F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r44 = armspikes2.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 20).addBox(-0.2F, -3.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(7.7F, -1.5F, 0.7F, 0.0F, 0.0F, -0.1745F));

		PartDefinition cube_r45 = armspikes2.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(0, 30).addBox(-3.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(10.5F, 2.7F, 2.4F, 0.0F, 0.0F, -0.1309F));

		PartDefinition cube_r46 = armspikes2.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(52, 47).addBox(-7.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(14.8F, 5.8F, 0.4F, 0.0F, 0.0F, -0.1309F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(12, 54).addBox(-0.75F, -1.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.25F))
		.texOffs(20, 38).addBox(-0.75F, 5.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.125F))
		.texOffs(21, 71).addBox(-0.75F, 17.05F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
		.texOffs(12, 71).addBox(2.25F, 17.05F, 1.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
		.texOffs(0, 69).addBox(2.25F, 17.05F, -0.5F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE)
		.texOffs(0, 67).addBox(2.25F, 17.05F, -2.0F, 1.0F, 1.0F, 1.0F, CubeDeformation.NONE), PartPose.offset(6.0F, -9.0F, 0.0F));

		PartDefinition armspikes = LeftArm.addOrReplaceChild("armspikes", CubeListBuilder.create(), PartPose.offset(1.3F, 9.0F, -0.8F));

		PartDefinition cube_r47 = armspikes.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 43).addBox(2.0F, -3.0F, -1.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(-1.1F, 2.7F, 2.4F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r48 = armspikes.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(48, 24).addBox(-1.2F, 4.9F, -0.7F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-0.6F, -2.7F, 3.9F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r49 = armspikes.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(16, 46).addBox(-0.8F, -3.4F, 0.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.7F, -1.5F, 0.7F, 0.0F, 0.0F, 0.1745F));

		PartDefinition cube_r50 = armspikes.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(60, 0).addBox(-0.5F, -1.3F, -2.8F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.6F, -0.7F, 5.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r51 = armspikes.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(24, 54).addBox(5.0F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-5.4F, 5.8F, 0.4F, 0.0F, 0.0F, 0.1309F));

		PartDefinition cube_r52 = armspikes.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(31, 71).addBox(-1.55F, -1.7F, -0.875F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(2.1F, -6.7F, 2.3F, -0.2618F, 0.0F, 0.2618F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}