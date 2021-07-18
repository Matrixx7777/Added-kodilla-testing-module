package com.kodilla.good.patterns.challenges.food;

public class ProviderOrder {
    public Provider provider;
    public boolean isOrdered;

    public ProviderOrder(final Provider provider, final boolean isOrdered) {
        this.provider = provider;
        this.isOrdered = isOrdered;
    }
}
