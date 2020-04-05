import java.util.ArrayList;

public class Sequence
{
	private ArrayList<Integer> values;

	public Sequence()
	{
		values = new ArrayList<Integer>();
	}

	public void add(int n)
	{
		values.add(n);
	}

	public String toString()
	{
		return values.toString();
	}
	
	public int seqLength(){
		return values.size();
	}
	
	public int valAt(int index){
		return values.get(index);
	}
	
	public Sequence append(Sequence other)
	{
		for(int i = 0; i < other.seqLength(); i++){
			values.add(other.valAt(i));
		}
		return this;
	}
	
	public Sequence merge(Sequence other){
		this.append(other);
		return this;
	}
	
	public Sequence sort(){
		for(int i = 0; i < values.size(); i++)
			for(int j = 0; j < values.size()-1; j++){
				if(values.get(j) > values.get(i)){
					int num = values.get(j);
					values.set(j, values.get(i));
					values.set(i, num);
				}
			}
			return this;
	}
	
	public Sequence mergeSorted(Sequence other){
		Sequence result = this.merge(other);
		return result.sort();
	}
	
	public void removeDuplicate(){
		for(int i = 0; i < values.size()-1; i++){
			if(values.get(i) == values.get(i+1)){
				values.remove(i+1);
				i--;
			}
		}
	}
}
