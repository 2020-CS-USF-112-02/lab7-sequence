public class SequenceDriver
{
	public static void main(String[] args)
	{
		Sequence firstSequence = new Sequence();
		firstSequence.add(1);
		firstSequence.add(4);
		firstSequence.add(9);
		firstSequence.add(16);
		System.out.println("First sequence: " + firstSequence);

		Sequence secondSequence = new Sequence();
		secondSequence.add(9);
		secondSequence.add(7);
		secondSequence.add(4);
		secondSequence.add(9);
		secondSequence.add(11);
		System.out.println("Second sequence: " + secondSequence);

		Sequence combinedSequence = firstSequence.append(secondSequence);
		System.out.println("Appended Sequence: "+ combinedSequence);
		System.out.println("Expected Sequence: [1, 4, 9, 16, 9, 7, 4, 9, 11]");
		System.out.println();

		Sequence firstSequence1 = new Sequence();
		firstSequence1.add(1);
		firstSequence1.add(4);
		firstSequence1.add(9);
		firstSequence1.add(16);
		System.out.println("First sequence: " + firstSequence1);

		Sequence secondSequence1 = new Sequence();
		secondSequence1.add(9);
		secondSequence1.add(7);
		secondSequence1.add(4);
		secondSequence1.add(9);
		secondSequence1.add(11);
		System.out.println("Second sequence: " + secondSequence1);
		
		System.out.println("First sequence: " + firstSequence1);
		System.out.println("Second sequence: " + secondSequence1);
		Sequence mergedSequence = firstSequence1.merge(secondSequence1);
		System.out.println("Merged: "+ mergedSequence);
		System.out.println("Expected: [1, 9, 4, 7, 9, 4, 16, 9, 11]");
		System.out.println();
		
		Sequence firstSequence2 = new Sequence();
		firstSequence2.add(1);
		firstSequence2.add(4);
		firstSequence2.add(9);
		firstSequence2.add(16);
		System.out.println("First sequence: " + firstSequence2);

		Sequence secondSequence2 = new Sequence();
		secondSequence2.add(9);
		secondSequence2.add(7);
		secondSequence2.add(4);
		secondSequence2.add(9);
		secondSequence2.add(11);
		System.out.println("Second sequence: " + secondSequence2);
		
		Sequence mergeSortedSequence = firstSequence2.mergeSorted(secondSequence2);
		System.out.println("Merge sorted: " + mergeSortedSequence);
		System.out.println("Expected: [1, 4, 4, 7, 9, 9, 9, 11, 16]");
		System.out.println();
		
		Sequence firstSequence3 = new Sequence();
		firstSequence3.add(1);
		firstSequence3.add(4);
		firstSequence3.add(9);
		firstSequence3.add(16);
		System.out.println("First sequence: " + firstSequence3);

		Sequence secondSequence3 = new Sequence();
		secondSequence3.add(9);
		secondSequence3.add(7);
		secondSequence3.add(4);
		secondSequence3.add(9);
		secondSequence3.add(11);
		System.out.println("Second sequence: " + secondSequence3);

		Sequence noDupSequence = firstSequence3.mergeSorted(secondSequence3);
		noDupSequence.removeDuplicate();
		System.out.println("No duplicate Sequence: "+ noDupSequence);
		System.out.println("Expected Sequence: [1, 4, 9, 7, 11, 16]");
		System.out.println();
	}
}
