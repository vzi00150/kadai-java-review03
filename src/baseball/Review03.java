package baseball;

public class Review03 {

    public static void main(String[] args) {
        // 東京ヤクルトスワローズのインスタンス
        BaseBallTeam tokyo = new BaseBallTeam();
        tokyo.setName("東京ヤクルトスワローズ");
        tokyo.setWin(80);
        tokyo.setLose(59);
        tokyo.setDraw(4);
        tokyo.report();

        // 横浜DeNAベイスターズのインスタンス
        BaseBallTeam yokohama = new BaseBallTeam();
        yokohama.setName("横浜DeNAベイスターズ");
        yokohama.setWin(73);
        yokohama.setLose(68);
        yokohama.setDraw(2);
        yokohama.report();

        // 阪神タイガースのインスタンス
        BaseBallTeam hanshin = new BaseBallTeam();
        hanshin.setName("阪神タイガース");
        hanshin.setWin(68);
        hanshin.setLose(71);
        hanshin.setDraw(4);
        hanshin.report();

        // 読売ジャイアンツのインスタンス
        BaseBallTeam yomiuri = new BaseBallTeam();
        yomiuri.setName("読売ジャイアンツ");
        yomiuri.setWin(68);
        yomiuri.setLose(72);
        yomiuri.setDraw(3);
        yomiuri.report();

        // 広島東洋カープのインスタンス
        BaseBallTeam hiroshima = new BaseBallTeam();
        hiroshima.setName("広島東洋カープ");
        hiroshima.setWin(66);
        hiroshima.setLose(74);
        hiroshima.setDraw(3);
        hiroshima.report();

        // 中日ドラゴンズのインスタンス
        BaseBallTeam cyunichi = new BaseBallTeam();
        cyunichi.setName("中日ドラゴンズ");
        cyunichi.setWin(66);
        cyunichi.setLose(75);
        cyunichi.setDraw(2);
        cyunichi.report();

    }

}
