package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack position = new BishopBlack(Cell.A1);
        Cell rsl = position.position();
        assertThat(rsl, is(Cell.A1));
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure rsl = bishopBlack.copy(Cell.A1);
        assertThat(rsl.position(), is(Cell.A1));
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5 }));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void testWhenDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        bishopBlack.way(Cell.A4);
    }

}