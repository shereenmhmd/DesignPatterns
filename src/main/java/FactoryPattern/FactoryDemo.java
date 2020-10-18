package FactoryPattern;

public class FactoryDemo {
	
	public static void main(String[] args) {
		UniformFactory cairoUniformFactory = new CairoBranchFacory();
		UniformFactory londonUniformFactory = new LondonBranchFacory();
		
		Uniform aucUniform = cairoUniformFactory.createUniform(SchoolName.AMericanSchool);	
		aucUniform.createUniform();
		
		Uniform britishUniform = londonUniformFactory.createUniform(SchoolName.BrithishSchool);
		britishUniform.createUniform();
		
		Uniform imperialCollegeUniform = cairoUniformFactory.createUniform(SchoolName.ImperialCollegeLondon);
		
		imperialCollegeUniform.createUniform();
		
		Uniform kingCollegeLondon = londonUniformFactory.createUniform(SchoolName.KingCollegeLondon);
		kingCollegeLondon.createUniform();
		
		Uniform kingCollegeLondonAtCairo = cairoUniformFactory.createUniform(SchoolName.KingCollegeLondon);
		kingCollegeLondonAtCairo.createUniform();
		
		
		
		
				
	}
	
	

}
