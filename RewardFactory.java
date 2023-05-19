// Reward Factory
class RewardFactory {
    public Reward getReward(String rewardType) {
        if (rewardType == null) {
            return null;
        }
        if (rewardType.equalsIgnoreCase("POINTS")) {
            return new PointsReward();
        }
        return null;
    }
}
