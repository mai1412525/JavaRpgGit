package play;
public class Speak_text{//親クラス
	boolean preese;
	Speak speak = new Speak();
	static String name;
	 public void run() {}
	 void preese() {}
	 void setname(String name) {
		 this.name = name;
	 }
	 void skip(){
		 speak.setskip(true);
	 }
}

class Epi0 extends Speak_text{
	@Override
	public void run() {

		speak.setskip(false);
		//speak.S("",30);

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
		speak.S("[オカルト研究部部室]",50);
		speak.S(name+"「ごめんみんな、部長のいつものあれで遅くなっちゃった。」",30);
		speak.S("みさき「...ごめんね～」",30);
		speak.S("ゆき「みさきさん、遅いよー。」",1000);
		speak.S("たけし「・・・」",30);
		speak.S("先生「これで（部員A）さん以外はそろいましたか。」",30);
		speak.S("みさき「今日も具合が悪いそうで...」",30);
		speak.S("先生「...そうか。明日は出席するように伝えてくれ。それでは私は用事があるのでこれで失礼させてもらう。」",30);
		speak.S("一同：「お疲れ様でーす」",30);
		speak.S("・　・　・",200);
		speak.S("みさき「七不思議についてなんだけどさ、ここ最近噂をよく聞くようになったんだよね。」",30);
		speak.S("ゆき「私も。」",30);
		speak.S(name+"「僕も。」",30);
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
		speak.S("～第一章～",30);
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
		speak.S("・・・",200);
			}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}

class Epi1Yes extends Speak_text{
	public void run() {

		speak.setskip(false);
		speak.S(name + "「ここ最近よく耳にする噂を調べに来たんです。」",30);
		speak.S("一同：「「"+name+"！？」」",30);
		speak.S("先生「こんな時間に学校に来るのは感心しないが、」",30);
		speak.S("先生「「ここ最近噂のせいで生徒の授業の妨げになり始めるほどに大きくなっている」」",30);
		speak.S("先生「わかった。入ることを許可する」",30);
		speak.S("先生「ただし、おれも付き添う。」",30);
		speak.S("一同：「「！？」」",30);
		speak.S("先生「異論はないな？」",30);
		speak.S("一同：「ないです…。」",30);


			}
	@Override
	void preese() {
		speak.preese();
	}
	void synchoronized(){

	}
	 void skip(){

		 speak.setskip(true);
	 }
}
class Epi1No extends Speak_text{
	@Override
	public void run() {

		speak.setskip(false);
		speak.S(name+"「部室に忘れ物をして、一人で行くのは怖かったのでみんなに来てもらったところです。」",30);
		speak.S("たけし  ゆき「そ、そうなんです…」",30);
		speak.S("先生「みさき、そうなのか？」",30);
		speak.S("みさき「はい、"+name+"に頼み込まれまして…」",30);
		speak.S("先生「そうか、ちょうど俺も忘れ物を取りに来てな、とってきてやろうか？」",30);
		speak.S(name+"「いえ、大丈夫です。」",30);
		speak.S("先生「取ったら早く帰るんだぞ。カギは渡しておく。カギは俺の机の上においておけ」",30);
		speak.S(name+"「先生の机はどこなんですか？」",30);
		speak.S("先生「俺の机は”左奥から４番目だ」",30);
		speak.S(name+"「わかりました。」",30);
		speak.S("「部室の鍵」を手に入れた。",30);


			}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}
class Epi1_2 extends Speak_text{
	@Override
	public void run() {

		speak.setskip(false);
		speak.S("[オカ研部室]",30);
		if(MainEvent.flag[0]==1) {
			speak.S(name+"「「まさか先生がついてくるとはね…」」",30);
			speak.S("先生「それでどうするんだ？",30);
		}
		speak.S("みさき「よしっ」",30);
		speak.S(name+"「それってこれ？頭ないけど」",30);
		speak.S(name+"は頭のない泥人形に指を刺した。",30);
		speak.S("ゆき「ヒァ！？」",30);
		speak.S("みさき「そんなはずは…。まあ、0時まで時間はあるし、頭を探しつつほかの七不思議を調査しちゃおう！」",30);
		speak.S("たけし「二手に分かれる？ほ、ほら、そのほうが早く解決して帰れるじゃん？」",30);
		speak.S("みさき「わたしは反対かなぁ。なぜならすべての七不思議を見たいからね！！」",30);
		speak.S("ゆき「わたしはたけし君に賛成〜。そのほうが探索効率があがるからね」",30);
		if(MainEvent.flag[0]==1) {
			speak.S("先生「おれは部室に残って頭とやらを探しておく」",30);
		}
		speak.S("みさき"+name+"くん。君はどう思う？君に任せるよ」",30);
		speak.S("・・・",500);
			}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}
class Epi1_2Yes extends Speak_text{
	@Override
	public void run() {
		speak.setskip(false);
		speak.S(name+"「二手に分かれよう。」",30);
		speak.S("みさき「…:( •ᾥ•):、それじゃぁ、10分前にここに集合ね」",30);
		speak.S("みさき「わたしと"+name+"は理科室にいくから、」",30);
		speak.S(name+"「ぼくの意見は、、」",30);
		speak.S("ゆき「わたしも"+name+"と行動したい...な」",30);
		speak.S("みさき「じゃあここはオカルトらしくダイスで決めようか」",30);
		speak.S("ゆき「いいよ…わたし奇数選ぶ」",30);
		speak.S("みさき「じゃあ私は偶数のほうか。外れても恨みっこなしだよー」",30);
		speak.S("ゆき「うん…」",30);
		speak.S("サイコロは「４」を上にした。",30);
		speak.S("みさき「よしっ！！」",30);
		speak.S("ゆき「…」",30);
		speak.S("みさき「じゃあたけしとゆきはプールのほうをヨロシク。じゃーねー」",30);
		speak.S("ゆき「...うぅ…ほらっ、たけし君いくよー」",30);
		speak.S("たけし「はやくおわってくれぇ」",30);

			}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}
class Epi1_2No extends Speak_text{
	@Override
	public void run() {
		speak.setskip(false);
		speak.S(name+"「一緒に行動した方がいいと思う」",30);
		speak.S("みさき「やっぱりそう思うよね！わかっておりますな」",30);
		speak.S("ゆき"+name+"がそういうなら…」",30);
		speak.S("たけし「調査してこんなところはやくでようぜ…」",30);
		speak.S("[理科室前]",50);
		speak.S("ゆき「…」",30);
		speak.S("みさき「人体模型があるのは準備室だよー」",30);
		speak.S("たけし「帰りたい。」",30);
		speak.S(name+"「まぁまぁ、すぐだからがんばろうな」",30);
		speak.S("みさき「それじゃあ、いきますか。」",30);
			}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}

class Epi1_3Yes extends Speak_text{//みんながいる場合
	@Override
	public void run() {
		speak.setskip(false);
		//ここに会話を入力
		speak.S("",30);

		}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}

class Epi1_3No extends Speak_text{//みさきと主人公が2人きりの場合
	@Override
	public void run() {
		speak.setskip(false);
		//ここに会話を入力
		speak.S("",30);

		}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}


