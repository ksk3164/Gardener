package com.ex2i.gardener

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_flower.*

class FlowerActivity : AppCompatActivity(), OnItemClick {

    private var springFlowerItem: MutableList<Recycler_Data> = mutableListOf()
    private var summerFlowerItem: MutableList<Recycler_Data> = mutableListOf()
    private var fallFlowerItem: MutableList<Recycler_Data> = mutableListOf()
    private var winterFlowerItem: MutableList<Recycler_Data> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower)

        springFlowerItem = mutableListOf(
            Recycler_Data("복수초", R.drawable.flower_boksucho, "슬픈추억"),
            Recycler_Data("산철쭉", R.drawable.flower_sanchoeljjuck, "사랑의 즐거움 또는 줄기찬 번영"),
            Recycler_Data("개나리", R.drawable.flower_gaenari, "희망, 깊은 정, 조춘의 감격, 달성"),
            Recycler_Data(
                "벚나무",
                R.drawable.flower_butnamu,
                "삶의 덧없음과 아름다움, 순결, 뛰어난 아름다움, 절세미인, 정신미, 교양, 부, 그리고 번영"
            ),
            Recycler_Data("민들레", R.drawable.flower_mindeolrae, "감사하는 마음, 내 사랑 그대에게 드려요"),
            Recycler_Data("목련", R.drawable.flower_mokryun, "고귀함, 숭고함"),
            Recycler_Data("자목련", R.drawable.flower_jamokryun, "숭고한 사랑,자연애"),
            Recycler_Data("달래", R.drawable.flower_dalrae, "신념, 청념"),
            Recycler_Data("유채", R.drawable.flower_yuchae, "쾌활"),
            Recycler_Data("영산홍", R.drawable.flower_youngsanhong, "첫사랑"),
            Recycler_Data("모란", R.drawable.flower_moran, "부귀, 영화, 왕자의 품격, 행복한 결혼"),
            Recycler_Data("패랭이꽃", R.drawable.flower_paerangiggot, "순결한 사랑, 재능, 거절"),
            Recycler_Data("산달래", R.drawable.flower_sandalrae, "신선"),
            Recycler_Data("다닥냉이", R.drawable.flower_dadaknaengi, "당신께 모든 것을 맡깁니다."),
            Recycler_Data("팬지", R.drawable.flower_penji, "사색과 나를 생각해 주세요"),
            Recycler_Data("튤립", R.drawable.flower_tyulrip, "빨간색-사랑, 자주색-영원한 사랑, 노란색-짝사랑, 흰색-실연"),
            Recycler_Data("찔레꽃", R.drawable.flower_jjilraeggot, "가족에 대한 그리움, 고독, 신중한 사랑"),
            Recycler_Data("수선화", R.drawable.flower_susunhwa, "자기 사랑, 자존심, 고결, 신비"),
            Recycler_Data("자운영", R.drawable.flower_jawoonyoung, "그대의 관대한 사랑, 나의 행복, 감화"),
            Recycler_Data(
                "히아신스",
                R.drawable.flower_hyasinse,
                "흰색-행복, 빨간색-기억, 노란색-승부, 보라색-비애, 파란색-사랑의 기쁨"
            ),
            Recycler_Data("양지꽃", R.drawable.flower_yangjiggot, "봄날, 행복의 열쇠, 사랑스러움, 그리움"),
            Recycler_Data("삼지구엽초", R.drawable.flower_samjiguyoupcho, "비밀, 당신을 붙잡아 두다,회춘 "),
            Recycler_Data("고깔제비꽃", R.drawable.flower_gokkaljebiggot, "즐거운 생각"),
            Recycler_Data("나도바람꽃", R.drawable.flower_nadobaramggot, "비밀스런사랑"),
            Recycler_Data("노랑무늬붓꽃", R.drawable.flower_norangmooneebootggot, "절제된 아름다움"),
            Recycler_Data("족도리풀", R.drawable.flower_jokdoripool, "모녀의 정"),
            Recycler_Data("은난초", R.drawable.flower_eunnancho, "총명, 청초한 아름다움"),
            Recycler_Data("백선", R.drawable.flower_baekseon, "방어"),
            Recycler_Data("개느삼", R.drawable.flower_gaeneusam, "사랑"),
            Recycler_Data("골무꽃", R.drawable.flower_golmooggot, "의협심, 고귀함")
        )

        summerFlowerItem = mutableListOf(
            Recycler_Data("나팔꽃", R.drawable.flower_napalggot, "기쁜 소식, 결속, 덧없는사랑"),
            Recycler_Data("노루발", R.drawable.flower_norubal, "소녀의기도"),
            Recycler_Data(
                "장미",
                R.drawable.flower_jangmi,
                "빨간-불타는 사랑, 사랑의 비밀, 아름다움\n흰색-존경,순결,순진,매력\n분홍-맹세,단순,행복한 사랑"
            ),
            Recycler_Data("수레국화", R.drawable.flower_sooregookhwa, "행복"),
            Recycler_Data("해바라기", R.drawable.flower_haebaraki, "애모, 당신을 바라봅니다"),
            Recycler_Data("카네이션", R.drawable.flower_kaneishion, "모정,사랑,부인의 애정"),
            Recycler_Data("금낭화", R.drawable.flower_geumnanghwa, "당신을 따르겠습니다"),
            Recycler_Data("메꽃", R.drawable.flower_meggot, "수줍음, 충성"),
            Recycler_Data("싱아", R.drawable.flower_singa, "친근한 정"),
            Recycler_Data("패랭이꽃", R.drawable.flower_paerangiggot, "순결한 사랑, 재능, 거절"),
            Recycler_Data("애기기린초", R.drawable.flower_aegigirincho, "소녀의 사랑, 기다림"),
            Recycler_Data("이질풀", R.drawable.flower_ijilpul, "새색시, 귀감"),
            Recycler_Data("담쟁이덩굴", R.drawable.flower_damjaengideonggul, "우정"),
            Recycler_Data("수정난풀", R.drawable.flower_sujungnanpool, "숲 속의 요정"),
            Recycler_Data("해란초", R.drawable.flower_haerancho, "영원한 사랑"),
            Recycler_Data("무궁화", R.drawable.flower_moogoonghwa, "일편 단심"),
            Recycler_Data("돌양지꽃", R.drawable.flower_dolyangiggot, "행복의 열쇠, 사랑스러움, 그리움"),
            Recycler_Data("글록시니아", R.drawable.flower_geulloksinia, "화려한 모습, 욕망"),
            Recycler_Data("쇠무릎", R.drawable.flower_soemureup, "애교"),
            Recycler_Data("골등골나물", R.drawable.flower_goldeunggolnamul, "주저"),
            Recycler_Data("꽃고비", R.drawable.flower_ggotgobi, "기다림, 돌아와 주세요"),
            Recycler_Data("만병초", R.drawable.flower_manbyuongcho, "위엄, 존엄"),
            Recycler_Data(
                "플록스",
                R.drawable.flower_plox,
                "주의,방심은 금물, 온화, 당신이 나를 불러주었을 때 당신의 꽃이 될 것입니다,열정"
            ),
            Recycler_Data("자주괭이밥", R.drawable.flower_jajugwaengibap, "충실, 정의 기도, 천사"),
            Recycler_Data("말발도리", R.drawable.flower_malbaldori, "애교"),
            Recycler_Data("쑥부쟁이", R.drawable.flower_ssukbujangi, "그리움, 기다림"),
            Recycler_Data("여우팥", R.drawable.flower_yeowoopat, "기다림, 잃어버린 사랑"),
            Recycler_Data("물양지꽃", R.drawable.flower_moolyangiggot, "사랑스러움"),
            Recycler_Data("인동덩굴", R.drawable.flower_indongdunggool, "사랑의 인연")
        )

        fallFlowerItem = mutableListOf(
            Recycler_Data("국화", R.drawable.flower_gukhwa, "빨간 국화는 진실, 노란 국화는 짝사랑·실망, 하얀 국화는 성실·진실"),
            Recycler_Data("코스모스", R.drawable.flower_cosmos, "순정"),
            Recycler_Data("투구꽃", R.drawable.flower_tuguggot, "나를 건드리지 마세요"),
            Recycler_Data("땅귀개", R.drawable.flower_ttanggwigae, "파리의 눈물"),
            Recycler_Data("울릉국화", R.drawable.flower_ulleunggukhwa, "어머님의 사랑"),
            Recycler_Data("자주쓴풀", R.drawable.flower_jajusseunpul, "지각(知覺)"),
            Recycler_Data("각시취", R.drawable.flower_gaksichwi, "연정"),
            Recycler_Data("방울꽃", R.drawable.flower_bangwoolggot, "만족"),
            Recycler_Data("미국쑥부쟁이", R.drawable.flower_migukssukbujaengi, "그리움, 기다림"),
            Recycler_Data("구절초", R.drawable.flower_gujeolcho, "어머니의 사랑과 순수, 고상, 고절"),
            Recycler_Data("한라돌쩌귀", R.drawable.flower_hanradoljjeogwi, "그리움"),
            Recycler_Data("부용", R.drawable.flower_buyong, "섬세한 미모, 미묘한 아름다움"),
            Recycler_Data("분꽃", R.drawable.flower_boonggot, "겁쟁이, 내성적, 소심, 수줍음"),
            Recycler_Data("산비장이", R.drawable.flower_sanbijangi, "추억"),
            Recycler_Data("께묵", R.drawable.flower_kkemuk, ""),
            Recycler_Data("솔체꽃", R.drawable.flower_solcheggot, "이루어질 수 없는 사랑"),
            Recycler_Data("조밥나물", R.drawable.flower_jobapnamul, "눈치가 빠른, 눈썰미가 좋은"),
            Recycler_Data("오이풀", R.drawable.flower_oipool, "존경, 당신을 사모합니다"),
            Recycler_Data("강활", R.drawable.flower_ganghwal, "노여움"),
            Recycler_Data("바디나물", R.drawable.flower_badinamool, ""),
            Recycler_Data("참싸리", R.drawable.flower_chamssari, "은혜"),
            Recycler_Data("사철란", R.drawable.flower_sacheolran, "숲속의 요정"),
            Recycler_Data("소경불알", R.drawable.flower_sogyeongboolal, "성실"),
            Recycler_Data("산씀바귀", R.drawable.flower_sansseumbagwi, "순박"),
            Recycler_Data("눈괴불주머니", R.drawable.flower_nungoebuljumeoni, "보물주머니"),
            Recycler_Data("독활", R.drawable.flower_dokhwal, "애절, 희생"),
            Recycler_Data("꽃향유", R.drawable.flower_ggothyangyu, "가을의 향기"),
            Recycler_Data("개여뀌", R.drawable.flower_gaeyeokkwi, "생각해 주렴"),
            Recycler_Data("쇠서나물", R.drawable.flower_soeseonamul, "발랄")
        )

        winterFlowerItem = mutableListOf(
            Recycler_Data(
                "동백나무",
                R.drawable.flower_dongbaeknamoo,
                "진실한 사랑, 겸손한 마음, 그대를 누구보다도 사랑합니다"
            ),
            Recycler_Data("시클라멘", R.drawable.flower_sikeullamen, "수줍은 사랑"),
            Recycler_Data("베고니아", R.drawable.flower_begonia, "정중, 친절, 짝사랑"),
            Recycler_Data("수선화", R.drawable.flower_susunhwa, "자기 사랑, 자존심, 고결, 신비"),
            Recycler_Data("게발선인장", R.drawable.flower_gebalseoninjang, "불타는 사랑"),
            Recycler_Data("칼랑코에", R.drawable.flower_kallangkoe, "인기, 평판, 설렘"),
            Recycler_Data("군자란", R.drawable.flower_gunjaran, "고결, 고귀, 우아함"),
            Recycler_Data("심비디움", R.drawable.flower_simbidium, "귀부인, 미인, 우아한 여인"),
            Recycler_Data("덴드로비움", R.drawable.flower_dendeurobium, "변덕스러운 미인"),
            Recycler_Data("포인세티아", R.drawable.flower_poinsetia, "내 마음은 타고있어요, 축복합니다, 축하합니다"),
            Recycler_Data("팔레놉시스", R.drawable.flower_palrenopsis, "애정의표시, 당신을 사랑합니다"),
            Recycler_Data("세인트폴리아", R.drawable.flower_saintpolria, "작은사랑, 영원한 사랑, 영원한 우정"),
            Recycler_Data("개쑥갓", R.drawable.flower_gaessookgat, "밀회"),
            Recycler_Data("아프리카봉선화", R.drawable.flower_apricabongsunhwa, "나의 사랑은 당신보다 깊다"),
            Recycler_Data("시네라리아", R.drawable.flower_sineraria, "항상 밝음, 항상 씩씩함")
        )


        when (intent.getStringExtra("season")) {
            "spring" -> {

                tv_title.text = "봄"
                rv_flower.adapter = Adapter(this, springFlowerItem, this)
                rv_flower.layoutManager = LinearLayoutManager(this)

            }
            "summer" -> {

                tv_title.text = "여름"
                rv_flower.adapter = Adapter(this, summerFlowerItem, this)
                rv_flower.layoutManager = LinearLayoutManager(this)
            }
            "fall" -> {

                tv_title.text = "가을"
                rv_flower.adapter = Adapter(this, fallFlowerItem, this)
                rv_flower.layoutManager = LinearLayoutManager(this)
            }
            "winter" -> {

                tv_title.text = "겨울"
                rv_flower.adapter = Adapter(this, winterFlowerItem, this)
                rv_flower.layoutManager = LinearLayoutManager(this)

            }
        }

    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }

    override fun itemOnClick(name: String?, image: Int?, summary: String?) {

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("image", image)
        intent.putExtra("summary", summary)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(intent)

    }

}