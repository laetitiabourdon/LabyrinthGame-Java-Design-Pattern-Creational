package fr.iutvalence.info.dut.m3105.labyrinthGame;

import java.util.Set;

public class ConcreteLabyrinthBuilder implements LabyrinthBuilder
{
	
	private int width;

	private int height;

	private Position exitPosition;

	private Set<Position> forbiddenCellsPositions;

	@Override
	public LabyrinthBuilder setWidth(int width)
	{
		this.width = width;
		return this;
	}

	@Override
	public LabyrinthBuilder setHeight(int height)
	{
		this.height = height;
		return this;
	}

	@Override
	public LabyrinthBuilder setExitPosition(Position exitPosition)
	{
		this.exitPosition = exitPosition;
		return this;
	}

	@Override
	public LabyrinthBuilder addForbiddenCellsPositions(
			Set<Position> forbiddenCellsPositions)
	{
		this.forbiddenCellsPositions = forbiddenCellsPositions;
		return this;
	}

	@Override
	public Labyrinth getLabyrinth(int width, int height, Position exitPosition, Set<Position> forbiddenCellsPositions)
	{
		return new Labyrinth(width, height, forbiddenCellsPositions, exitPosition);
	}
	
}
