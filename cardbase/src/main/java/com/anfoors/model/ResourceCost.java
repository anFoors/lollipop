package com.anfoors.model;

import com.anfoors.domain.ResourceType;

import java.util.HashMap;
import java.util.Map;

public class ResourceCost {

    private Map<ResourceType, Integer> resourceAmounts;

    public ResourceCost(Map<ResourceType, Integer> resourceAmounts) {
        this.resourceAmounts = new HashMap<>(resourceAmounts);
    }

    public ResourceCost() {
        this.resourceAmounts = new HashMap<>();
    }

    public int getAmountByType(ResourceType type) {
        return resourceAmounts.getOrDefault(type, 0);
    }

    public int getConvertedCost() {
        int cmc = 0;
        for (Integer amount :
                resourceAmounts.values()) {
            cmc += amount;
        }
        return cmc;
    }

    public void addResource(ResourceType type, int amount) {
        if (resourceAmounts.containsKey(type))
            resourceAmounts.put(type, resourceAmounts.get(type) + amount);
        else
            resourceAmounts.put(type, amount);
    }
}
