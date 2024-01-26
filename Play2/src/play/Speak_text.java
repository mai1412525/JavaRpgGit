package play;
public class Speak_text{//親クラス
	boolean preese;
	Speak speak = new Speak();
	static String name;
	static int speed;//スピードを変える
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
		speed = 30;
		speak.setskip(false);
		//speak.S("",speed);
		speak.S("Spaceキーを押すと次の会話に進みます。", speed);
		speak.S("女子生徒A「なんか最近怖いよねー」", speed);
		speak.S("女子生徒B「なにがー？」", speed);
		speak.S("女子生徒A「あれだよ、あれうわさ」", speed);
		speak.S("女子生徒B「なにそれぇ」", speed);
		speak.S("女子生徒A「南下学校七不思議。知らない？」", speed);
		speak.S("女子生徒B「あー…あれね。でも、ただの”うわさ”でしょ？」",speed);
		speak.S("女子生徒A「まあそうだよね。」",speed);
		speak.S("？？？「今七不思議って言いました？」",speed);
		speak.S("女子生徒A「うわっ！？びっくりした～」",speed);
		speak.S("女子生徒B「知り合い？」",speed);
		speak.S("女子生徒A「ほら、オカルトオタクで有名な...みさきさん」",speed);
		speak.S("みさき「オカルトに興味がおありで？（くいっ）」",speed);
		speak.S("女子生徒A「あ！そういえばわたし、先生に呼び出されてるんだったー。」",speed);
		speak.S("女子生徒B「そういえば私もそうだったぁ。そ、それじゃ、まあこんどね。ぁははは」",speed);
		speak.S("ナレーター：女子生徒はそそくさと帰ってしまった。",speed);
		speak.S("みさき「あ、ちょっと...。逃げられちゃったなぁ。」",speed);
		speak.S("？？？「部長、そんな詰めたら逃げられるに決まってるじゃないですか。」",speed);
		speak.S("みさき「君は甘いんだよ。"+name+"くんっ。」",speed);
		speak.S(name+"「そうですかねぇ？」",speed);
		speak.S("みさき「うちは（幽霊な部員）がいなきゃ廃部なんだからね。何が何でも集めなきゃ。」",speed);
		speak.S(name+"「もう部室に集まってますよ？部長がそんなんでどうするんですか。」",speed);
		speak.S("みさき「もうそんな時間？！急がなきゃ。」",speed);
		speak.S("[オカルト研究部部室]",50);
		speak.S(name+"「ごめんみんな、部長のいつものあれで遅くなっちゃった。」",speed);
		speak.S("みさき「...ごめんね～」",speed);
		speak.S("ゆき「みさきさん、遅いよー。」",speed);
		speak.S("たけし「・・・」",speed);
		speak.S("先生「これで（部員A）さん以外はそろいましたか。」",speed);
		speak.S("みさき「今日も具合が悪いそうで...」",speed);
		speak.S("先生「...そうか。明日は出席するように伝えてくれ。それでは私は用事があるのでこれで失礼させてもらう。」",speed);
		speak.S("一同：「お疲れ様でーす」",speed);
		speak.S("・　・　・",200);
		speak.S("みさき「七不思議についてなんだけどさ、ここ最近噂をよく聞くようになったんだよね。」",speed);
		speak.S("ゆき「私も。」",speed);
		speak.S(name+"「僕も。」",speed);
		speak.S("たけし「おれも。」",speed);
		speak.S("みさき「私その噂をメモにまとめておいたんだ。みんなの分もあるからあげるよ。」",speed);
		speak.S(name+"「ありがとう。」",speed);
		speak.S("ナレーター：＃MAPの上には七不思議のメモが表示されています。＃",speed);
		speak.S("南下校七不思議",speed);
		speak.S("  ~1~儀式...深夜０時に五芒星の中心に泥人形を捧げる。",speed);
		speak.S(" ~2~動く人体模型・・・理科室内でよなよな自分の体を捜し歩くらしい。",speed);
		speak.S("~3~プール・・・入ると引きずり込まれちゃうかも？	",speed);
		speak.S("  ~4~音楽室の絵画 ・・・突然にらみつけてくるらしい。",speed);
		speak.S("~5~開かずの間・・・地下室にあって異界につなっがてるらしい	",speed);
		speak.S("~6~ながら読次郎・・・西大の参考書を読ませてくるらしい	",speed);
		speak.S("~7~？？？・・・学校に住み着く何か。どこに出るかも不明",speed);
		speak.S(name+ "「開かずの間って地下室にあるんだ～」",speed);
		speak.S("「「地下室なんてあったっけ？」」",speed);
		speak.S("ゆき「七つ目って何なの？」",speed);
		speak.S("みさき「どんなに調べても”学校に住み着く何か”ってことしかわからなかったんだよね。」",speed);
		speak.S("ゆき「ふーん…。いいこと思いついた。今日の夜、学校に忍び込んで調べてみない？」",speed);
		speak.S("一同：「「！！！」」",speed);
		speak.S("たけし「やめようぜ、そ、そんなあぶないこと。怒られちゃうよ。」",speed);
		speak.S("みさき「七不思議を私たちが解決…面白そうだね。」",speed);
		speak.S(name+"「僕らが解決したら、オカ研も廃部にならずに済みそう。」",speed);
		speak.S("ゆき「でしょでしょ！」",speed);
		speak.S("たけし「う、うそだよね？俺はいかないよ。」",speed);
		speak.S("みさき「みんな強制だからね？」",speed);
		speak.S("たけし「みんな・・・うぅ…わかったよ。」",speed);
		speak.S("みさき「よし、それじゃあ、今夜10時に学校の裏校門に集合ね！」",speed);
		speak.S("ナレーター（主人公視点）：こうして僕らは深夜に学校で七不思議を調査することになった。",speed);
		speak.S("セーブなんてない",speed);
		speak.S("～第一章～",speed);
		speak.S("ナレーター：ここから時折、選択肢が出てきます。",speed);
		speak.S("選択によってエンディングが左右するかもしれません。",speed);
		speak.S("MAP下のガイドに沿って慎重に選択してください。",speed);
		speak.S("同日22時",speed);
		speak.S("[学校の裏校門]",speed);
		speak.S("みさき「みんな集まった～？」",speed);
		speak.S(name+"「はい。」",speed);
		speak.S("ゆき「こんばんわー」",speed);
		speak.S("たけし「こ、ここんばんゎ..ぁ...」",speed);
		speak.S("先生「何してるんだ？」",speed);
		speak.S("一同：「うわぁ！」",speed);
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
		speed = 30;
		speak.setskip(false);
		speak.S(name + "「ここ最近よく耳にする噂を調べに来たんです。」",speed);
		speak.S("一同：「「"+name+"！？」」",speed);
		speak.S("先生「こんな時間に学校に来るのは感心しないが、」",speed);
		speak.S("先生「「ここ最近噂のせいで生徒の授業の妨げになり始めるほどに大きくなっている」」",speed);
		speak.S("先生「わかった。入ることを許可する」",speed);
		speak.S("先生「ただし、おれも付き添う。」",speed);
		speak.S("一同：「「！？」」",speed);
		speak.S("先生「異論はないな？」",speed);
		speak.S("一同：「ないです…。」",speed);


			}
	@Override
	void preese() {
		speak.preese();
	}
	void synchoronized(){

	}
	 void skip(){
		 speed = 0;
		 speak.setskip(true);
	 }
}
class Epi1No extends Speak_text{
	@Override
	public void run() {
		speed = 30;
		speak.setskip(false);
		speak.S(name+"「部室に忘れ物をして、一人で行くのは怖かったのでみんなに来てもらったところです。」",speed);
		speak.S("たけし  ゆき「そ、そうなんです…」",speed);
		speak.S("先生「みさき、そうなのか？」",speed);
		speak.S("みさき「はい、"+name+"に頼み込まれまして…」",speed);
		speak.S("先生「そうか、ちょうど俺も忘れ物を取りに来てな、とってきてやろうか？」",speed);
		speak.S(name+"「いえ、大丈夫です。」",speed);
		speak.S("先生「取ったら早く帰るんだぞ。カギは渡しておく。カギは俺の机の上においておけ」",speed);
		speak.S(name+"「先生の机はどこなんですか？」",speed);
		speak.S("先生「俺の机は”左奥から４番目だ」",speed);
		speak.S(name+"「わかりました。」",speed);
		speak.S("「部室の鍵」を手に入れた。",speed);


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
		speed = 30;
		speak.setskip(false);
		speak.S("[オカ研部室]",speed);
		if(MainEvent.flag[0]==1) {
			speak.S(name+"「「まさか先生がついてくるとはね…」」",speed);
			speak.S("先生「それでどうするんだ？",speed);
		}
		speak.S("みさき「よしっ」",speed);
		speak.S(name+"「それってこれ？頭ないけど」",speed);
		speak.S(name+"は頭のない泥人形に指を刺した。",speed);
		speak.S("ゆき「ヒァ！？」",speed);
		speak.S("みさき「そんなはずは…。まあ、0時まで時間はあるし、頭を探しつつほかの七不思議を調査しちゃおう！」",speed);
		speak.S("たけし「二手に分かれる？ほ、ほら、そのほうが早く解決して帰れるじゃん？」",speed);
		speak.S("みさき「わたしは反対かなぁ。なぜならすべての七不思議を見たいからね！！」",speed);
		speak.S("ゆき「わたしはたけし君に賛成〜。そのほうが探索効率があがるからね」",speed);
		if(MainEvent.flag[0]==1) {
			speak.S("先生「おれは部室に残って頭とやらを探しておく」",speed);
		}
		speak.S("みさき"+name+"くん。君はどう思う？君に任せるよ」",speed);
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
		speed = 30;
		speak.setskip(false);
		speak.S(name+"「二手に分かれよう。」",speed);
		speak.S("みさき「…:( •ᾥ•):、それじゃぁ、10分前にここに集合ね」",speed);
		speak.S("みさき「わたしと"+name+"は理科室にいくから、」",speed);
		speak.S(name+"「ぼくの意見は、、」",speed);
		speak.S("ゆき「わたしも"+name+"と行動したい...な」",speed);
		speak.S("みさき「じゃあここはオカルトらしくダイスで決めようか」",speed);
		speak.S("ゆき「いいよ…わたし奇数選ぶ」",speed);
		speak.S("みさき「じゃあ私は偶数のほうか。外れても恨みっこなしだよー」",speed);
		speak.S("ゆき「うん…」",speed);
		speak.S("サイコロは「４」を上にした。",speed);
		speak.S("みさき「よしっ！！」",speed);
		speak.S("ゆき「…」",speed);
		speak.S("みさき「じゃあたけしとゆきはプールのほうをヨロシク。じゃーねー」",speed);
		speak.S("ゆき「...うぅ…ほらっ、たけし君いくよー」",speed);
		speak.S("たけし「はやくおわってくれぇ」",speed);

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
		speed = 30;
		speak.setskip(false);
		speak.S(name+"「一緒に行動した方がいいと思う」",speed);
		speak.S("みさき「やっぱりそう思うよね！わかっておりますな」",speed);
		speak.S("ゆき"+name+"がそういうなら…」",speed);
		speak.S("たけし「調査してこんなところはやくでようぜ…」",speed);
		speak.S("[理科室前]",50);
		speak.S("ゆき「…」",speed);
		speak.S("みさき「人体模型があるのは準備室だよー」",speed);
		speak.S("たけし「帰りたい。」",speed);
		speak.S(name+"「まぁまぁ、すぐだからがんばろうな」",speed);
		speak.S("みさき「それじゃあ、いきますか。」",speed);
			}
	@Override
	void preese() {
		speak.preese();
	}
	 void skip(){
		 speak.setskip(true);
	 }
}

