package mine;

import cba.LabeledItemSet;
import weka.associations.Apriori;
import weka.associations.ItemSet;
import weka.classifiers.Classifier;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;

public class CBA_App extends Classifier{
 
    private double minSupportRate;
    private double minConf;
    private FastVector [] rules;
    private Apriori app;

	@Override
	public void buildClassifier(Instances ins) throws Exception {
		// TODO Auto-generated method stub
		app = new Apriori();
		rules = app.mineCARs(ins);
		System.out.println(rules.length);
//		for(FastVector f : rules){
//			if(f != null){
//			   System.out.println(f.size());
//			   for(int i = 0 ; i < f.size() ; i++){
//				   if(f.elementAt(i).getClass() == ItemSet.class){
//					   
//				   }
//			   }
//			}
//		}
			if(rules[1]!= null){
				for(int i= 0 ; i < rules[1].size() ; i++){
					System.out.println(((ItemSet)rules[1].elementAt(i)).itemAt(0));
				}
			}
			if(rules[2]!=null){
				for(int j = 0 ; j < rules[2].size() ; j++){
					System.out.println(rules[2].elementAt(j));
				}
			}
	}

	@Override
	public double classifyInstance(Instance ins) throws Exception {
		// TODO Auto-generated method stub
		double classLabel = 0;
		return classLabel;
	}
	
	public static void main(String []argvs){
		runClassifier(new CBA_App(),new String[]{"-t","data/irisD.arff","-i","-x","10"});
	}
	
	public void prunByDBCover(FastVector[] rules){
		
	}
	
}
