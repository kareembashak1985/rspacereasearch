package com.rspace.RSpaceLaboratory.externalapi.model;

import java.util.ArrayList;

public class RspaceSampleResponse {

	private float totalHits;
	private float pageNumber;
	private ArrayList<Sample> samples = new ArrayList<Sample>();
	private ArrayList<link> _links = new ArrayList<link>();

	// Getter Methods

	public ArrayList<Sample> getSamples() {
		return samples;
	}

	public void setSamples(ArrayList<Sample> samples) {
		this.samples = samples;
	}

	public ArrayList<link> get_links() {
		return _links;
	}

	public void set_links(ArrayList<link> _links) {
		this._links = _links;
	}

	public float getTotalHits() {
		return totalHits;
	}

	public float getPageNumber() {
		return pageNumber;
	}

	// Setter Methods

	public void setTotalHits(float totalHits) {
		this.totalHits = totalHits;
	}

	public void setPageNumber(float pageNumber) {
		this.pageNumber = pageNumber;
	}

}
