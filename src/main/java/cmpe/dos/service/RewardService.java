package cmpe.dos.service;

import cmpe.dos.entity.Reward;

public interface RewardService {

	public Reward getValidCoupon(String couponId);
	
	public void DeleteUsedCoupon(Reward reward);
}
