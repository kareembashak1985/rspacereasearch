package com.rspace.RSpaceLaboratory.externalapi.model;

import java.util.ArrayList;

public class Sample {
	private float id;
	private String globalId;
	private String name;
	private String description;
	private String created;
	private String createdBy;
	private String lastModified;
	private String modifiedBy;
	private boolean deleted;
	private String deletedDate;
	private String revisionId;
	private float iconId;
	Quantity QuantityObject;
	private String tags;
	private String barcode;
	private String type;
	private float templateId;
	private boolean template;
	private Owner OwnerObject;
	private String subSampleAlias;
	private float subSamplesCount;
	StorageTempMin StorageTempMinObject;
	StorageTempMax StorageTempMaxObject;
	private String sampleSource;
	private String expiryDate;
	ArrayList<link> _links = new ArrayList<link>();

	// Getter Methods

	public ArrayList<link> get_links() {
		return _links;
	}

	public void set_links(ArrayList<link> _links) {
		this._links = _links;
	}

	public Quantity getQuantityObject() {
		return QuantityObject;
	}

	public void setQuantityObject(Quantity quantityObject) {
		QuantityObject = quantityObject;
	}

	public Owner getOwnerObject() {
		return OwnerObject;
	}

	public void setOwnerObject(Owner ownerObject) {
		OwnerObject = ownerObject;
	}

	public StorageTempMin getStorageTempMinObject() {
		return StorageTempMinObject;
	}

	public void setStorageTempMinObject(StorageTempMin storageTempMinObject) {
		StorageTempMinObject = storageTempMinObject;
	}

	public StorageTempMax getStorageTempMaxObject() {
		return StorageTempMaxObject;
	}

	public void setStorageTempMaxObject(StorageTempMax storageTempMaxObject) {
		StorageTempMaxObject = storageTempMaxObject;
	}

	
	public float getId() {
		return id;
	}

	public String getGlobalId() {
		return globalId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCreated() {
		return created;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getLastModified() {
		return lastModified;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public String getDeletedDate() {
		return deletedDate;
	}

	public String getRevisionId() {
		return revisionId;
	}

	public float getIconId() {
		return iconId;
	}

	public Quantity getQuantity() {
		return QuantityObject;
	}

	public String getTags() {
		return tags;
	}

	public String getBarcode() {
		return barcode;
	}

	public String getType() {
		return type;
	}

	public float getTemplateId() {
		return templateId;
	}

	public boolean getTemplate() {
		return template;
	}

	public Owner getOwner() {
		return OwnerObject;
	}

	public String getSubSampleAlias() {
		return subSampleAlias;
	}

	public float getSubSamplesCount() {
		return subSamplesCount;
	}

	public StorageTempMin getStorageTempMin() {
		return StorageTempMinObject;
	}

	public StorageTempMax getStorageTempMax() {
		return StorageTempMaxObject;
	}

	public String getSampleSource() {
		return sampleSource;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}

	public void setRevisionId(String revisionId) {
		this.revisionId = revisionId;
	}

	public void setIconId(float iconId) {
		this.iconId = iconId;
	}

	public void setQuantity(Quantity quantityObject) {
		this.QuantityObject = quantityObject;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTemplateId(float templateId) {
		this.templateId = templateId;
	}

	public void setTemplate(boolean template) {
		this.template = template;
	}

	public void setOwner(Owner ownerObject) {
		this.OwnerObject = ownerObject;
	}

	public void setSubSampleAlias(String subSampleAlias) {
		this.subSampleAlias = subSampleAlias;
	}

	public void setSubSamplesCount(float subSamplesCount) {
		this.subSamplesCount = subSamplesCount;
	}

	public void setStorageTempMin(StorageTempMin storageTempMinObject) {
		this.StorageTempMinObject = storageTempMinObject;
	}

	public void setStorageTempMax(StorageTempMax storageTempMaxObject) {
		this.StorageTempMaxObject = storageTempMaxObject;
	}

	public void setSampleSource(String sampleSource) {
		this.sampleSource = sampleSource;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}




