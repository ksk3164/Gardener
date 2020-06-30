package com.ex2i.gardener

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_succulent.*

class SucculentActivity : AppCompatActivity(), OnItemClick {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_succulent)

        tv_title.text = intent.getStringExtra("succulent")

        val succluentItem: MutableList<Recycler_Data> = mutableListOf(
            Recycler_Data("레티지아",R.drawable.succulent_fpxlwldk,"햇빛 많이보여주기,통풍이 좋아야 하지만 한여름의 직광은 피하는것이 좋아요,물은 아래 잎이 힘이 빠져 보이거나 주름이 많이 잡히면 배수구로 물이 흘러 나올 정도로 주세요"),
            Recycler_Data("누다",R.drawable.succulent_snek,"햇빛을 좋아 해요, 통풍이 좋아야 하고 화분의 흙이 바짝 마르면 물을 주세요, 과습하지 않도록 주의해주세요!"),
            Recycler_Data("프리티",R.drawable.succulent_vmflxl,"햇빛을 좋아해요, 통풍이 좋아야해요, 물주기는 봄,가을 1달에 1회/여름 1달 반~2달에 1회/ 장마철과 겨울엔 물주기 중단"),
            Recycler_Data("문가드니스",R.drawable.succulent_ansrkemsltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("스노우바니",R.drawable.succulent_tmshdnqksl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("메비나",R.drawable.succulent_apqlsk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("붉은솜털바위솔",R.drawable.succulent_qnfrdmsthaxjfqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("벽어연",R.drawable.succulent_qurdjdus,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("십자성",R.drawable.succulent_tlqwktjd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("티피",R.drawable.succulent_xlvl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("오층탑",R.drawable.succulent_dhcmdxkq,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("염자",R.drawable.succulent_duawk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("오리온",R.drawable.succulent_dhfldhs,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("정야",R.drawable.succulent_wjddi,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("치와와엔시스",R.drawable.succulent_cldhkdhkdpstltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("특엽옥접",R.drawable.succulent_xmrduqdhrwjq,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("렉스",R.drawable.succulent_fprtm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("정야금",R.drawable.succulent_wjddirma,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("옵튜샤",R.drawable.succulent_dhqxbti,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("황파",R.drawable.succulent_ghkdvk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("올리비아",R.drawable.succulent_dhfflqldk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("블루서프라이즈",R.drawable.succulent_qmffntjvmfkdlwm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("보초",R.drawable.succulent_qhch,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("이사벨라",R.drawable.succulent_dltkqpffk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("자보",R.drawable.succulent_wkqh,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("호빗",R.drawable.succulent_ghqlt,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("러블리로즈",R.drawable.succulent_fjqmfflfhwm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("플렉트란투스",R.drawable.succulent_vmffprxmfksxntm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("핑크팁스",R.drawable.succulent_vldzmxlqtm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("언성",R.drawable.succulent_djstjd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("런요니",R.drawable.succulent_fjsdysl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("문페어리",R.drawable.succulent_ansvpdjfl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("덴트라잼",R.drawable.succulent_epsxmfkwoa,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("온둘라타",R.drawable.succulent_dhsenffkxk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("블루엘프",R.drawable.succulent_qmffndpfvm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("월동자",R.drawable.succulent_dnjfehdwk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("유접곡",R.drawable.succulent_dbwjqrhr,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("로라",R.drawable.succulent_fhfk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("산타루이스",R.drawable.succulent_tksxkfndltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("천금장",R.drawable.succulent_cjsrmawkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("라일락",R.drawable.succulent_fkdlffkr,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("크라시엔 라이언",R.drawable.succulent_zmfktldpsfkdldjs,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("온슬로우",R.drawable.succulent_dhstmffhdn,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("프리렌제",R.drawable.succulent_vmflfpswp,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("핑크루비",R.drawable.succulent_vldzmfnql,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("천대전송",R.drawable.succulent_cjseowjsthd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("멕시칸스노우볼",R.drawable.succulent_aprtlzkstmshdnqhf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("지로",R.drawable.succulent_wlfh,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("미파",R.drawable.succulent_alvk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("금사황",R.drawable.succulent_rmatkghkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("방울복랑",R.drawable.succulent_qkddnfqhrfkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("먼로",R.drawable.succulent_ajsfh,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("볼켄시",R.drawable.succulent_qhfzpstl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("월토이",R.drawable.succulent_dnjfxhdl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("블랙베리",R.drawable.succulent_qmfforqpfl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("수연",R.drawable.succulent_tndus,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("벤바디스",R.drawable.succulent_qpsqkeltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("에그린원",R.drawable.succulent_dprmflsdnjs,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("성을녀",R.drawable.succulent_tjddmfsu,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("여미월",R.drawable.succulent_dualdnjf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("피핀바위솔",R.drawable.succulent_vlvlsqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("블랙탑 바위솔",R.drawable.succulent_qmfforxkqqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("쥬얼리 바위솔",R.drawable.succulent_wbdjfflqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("칼카리움 바위솔",R.drawable.succulent_zkfzkfldnaqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("거미줄 바위솔",R.drawable.succulent_rjalwnfqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("윌리엄 바위솔",R.drawable.succulent_dnlffldjaqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("호랑이발톱바위솔",R.drawable.succulent_ghfkddlqkfxhqqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("백혜 바위솔",R.drawable.succulent_qorgpqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("루즈 바위솔",R.drawable.succulent_fnwmqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("능견 바위솔",R.drawable.succulent_smdrusqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("썬버스트 바위솔",R.drawable.succulent_tjsqjtmxmqkdnlthf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("홍대화금",R.drawable.succulent_ghdeoghkrma,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("십이지권",R.drawable.succulent_tlqdlwlrnjs,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("콩란",R.drawable.succulent_zhdfks,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("천구지묘",R.drawable.succulent_cjsrnwlay,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("독일바이올렛퀸",R.drawable.succulent_ehrdlfqkdldhffptznls,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("희성",R.drawable.succulent_gmltjd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("아보카도크림",R.drawable.succulent_dkqhzkehzmfla,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("아메치스",R.drawable.succulent_dkapcltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("룬데리",R.drawable.succulent_fnsepfl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("아드레미쳐스",R.drawable.succulent_dkemfpalcutm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("하트호야",R.drawable.succulent_gkxmghdi,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("큐빅",R.drawable.succulent_zbqlr,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("부다템플",R.drawable.succulent_qnekxpavmf,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("레몬베리",R.drawable.succulent_fpahsqpfl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("리톱스",R.drawable.succulent_flxhqtm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("브레이브",R.drawable.succulent_qmfpdlqm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("아이시그린",R.drawable.succulent_dkdltlrmfls,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("피어리스",R.drawable.succulent_vldjfltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("베이비핑거",R.drawable.succulent_qpdlqlvldrj,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("루밍",R.drawable.succulent_fnald,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("자옥로",R.drawable.succulent_wkdhrfh,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("원종에보니",R.drawable.succulent_dnjswhddpqhsl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("용발톱",R.drawable.succulent_dydqkfxhq,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("립살리스카수다",R.drawable.succulent_flqtkffltmzktnek,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("수자나에",R.drawable.succulent_tnwkskdp,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("축전",R.drawable.succulent_cnrwjs,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!")
        )

        val cactusItem: MutableList<Recycler_Data> = mutableListOf(
            Recycler_Data("황금사",R.drawable.cactus_ghkdrmatk,"햇빛 많이보여주기,통풍이 좋아야 하지만 한여름의 직광은 피하는것이 좋아요,물은 아래 잎이 힘이 빠져 보이거나 주름이 많이 잡히면 배수구로 물이 흘러 나올 정도로 주세요"),
            Recycler_Data("마블",R.drawable.cactus_akqmf,"햇빛을 좋아 해요, 통풍이 좋아야 하고 화분의 흙이 바짝 마르면 물을 주세요, 과습하지 않도록 주의해주세요!"),
            Recycler_Data("덴섬",R.drawable.cactus_epstja,"햇빛을 좋아해요, 통풍이 좋아야해요, 물주기는 봄,가을 1달에 1회/여름 1달 반~2달에 1회/ 장마철과 겨울엔 물주기 중단"),
            Recycler_Data("장군선인장",R.drawable.cactus_wkdrnstjsdlswkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("희기린",R.drawable.cactus_gmlrlfls,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("백단선인장",R.drawable.cactus_qorekstjsdlswkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("백도선선인장",R.drawable.cactus_qorehtjstjsdlswkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("귀면각선인장",R.drawable.cactus_rnlausrkr,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("알바선인장",R.drawable.cactus_dkfqktjsdlswkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("눈꽃선인장",R.drawable.cactus_snsrhctjsdlswkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("아즈레우즈",R.drawable.cactus_dkwmfpdnwm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("기선옥선인장",R.drawable.cactus_rltjsdhrtjsdlswkd,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("치치페그린",R.drawable.cactus_clclvprmfls,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("톨루카",R.drawable.cactus_xhffnzk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("두웨이",R.drawable.cactus_endnpdl,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("아즐렌시스",R.drawable.cactus_dkwmffpstltm,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("오베사",R.drawable.cactus_dhqptk,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!"),
            Recycler_Data("반야",R.drawable.cactus_qksdi,"햇빛을 좋아해요, 통풍이 잘되야해요, 물주기는 잎과 흙이 말랐다 싶을 정도에 물을 흠뻑 한번 주세요!")

            )

        if (intent.getStringExtra("succulent") == "다육식물"){

            rv_succluent.adapter =
                Adapter2(this, succluentItem, this)
        } else {
            rv_succluent.adapter =
                Adapter2(this, cactusItem, this)
        }

        rv_succluent.layoutManager = GridLayoutManager(this, 3)

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