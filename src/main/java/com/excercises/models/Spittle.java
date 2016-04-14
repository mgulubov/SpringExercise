package com.excercises.models;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Spittle {
	private final Long _id;
	private final String _message;
	private final Date _time;
	private Double latitude;
	private Double longitude;

	public Spittle(String message, Date time) {
		this(message, time, null, null);
	}

	public Spittle(String message, Date time, Double latitude, Double longitude) {
		this._id = null;
		this._message = message;
		this._time = time;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that, "_id", "_time");
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "_id", "_time");
	}

	public Long getId() {
		return this._id;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public String getMessage() {
		return this._message;
	}

	public Date getTime() {
		return this._time;
	}
}
