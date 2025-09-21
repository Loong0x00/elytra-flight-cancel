package com.elytraflightcancel;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.network.ClientPlayerEntity;

public class ElytraFlightCancelModClient implements ClientModInitializer {

    private boolean wasFlyingLastTick = false;
    private boolean wasJumpKeyPressed = false;
    private int spacePressCount = 0;

    @Override
    public void onInitializeClient() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            ClientPlayerEntity player = client.player;
            if (player == null) {
                return;
            }

            boolean isFlyingThisTick = player.isFallFlying();
            boolean isJumpKeyPressedThisTick = client.options.jumpKey.isPressed();

            // 当玩家状态从"不飞行"变为"飞行"时，重置计数器
            if (isFlyingThisTick && !wasFlyingLastTick) {
                spacePressCount = 0;
            }

            // 当玩家状态从"飞行"变为"不飞行"时，也重置计数器
            if (!isFlyingThisTick && wasFlyingLastTick) {
                spacePressCount = 0;
            }

            // 检测空格键是否为"刚刚按下"的动作，以避免长按导致连续计数
            boolean jumpKeyJustPressed = isJumpKeyPressedThisTick && !wasJumpKeyPressed;

            if (isFlyingThisTick && jumpKeyJustPressed) {
                spacePressCount++;
                
                // 第二次按下空格时，取消飞行并重置计数器
                if (spacePressCount >= 2) {
                    player.stopFallFlying();
                    spacePressCount = 0; // 立即重置
                }
            }

            // 更新上一tick的状态，为下一tick做准备
            wasFlyingLastTick = isFlyingThisTick;
            wasJumpKeyPressed = isJumpKeyPressedThisTick;
        });
    }
}