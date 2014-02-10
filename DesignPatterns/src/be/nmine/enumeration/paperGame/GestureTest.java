package be.nmine.enumeration.paperGame;

import static be.nmine.enumeration.paperGame.Gesture.PAPER;
import static be.nmine.enumeration.paperGame.Gesture.ROCK;
import static be.nmine.enumeration.paperGame.Gesture.SCISSORS;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class GestureTest {

	@Test
	public void paper_beats_rock() {
		assert(PAPER.beats(ROCK));
		assertFalse(ROCK.beats(PAPER));
	}
	@Test
	public void scissors_beats_paper() {
		assert(SCISSORS.beats(PAPER));
		assertFalse(PAPER.beats(SCISSORS));
	}
	@Test
	public void rock_beats_scissors() {
		assert(ROCK.beats(SCISSORS));
		assertFalse(SCISSORS.beats(ROCK));
	}

}
