package org.lby123165.easybot.duck;

/**
 * This interface is implemented on ServerPlayNetworkHandler via a Mixin
 * to provide safe access to the private 'latency' field.
 */
public interface ILatencyProvider {
    int getLatency();
}