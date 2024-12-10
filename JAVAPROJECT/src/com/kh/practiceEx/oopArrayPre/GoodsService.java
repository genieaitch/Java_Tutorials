package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class GoodsService {
    //상품들을 담을 목록 리스트
    private ArrayList<Goods> goodsList = new ArrayList<>();

    /**
     * public void addGoods(Goods goods) 상품 추가 기능 (Goods에 존재하는 번호 이름 수량 가격 추가)
     *
     * @param goods (Goods에 존재하는 번호 이름 수량 가격 추가)
     */
    public void addGoods(Goods goods) {
        goodsList.add(goods);
        System.out.println(goods.getName() + "상품이 추가되었습니다.");
    }

    /**
     * Goods getGoodsId(int id) 상품전달 상품 번호로 원하는 상품 가져오기 기능(상품번호)
     *
     * @param id 상품 번호
     * @return 상품 번호에 해당하는 Goods 상품을 사용자에게 전달 Goods = 번호, 이름, 수량, 가격 포함
     */
    public Goods getGoodsId(int id) {
        for (Goods goods : goodsList) {
            if (goods.getId() == id) {
                return goods;
            }
        }
        System.out.println("상품" + id + "에 해당하는 상품을 찾을 수 없습니다.");
        return null; // 상품번호로 해당하는 상품이 없을 경우 빈 값 전달하기
    }

    /** todo : getGoodsByName(String name) 상품명으로 상품 조회
     *
     * @param name 상품이름 값을 받아서 조회
     * @return Goods로 상품이름에 해당하는 상품이 존재하면 전달
     * Goods = 상품번호 상품이름 상품가격 상품수량이 들어있음
     */
    public Goods getGoodsByName(String name) {
        for (Goods goods : goodsList) {
            if (goods.getName().equalsIgnoreCase(name)) { //equalsIgnoreCase 사용 대소문자 구분없이 검색
                return goods;
            }
        }
        System.out.println(name + "존재하는 상품이 없습니다.");
        return null;
    }

    /**
     * void displayAllGoods(매개변수 없음) 모든 상품 보기 기능
     * 매개변수 없음
     * 상품을 조회했을 때 상품 리스트가 존재하지 않는다면 → 상품 없음 출력
     * 상품 존재 유무는 isEmpty() 기능을 활용해서 목록이 비어있는지 확인 후 결과 출력
     */
    public void displayAllGoods() {
        if (goodsList.isEmpty()) {
            System.out.println("존재하는 상품이 없습니다.");
        } else {
            System.out.println("====상품 리스트====");
            for (Goods goods : goodsList) {
                System.out.println(goods);
            }
        }
    }


    /**
     * void removeGoodsById (int id) 삭제하기 기능(상품번호)
     *
     * @param id 상품번호로 조회된 상품 삭제
     */
    public void removeGoodsById(int id) {
        //만약에 제거할 상품번호가 존재하지 않는다면
        //Goods toGoods = null; 상품번호로 상품들을 조회했을 때 Goods 안이 텅 비어서 null 값이라면?
        Goods toGoods = new Goods();
        if (toGoods.getId() == id) {
            goodsList.remove(toGoods);
        }
        //만약에 toGoods가 null이 아닐 때 null일 때 System 출력문 작성
        if (toGoods == null) {
            System.out.println("상품번호" + id + "로 조회된 상품이 존재하지 않아 삭제할 수 없습니다.");
        } else {
            System.out.println("상품번호" + id + "에 해당하는 상품을 제거했습니다.");
        }
    }
}
