package learn_comparator2;

public class Player {

	private String name;
	private int age, ranking;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + ranking;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (ranking != other.ranking)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", ranking=" + ranking + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public Player(String name, int age, int ranking) {
		this.name = name;
		this.age = age;
		this.ranking = ranking;
	}

	public Player() {

	}

	public Player(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.ranking = builder.ranking;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String name;
		private int age, ranking;

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withAge(int age) {
			this.age = age;
			return this;
		}

		public Builder witRanking(int ranking) {
			this.ranking = ranking;
			return this;
		}

		public Player build() {
			return new Player(this);
		}

	}

}
