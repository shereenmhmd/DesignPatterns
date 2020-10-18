package FactoryPattern;

public class CairoBranchFacory extends UniformFactory{

	@Override
	Uniform createUniform(SchoolName auc) {
			System.out.print("Cairo Branch Factory Prepares Your Uniform: ");
			
			if (auc.equals(SchoolName.AMericanSchool))
				return new AUCSchool();
			else if (auc.equals(SchoolName.BrithishSchool))
				return new BritishSchool();
			else if (auc.equals(SchoolName.ImperialCollegeLondon))
				return new ImperialCollegeLondon();
			else if (auc.equals(SchoolName.KingCollegeLondon))
				return new KingCollegeLondon();
			
			return null;
		}
}
