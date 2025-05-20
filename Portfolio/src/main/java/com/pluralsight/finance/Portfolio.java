package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Comparable<Portfolio> {
    String name;
    String owner;
    List<IValuable> assets = new ArrayList<>();

    public Portfolio(String name, String owner, List<IValuable> assets) {
        this.name = name;
        this.owner = owner;
        this.assets = assets;
    }

    public Portfolio() {

    }

    public void add(IValuable asset) {
        assets.add(asset);
    }

    public double getValue() {
        double total = 0;
        for (IValuable asset : assets) {
            total += asset.getValue();
        }
        return total;
    }

    public IValuable getMostValuable() {
        IValuable max = assets.get(0);
        for (IValuable asset : assets) {
            if (asset.getValue() > max.getValue()) {
                max = asset;
            }
        }
        return max;
    }

    public IValuable getLeastValuable() {
        if (assets.isEmpty()) return null;
        IValuable min = assets.get(0);
        for (IValuable v : assets) {
            if (v.getValue() < min.getValue()) {
                min = v;
            }
        }
        return min;
    }

    @Override
    public int compareTo(Portfolio o) {
        return 0;
    }
}
