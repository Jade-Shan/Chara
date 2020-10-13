// ***LICENSE*** This file is licensed under GPLv2 with Classpath Exception. See LICENSE file under project root for more info

package net.cassite.desktop.chara.model.kokori;

import net.cassite.desktop.chara.model.ModelInitConfig;
import net.cassite.desktop.chara.util.Consts;
import net.cassite.desktop.chara.util.Rec;

public class KokoriConsts {
    public final int imageWidth;
    public final int imageHeight;
    public final int minWidth;
    public final int initialWidth;
    public final int xMin;
    public final int xMax;
    public final int yMin;
    public final int yMax;
    public final int xTopMiddle;
    public final int xBottomMiddle;
    public final int eyeRightOriginalX;
    public final int eyeRightOriginalY;
    public final int eyeRightXMin;
    public final int eyeRightXMax;
    public final int eyeRightYMin;
    public final int eyeRightYMax;
    public final int eyeLeftOriginalX;
    public final int eyeLeftOriginalY;
    public final int eyeLeftXMin;
    public final int eyeLeftXMax;
    public final int eyeLeftYMin;
    public final int eyeLeftYMax;
    public final int eyeTrackYMax;
    public final int msgOffsetX;
    public final int msgMinY;
    public final double armRightJoin_shoulderRotate_x;
    public final double armRightJoin_shoulderRotate_y;
    public final double armRightJoin_elbowRotate_x;
    public final double armRightJoin_elbowRotate_y;
    public final double armRightJoin_protectCrotch_targetShoulderAngle;
    public final double armRightJoin_protectCrotch_targetElbowAngle;
    public final double armRightJoin_protectCrotch_targetElbowDeltaX;
    public final double armRightJoin_protectCrotch_targetElbowDeltaY;
    public final double armRightJoin_tighten_targetShoulderAngle;
    public final double armRightJoin_tighten_targetElbowAngle;
    public final double armRightJoin_tighten_targetElbowDeltaX;
    public final double armRightJoin_tighten_targetElbowDeltaY;
    public final double headJoin_headRotate_x;
    public final double headJoin_headRotate_y;
    public final double headJoin_hairSideLeftRotate_x;
    public final double headJoin_hairSideLeftRotate_y;
    public final double headJoin_hairSideRightRotate_x;
    public final double headJoin_hairSideRightRotate_y;
    public final double headJoin_hairBackRotate_x;
    public final double headJoin_hairBackRotate_y;
    public final double headJoin_tiltToLeft_targetAngle;
    public final double headJoin_tiltToRight_targetAngle;
    public final double armLeft_shoulderRotate_x;
    public final double armLeft_shoulderRotate_y;
    public final double armLeft_elbowRotate_x;
    public final double armLeft_elbowRotate_y;
    public final double armLeft_showBow_targetShoulderAngle;
    public final double armLeft_showBow_targetElbowAngle;
    public final double armLeft_showBow_targetElbowTranslateX;
    public final double armLeft_showBow_targetElbowTranslateY;
    public final double mouth_rotate_x;
    public final double mouth_rotate_y;
    public final double mouth_tiltToRight_angle;
    public final double mouth_tiltToLeft_angle;
    public final double mouth_mouthOpen_yMinRatio;
    public final double mouth_mouthOpen_yMaxRatio;

    public final int eyeTrackXMin;
    public final int eyeTrackXMax;
    public final int eyeTrackYMin;

    public final Rec clickHairRec;
    public final Rec clickEyeRightRec;
    public final Rec clickEyeLeftRec;
    public final Rec clickFaceRec;
    public final Rec clickRuneRec;
    public final Rec clickClothRec1;
    public final Rec clickClothRec2;
    public final Rec clickClothRec3;
    public final Rec clickClothRec4;
    public final Rec clickBowknotRec;
    public final Rec clickBreastRec;
    public final Rec clickArmLeftRec;
    public final Rec clickCrotchRec;
    public final Rec clickLegLeftRec;
    public final Rec clickLegRec;
    public final Rec clickNothingRec1;
    public final Rec clickNothingRec2;
    public final Rec clickNothingRec3;
    public final Rec clickNothingRec4;

    public final double badMood = 0.3;
    public final double reallyBadMood = 0.2;
    public final double reallyReallyBadMood = 0.15;

    public KokoriConsts(ModelInitConfig config) {
        var scale = config.getDouble("scale");

        imageWidth = config.getInt("imageWidth");
        imageHeight = config.getInt("imageHeight");
        minWidth = config.getInt("minWidth");
        initialWidth = config.getInt("initialWidth");
        xMin = (int) (config.getInt("xMin") * scale);
        xMax = (int) (config.getInt("xMax") * scale);
        yMin = (int) (config.getInt("yMin") * scale);
        yMax = (int) (config.getInt("yMax") * scale);
        xTopMiddle = (int) (config.getInt("xTopMiddle") * scale);
        xBottomMiddle = (int) (config.getInt("xBottomMiddle") * scale);
        eyeRightOriginalX = (int) (config.getInt("eyeRightOriginalX") * scale);
        eyeRightOriginalY = (int) (config.getInt("eyeRightOriginalY") * scale);
        eyeRightXMin = (int) (config.getInt("eyeRightXMin") * scale);
        eyeRightXMax = (int) (config.getInt("eyeRightXMax") * scale);
        eyeRightYMin = (int) (config.getInt("eyeRightYMin") * scale);
        eyeRightYMax = (int) (config.getInt("eyeRightYMax") * scale);
        eyeLeftOriginalX = (int) (config.getInt("eyeLeftOriginalX") * scale);
        eyeLeftOriginalY = (int) (config.getInt("eyeLeftOriginalY") * scale);
        eyeLeftXMin = (int) (config.getInt("eyeLeftXMin") * scale);
        eyeLeftXMax = (int) (config.getInt("eyeLeftXMax") * scale);
        eyeLeftYMin = (int) (config.getInt("eyeLeftYMin") * scale);
        eyeLeftYMax = (int) (config.getInt("eyeLeftYMax") * scale);
        eyeTrackYMax = (int) (config.getInt("eyeTrackYMax") * scale);
        msgOffsetX = (int) (config.getInt("msgOffsetX") * scale);
        msgMinY = (int) (config.getInt("msgMinY") * scale);
        armRightJoin_shoulderRotate_x = config.getDouble("armRightJoin.shoulderRotate.x") * scale;
        armRightJoin_shoulderRotate_y = config.getDouble("armRightJoin.shoulderRotate.y") * scale;
        armRightJoin_elbowRotate_x = config.getDouble("armRightJoin.elbowRotate.x") * scale;
        armRightJoin_elbowRotate_y = config.getDouble("armRightJoin.elbowRotate.y") * scale;
        armRightJoin_protectCrotch_targetShoulderAngle = config.getDouble("armRightJoin.protectCrotch.targetShoulderAngle");
        armRightJoin_protectCrotch_targetElbowAngle = config.getDouble("armRightJoin.protectCrotch.targetElbowAngle");
        armRightJoin_protectCrotch_targetElbowDeltaX = config.getDouble("armRightJoin.protectCrotch.targetElbowDeltaX") * scale;
        armRightJoin_protectCrotch_targetElbowDeltaY = config.getDouble("armRightJoin.protectCrotch.targetElbowDeltaY") * scale;
        armRightJoin_tighten_targetShoulderAngle = config.getDouble("armRightJoin.tighten.targetShoulderAngle");
        armRightJoin_tighten_targetElbowAngle = config.getDouble("armRightJoin.tighten.targetElbowAngle");
        armRightJoin_tighten_targetElbowDeltaX = config.getDouble("armRightJoin.tighten.targetElbowDeltaX") * scale;
        armRightJoin_tighten_targetElbowDeltaY = config.getDouble("armRightJoin.tighten.targetElbowDeltaY") * scale;
        headJoin_headRotate_x = config.getDouble("headJoin.headRotate.x") * scale;
        headJoin_headRotate_y = config.getDouble("headJoin.headRotate.y") * scale;
        headJoin_hairSideLeftRotate_x = config.getDouble("headJoin.hairSideLeftRotate.x") * scale;
        headJoin_hairSideLeftRotate_y = config.getDouble("headJoin.hairSideLeftRotate.y") * scale;
        headJoin_hairSideRightRotate_x = config.getDouble("headJoin.hairSideRightRotate.x") * scale;
        headJoin_hairSideRightRotate_y = config.getDouble("headJoin.hairSideRightRotate.y") * scale;
        headJoin_hairBackRotate_x = config.getDouble("headJoin.hairBackRotate.x") * scale;
        headJoin_hairBackRotate_y = config.getDouble("headJoin.hairBackRotate.y") * scale;
        headJoin_tiltToLeft_targetAngle = config.getDouble("headJoin.tiltToLeft.targetAngle");
        headJoin_tiltToRight_targetAngle = config.getDouble("headJoin.tiltToRight.targetAngle");
        armLeft_shoulderRotate_x = config.getDouble("armLeft.shoulderRotate.x") * scale;
        armLeft_shoulderRotate_y = config.getDouble("armLeft.shoulderRotate.y") * scale;
        armLeft_elbowRotate_x = config.getDouble("armLeft.elbowRotate.x") * scale;
        armLeft_elbowRotate_y = config.getDouble("armLeft.elbowRotate.y") * scale;
        armLeft_showBow_targetShoulderAngle = config.getDouble("armLeft.showBow.targetShoulderAngle");
        armLeft_showBow_targetElbowAngle = config.getDouble("armLeft.showBow.targetElbowAngle");
        armLeft_showBow_targetElbowTranslateX = config.getDouble("armLeft.showBow.targetElbowTranslateX") * scale;
        armLeft_showBow_targetElbowTranslateY = config.getDouble("armLeft.showBow.targetElbowTranslateY") * scale;
        mouth_rotate_x = config.getDouble("mouth.rotate.x") * scale;
        mouth_rotate_y = config.getDouble("mouth.rotate.y") * scale;
        mouth_tiltToRight_angle = config.getDouble("mouth.tiltToRight.angle");
        mouth_tiltToLeft_angle = config.getDouble("mouth.tiltToLeft.angle");
        mouth_mouthOpen_yMinRatio = config.getDouble("mouth.mouthOpen.yMinRatio");
        mouth_mouthOpen_yMaxRatio = config.getDouble("mouth.mouthOpen.yMaxRatio");

        int eyeToEdgeLen = Math.min(xMax - eyeLeftOriginalX, eyeRightOriginalX - xMin);
        eyeTrackXMin = eyeRightOriginalX - eyeToEdgeLen;
        eyeTrackXMax = eyeLeftOriginalX + eyeToEdgeLen;
        eyeTrackYMin = yMin - Consts.CHARA_TOTAL_MARGIN_TOP;

        clickHairRec = config.getIntegerRectangle("clickHairRec");
        clickEyeRightRec = config.getIntegerRectangle("clickEyeRightRec");
        clickEyeLeftRec = config.getIntegerRectangle("clickEyeLeftRec");
        clickFaceRec = config.getIntegerRectangle("clickFaceRec");
        clickRuneRec = config.getIntegerRectangle("clickRuneRec");
        clickClothRec1 = config.getIntegerRectangle("clickClothRec1");
        clickClothRec2 = config.getIntegerRectangle("clickClothRec2");
        clickClothRec3 = config.getIntegerRectangle("clickClothRec3");
        clickClothRec4 = config.getIntegerRectangle("clickClothRec4");
        clickBowknotRec = config.getIntegerRectangle("clickBowknotRec");
        clickBreastRec = config.getIntegerRectangle("clickBreastRec");
        clickArmLeftRec = config.getIntegerRectangle("clickArmLeftRec");
        clickCrotchRec = config.getIntegerRectangle("clickCrotchRec");
        clickLegLeftRec = config.getIntegerRectangle("clickLegLeftRec");
        clickLegRec = config.getIntegerRectangle("clickLegRec");
        clickNothingRec1 = config.getIntegerRectangle("clickNothingRec1");
        clickNothingRec2 = config.getIntegerRectangle("clickNothingRec2");
        clickNothingRec3 = config.getIntegerRectangle("clickNothingRec3");
        clickNothingRec4 = config.getIntegerRectangle("clickNothingRec4");
    }
}
