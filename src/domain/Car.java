package domain;

public class Car {
	/**
	 * the ID of the car - Unique
	 */
	private String id;
	
	/**
	 * The name of the manufacturer of car
	 */
	private String manufacturer;
	
	/**
	 * The name of the model
	 */
	private String model;
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", manufacturer=" + manufacturer + ", model=" + model + ", year=" + year + "]";
	}

	/**
	 * The year of model
	 */
	private int year;

	/**
	 * Default Constructor
	 */
	public Car() {
		id="";
		manufacturer= "";
		model = "";
		year= 0;
	}

	/**
	 * Constructor of Car
	 * @param id
	 * @param manufacter
	 * @param model
	 * @param year
	 */
	public Car(String id, String manufacturer, String model, int year) {
		this.id = id;
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the manufacter
	 */
	public String getManufacturer() {
		return manufacturer;
	}

	/**
	 * @param manufacter the manufacter to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + year;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
	
	
	
	
}
