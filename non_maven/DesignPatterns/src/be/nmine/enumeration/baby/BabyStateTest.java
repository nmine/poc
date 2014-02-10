package be.nmine.enumeration.baby;


@Test
public void eat_then_sleep_then_poop_and_repeat() {
	assertThat(EAT.next(NO_DISCOMFORT)).isEqualTo(SLEEP);
	assertThat(SLEEP.next(NO_DISCOMFORT)).isEqualTo(POOP);
	assertThat(POOP.next(NO_DISCOMFORT)).isEqualTo(EAT);
}

@Test
public void if_discomfort_then_cry_then_eat() {
	assertThat(SLEEP.next(DISCOMFORT)).isEqualTo(CRY);
	assertThat(CRY.next(NO_DISCOMFORT)).isEqualTo(EAT);
}
