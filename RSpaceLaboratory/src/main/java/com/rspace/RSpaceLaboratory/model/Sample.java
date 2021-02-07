package com.rspace.RSpaceLaboratory.model;

public class Sample {
	
	private  Integer sampleId;
	private String globalId;
	private String description;
	private String testName;
	private String expiryDate;
	private String sampleType;	
	private String subSampleAlia;	
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
	private String subSampleAlias;
	private float subSamplesCount;
	StorageTempMin StorageTempMinObject;
	StorageTempMax StorageTempMaxObject;
	private String sampleSource;
	
	
	public Integer getSampleId() {
		return sampleId;
	}


	public void setSampleId(Integer sampleId) {
		this.sampleId = sampleId;
	}


	public String getGlobalId() {
		return globalId;
	}


	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getTestName() {
		return testName;
	}


	public void setTestName(String testName) {
		this.testName = testName;
	}


	public String getExpiryDate() {
		return expiryDate;
	}


	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getSampleType() {
		return sampleType;
	}


	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}


	public String getSubSampleAlia() {
		return subSampleAlia;
	}


	public void setSubSampleAlia(String subSampleAlia) {
		this.subSampleAlia = subSampleAlia;
	}


	public String getCreated() {
		return created;
	}


	public void setCreated(String created) {
		this.created = created;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getLastModified() {
		return lastModified;
	}


	public void setLastModified(String lastModified) {
		this.lastModified = lastModified;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public boolean isDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


	public String getDeletedDate() {
		return deletedDate;
	}


	public void setDeletedDate(String deletedDate) {
		this.deletedDate = deletedDate;
	}


	public String getRevisionId() {
		return revisionId;
	}


	public void setRevisionId(String revisionId) {
		this.revisionId = revisionId;
	}


	public float getIconId() {
		return iconId;
	}


	public void setIconId(float iconId) {
		this.iconId = iconId;
	}


	public Quantity getQuantityObject() {
		return QuantityObject;
	}


	public void setQuantityObject(Quantity quantityObject) {
		QuantityObject = quantityObject;
	}


	public String getTags() {
		return tags;
	}


	public void setTags(String tags) {
		this.tags = tags;
	}


	public String getBarcode() {
		return barcode;
	}


	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public float getTemplateId() {
		return templateId;
	}


	public void setTemplateId(float templateId) {
		this.templateId = templateId;
	}


	public boolean isTemplate() {
		return template;
	}


	public void setTemplate(boolean template) {
		this.template = template;
	}


	public String getSubSampleAlias() {
		return subSampleAlias;
	}


	public void setSubSampleAlias(String subSampleAlias) {
		this.subSampleAlias = subSampleAlias;
	}


	public float getSubSamplesCount() {
		return subSamplesCount;
	}


	public void setSubSamplesCount(float subSamplesCount) {
		this.subSamplesCount = subSamplesCount;
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


	public String getSampleSource() {
		return sampleSource;
	}


	public void setSampleSource(String sampleSource) {
		this.sampleSource = sampleSource;
	}

	

	@Override
	public String toString() {
		return "UserSample [sampleId=" + sampleId + ", globalId=" + globalId + ", description=" + description
				+ ", testName=" + testName + ", expiryDate=" + expiryDate + ", sampleType=" + sampleType
				+ ", subSampleAlia=" + subSampleAlia + ", created=" + created + ", createdBy=" + createdBy
				+ ", lastModified=" + lastModified + ", modifiedBy=" + modifiedBy + ", deleted=" + deleted
				+ ", deletedDate=" + deletedDate + ", revisionId=" + revisionId + ", iconId=" + iconId
				+ ", QuantityObject=" + QuantityObject + ", tags=" + tags + ", barcode=" + barcode + ", type=" + type
				+ ", templateId=" + templateId + ", template=" + template + ", subSampleAlias=" + subSampleAlias
				+ ", subSamplesCount=" + subSamplesCount + ", StorageTempMinObject=" + StorageTempMinObject
				+ ", StorageTempMaxObject=" + StorageTempMaxObject + ", sampleSource=" + sampleSource + "]";
	}



	class StorageTempMax {
		private float numericValue;
		private float unitId;

		// Getter Methods

		public float getNumericValue() {
			return numericValue;
		}

		public float getUnitId() {
			return unitId;
		}

		// Setter Methods

		public void setNumericValue(float numericValue) {
			this.numericValue = numericValue;
		}

		public void setUnitId(float unitId) {
			this.unitId = unitId;
		}
	}

	class StorageTempMin {
		private float numericValue;
		private float unitId;

		// Getter Methods

		public float getNumericValue() {
			return numericValue;
		}

		public float getUnitId() {
			return unitId;
		}

		// Setter Methods

		public void setNumericValue(float numericValue) {
			this.numericValue = numericValue;
		}

		public void setUnitId(float unitId) {
			this.unitId = unitId;
		}
	}

	
		
	
}
