package hackerank.javaComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
class Checker implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Player a = (Player)o1;
        Player b = (Player)o2;
        if (a.score == b.score)
        {
            return (a.name).compareTo(b.name);
        } 
        else 
        {
            return (b.score) - (a.score);
        }
    }
}
public class Solution
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
