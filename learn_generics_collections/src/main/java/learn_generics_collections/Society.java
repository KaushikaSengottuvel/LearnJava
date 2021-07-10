package learn_generics_collections;

import java.util.ArrayList;
import java.util.List;

public class Society {

	public static void main(String[] args) {

		Housing housingObj = new Housing();
		Pair<Integer, ConditionOfHouse> houseProperty = new Pair<Integer, ConditionOfHouse>(12345,
				ConditionOfHouse.EXCELLENT);
		housingObj.setHouse(houseProperty);

		Committee committeeObj = new Committee();
		List<Housing> housingList = new ArrayList<>();
		housingList.add(housingObj);
		Pair<String, List<Housing>> committeeProperty = new Pair<String, List<Housing>>("President", housingList);
		committeeObj.setCommittee(committeeProperty);

	}

}
