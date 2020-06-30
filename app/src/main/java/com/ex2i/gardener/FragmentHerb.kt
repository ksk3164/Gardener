package com.ex2i.gardener

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class FragmentHerb : Fragment(), OnHerbItemClick {

    private var herbItem: MutableList<Recycler_Data2> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_herb, container, false)
        val context: Context = view.context

        val rv_herb = view.findViewById<RecyclerView>(R.id.rv_herb)

        herbItem = mutableListOf(
            Recycler_Data2(
                "로즈메리",
                R.drawable.herb_fhwmakfl,
                "상큼하고 강렬한 향",
                "살균/소독/방충작용, 신경통/두통 완화",
                "수프, 소시지, 육류요리, 화장품(향수,화장수)"
            ),
            Recycler_Data2(
                "바질",
                R.drawable.herb_qkwlf,
                "향긋하며 달콤한 향, 약간 매운맛",
                "비만/노화방지, 소화불량 해소, 이뇨작용",
                "토마토 요리, 샐러드, 소스, 닭고기요리, 생선요리"
            ),
            Recycler_Data2(
                "고수",
                R.drawable.herb_rhtn,
                "잎:매운맛,버터향 씨:달고 매운맛,감귤 향",
                "식욕증진, 위장염/위통 감소",
                "쌀국수, 샐러드드레싱, 샐러드, 찜요리, 가금류 요리, 생선요리"
            ),
            Recycler_Data2(
                "레몬그라스",
                R.drawable.herb_fpahsrmfktm,
                "신맛, 레몬향",
                "소화촉진, 빈혈완화, 살균작용",
                "수프, 소스, 생선요리, 약품, 향수, 목욕제품"
            ),
            Recycler_Data2(
                "루꼴라",
                R.drawable.herb_fnrhffk,
                "매운맛, 참깨 향",
                "이뇨작용, 위통진정",
                "샐러드, 차"
            ),
            Recycler_Data2(
                "파슬리",
                R.drawable.herb_vktmffl,
                "상큼한 맛, 진한 풀 향",
                "소화촉진, 간장해독, 이뇨작용, 류머티즘 완화",
                "샐러드, 수프, 생선요리, 육류요리"
            ),
            Recycler_Data2(
                "민트",
                R.drawable.herb_dovmfalsxm,
                "매운맛, 상쾌한 향",
                "호흡기질환/소화불량 개선",
                "제과류(껌, 초콜릿), 피클류, 방향제"
            ),
            Recycler_Data2(
                "타임",
                R.drawable.herb_xkdla,
                "달콤한 맛, 상큼한 소나무 향",
                "방향, 방부, 두통/빈혈/우울증 개선",
                "육류, 소스, 햄, 맥주"
            ),
            Recycler_Data2(
                "딜",
                R.drawable.herb_elf,
                "단맛, 캐러웨이 같은 상쾌한 향",
                "소화촉진, 구취제거, 동맥경화/당뇨/고혈압 예방",
                "빵, 생연어 등 생선요리, 조개요리"
            ),
            Recycler_Data2(
                "차이브",
                R.drawable.herb_ckdlqm,
                "톡 쏘는 양파 향",
                "강장작용, 혈압 강하, 빈혈 예방",
                "샐러드, 수프, 드레싱, 장식용"
            ),
            Recycler_Data2(
                "타라곤",
                R.drawable.herb_xkfkrhs,
                "쌉쌀하고 매콤한 맛, 달콤한 후추 향",
                "강장작용, 해독효과, 소화촉진, 식용증진",
                "소스, 샐러드드레싱, 샐러드, 식초, 달걀요리"
            ),
            Recycler_Data2(
                "오레가노",
                R.drawable.herb_dhfprksh,
                "톡 쏘는 맛, 달콤한 향",
                "해독작용, 류머티즘/두통/객담/감기 개선",
                "토마토소스, 파스타, 치즈, 육류요리"
            ),
            Recycler_Data2(
                "라벤더",
                R.drawable.herb_fkqpsej,
                "",
                "진정 작용, 진통/두통 해소, 기분 전환, 숙면 유도, 향균 작용/고혈압에 효과",
                "관상, 향수와 화장품, 요리"
            ),
            Recycler_Data2(
                "캐모마일",
                R.drawable.herb_zoahakdlf,
                "달콤하고 상쾌한 사과향",
                "차로 즐기거나 목욕, 미용, 습포 등에 이용하며, 방충, 진정, 진경, 진통, 발한, 소화촉진, 피로회복 등에 효과",
                "땅에서 나는 사과라는 뜻의 이름"
            )
        )

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        rv_herb.adapter =
            Adapter3(context, herbItem, this)
        rv_herb.layoutManager = layoutManager

        return view
    }

    override fun itemOnClick(
        name: String?,
        image: Int?,
        summary: String?,
        effecacy: String?,
        purpose: String?
    ) {
        val intent = Intent(context, DetailActivityHerb::class.java)
        intent.putExtra("name", name)
        intent.putExtra("image", image)
        intent.putExtra("summary", summary)
        intent.putExtra("effecacy", effecacy)
        intent.putExtra("purpose", purpose)
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        startActivity(intent)
    }

}