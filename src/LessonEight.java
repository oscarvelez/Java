public class LessonEight {

    public static  void main(String[] args){
        MonsterTwo.buildBattleBoard();
        char[][] tempBattleBoard = new char[10][10];

        // ObjectName[] ArrayName = new ObjectName

        MonsterTwo[] Monsters = new MonsterTwo[4];

        Monsters[0] = new MonsterTwo(1000, 20, 1, "Frank");
        Monsters[0] = new MonsterTwo(500, 40, 2, "Drac");
        Monsters[0] = new MonsterTwo(1000, 20, 1, "Paul");
        Monsters[0] = new MonsterTwo(1000, 20, 1, "George");

        MonsterTwo.redrawBoard();
    }

}