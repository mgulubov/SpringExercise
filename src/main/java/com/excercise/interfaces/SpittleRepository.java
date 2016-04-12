package com.excercise.interfaces;

import java.util.List;

import com.excercises.models.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long maxSpittleId, int spittlesCount);
}
