package play;
public class Speak_text{//親クラス
	boolean preese;
	Speak speak = new Speak();
	static String name;

	 public void run() {}
	 void preese() {}
	 public boolean getPreese() {
		 return preese;
	 }
	 void setname(String name) {
		 this.name = name;
	 }
}

class Epi0 extends Speak_text{
	@Override
	public void run() {
		speak.S("",30);//テンプレ
		speak.S("Spaceキーを押すと次の会話に進みます。", 30);
		speak.S("女子生徒A「なんか最近怖いよねー」", 30);
		speak.S("女子生徒B「なにがー？」", 30);
		speak.S("女子生徒A「あれだよ、あれうわさ」", 30);
		speak.S("女子生徒B「なにそれぇ」", 30);
		speak.S("女子生徒A「南下学校七不思議。知らない？」", 30);
		speak.S("女子生徒B「あー…あれね。でも、ただの”うわさ”でしょ？」",30);
		speak.S("女子生徒A「まあそうだよね。」",30);
		speak.S("？？？「今七不思議って言いました？」",30);
		speak.S("女子生徒A「うわっ！？びっくりした～」",30);
		speak.S("女子生徒B「知り合い？」",30);
		speak.S("女子生徒A「ほら、オカルトオタクで有名な...みさきさん」",30);
		speak.S("みさき「オカルトに興味がおありで？（くいっ）」",30);
		speak.S("女子生徒A「あ！そういえばわたし、先生に呼び出されてるんだったー。」",30);
		speak.S("女子生徒B「そういえば私もそうだったぁ。そ、それじゃ、まあこんどね。ぁははは」",30);
		speak.S("ナレーター：女子生徒はそそくさと帰ってしまった。",30);
		speak.S("みさき「あ、ちょっと...。逃げられちゃったなぁ。」",30);
		speak.S("？？？「部長、そんな詰めたら逃げられるに決まってるじゃないですか。」",30);
		speak.S("みさき「君は甘いんだよ。"+name+"くんっ。」",30);
		speak.S(name+"「そうですかねぇ？」",30);
		speak.S("みさき「うちは（幽霊な部員）がいなきゃ廃部なんだからね。何が何でも集めなきゃ。」",30);
		speak.S(name+"「もう部室に集まってますよ？部長がそんなんでどうするんですか。」",30);
		speak.S("みさき「もうそんな時間？！急がなきゃ。」",30);
		speak.S("[オカルト研究部部室]",100);
		speak.S(name+"「ごめんみんな、部長のいつものあれで遅くなっちゃった。」",30);
		speak.S("みさき「...ごめんね～」",30);
		speak.S("ゆき「みさきさん、遅いよー。」",30);
		speak.S("たけし「・・・」",50);
		speak.S("先生「これで（部員A）さん以外はそろいましたか。」",30);
		speak.S("みさき「今日も具合が悪いそうで...」",30);
		speak.S("先生「...そうか。明日は出席するように伝えてくれ。それでは私は用事があるのでこれで失礼させてもらう。」",30);
		speak.S("一同：「お疲れ様でーす」",30);
		speak.S("・　・　・",50);
		speak.S("みさき「七不思議についてなんだけどさ、ここ最近噂をよく聞くようになったんだよね。」",30);
		speak.S("ゆき「私も。」",30);
		speak.S(name+"（主人公）「僕も。」",30);
		speak.S("たけし「おれも。」",30);
		speak.S("みさき「私その噂をメモにまとめておいたんだ。みんなの分もあるからあげるよ。」",30);
		speak.S(name+"「ありがとう。」",30);
		speak.S("ナレーター：＃MAPの上には七不思議のメモが表示されています。＃",30);
		speak.S("南下校七不思議",30);
		speak.S("  ~1~儀式...深夜０時に五芒星の中心に泥人形を捧げる。",30);
		speak.S(" ~2~動く人体模型・・・理科室内でよなよな自分の体を捜し歩くらしい。",30);
		speak.S("~3~プール・・・入ると引きずり込まれちゃうかも？	",30);
		speak.S("  ~4~音楽室の絵画 ・・・突然にらみつけてくるらしい。",30);
		speak.S("~5~開かずの間・・・地下室にあって異界につなっがてるらしい	",30);
		speak.S("~6~ながら読次郎・・・西大の参考書を読ませてくるらしい	",30);
		speak.S("~7~？？？・・・学校に住み着く何か。どこに出るかも不明",30);
		speak.S(name+ "「開かずの間って地下室にあるんだ～」",30);
		speak.S("「「地下室なんてあったっけ？」」",30);
		speak.S("ゆき「七つ目って何なの？」",30);
		speak.S("みさき「どんなに調べても”学校に住み着く何か”ってことしかわからなかったんだよね。」",30);
		speak.S("ゆき「ふーん…。いいこと思いついた。今日の夜、学校に忍び込んで調べてみない？」",30);
		speak.S("一同：「「！！！」」",30);
		speak.S("たけし「やめようぜ、そ、そんなあぶないこと。怒られちゃうよ。」",30);
		speak.S("みさき「七不思議を私たちが解決…面白そうだね。」",30);
		speak.S(name+"「僕らが解決したら、オカ研も廃部にならずに済みそう。」",30);
		speak.S("ゆき「でしょでしょ！」",30);
		speak.S("たけし「う、うそだよね？俺はいかないよ。」",30);
		speak.S("みさき「みんな強制だからね？」",30);
		speak.S("たけし「みんな・・・うぅ…わかったよ。」",30);
		speak.S("みさき「よし、それじゃあ、今夜10時に学校の裏校門に集合ね！」",30);
		speak.S("ナレーター（主人公視点）：こうして僕らは深夜に学校で七不思議を調査することになった。",30);
		speak.S("セーブなんてない",30);
		speak.S("～第一章～",50);
		speak.S("ナレーター：ここから時折、選択肢が出てきます。",30);
		speak.S("選択によってエンディングが左右するかもしれません。",30);
		speak.S("MAP下のガイドに沿って慎重に選択してください。",30);
		speak.S("同日22時",30);
		speak.S("[学校の裏校門]",30);
		speak.S("みさき「みんな集まった～？」",30);
		speak.S(name+"「はい。」",30);
		speak.S("ゆき「こんばんわー」",30);
		speak.S("たけし「こ、ここんばんゎ..ぁ...」",30);
		speak.S("先生「何してるんだ？」",30);
		speak.S("一同：「うわぁ！」",30);
		speak.S(name+"「「どうしよう？」」",30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}

class Epi1 extends Speak_text{
	public void run() {
		speak.S("Epi1", 30);
		speak.S("123456789",20);
			}
	@Override
	void preese() {
		speak.preese();
	}
	void synchoronized(){

	}
}
class Epi2 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("はいがおされました", 30);
		speak.S("わーい", 30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}
class Epi3 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("いいえがおされました", 30);
		speak.S("おーのー", 30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}
class Epi4 extends Speak_text{
	@Override
	public void run() {
		preese = true;
		speak.S("Epi4", 30);
		speak.S("とりあえず進もう", 30);
			}
	@Override
	void preese() {
		speak.preese();
	}
}

