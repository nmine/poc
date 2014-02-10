package be.nmine.enumeration.baby;

/**
 * The primary baby states (simplified)
 */
public enum BabyState {

	POOP(null), SLEEP(POOP), EAT(SLEEP), CRY(EAT);

	private final BabyState next;

	private BabyState(BabyState next) {
		this.next = next;
	}

	public BabyState next(boolean discomfort) {
		if (discomfort) {
			return CRY;
		}
		return next == null ? EAT : next;
	}
}