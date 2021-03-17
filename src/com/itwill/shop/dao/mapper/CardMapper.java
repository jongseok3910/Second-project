package com.itwill.shop.dao.mapper;

import java.util.List;

import com.itwill.shop.domain.Card;

public interface CardMapper {
	/*
	 * 인터페이스의 풀네임은 StudentMapper.xml의 namespace와일치
	 * 메쏘드이름은 	StudentMapper.xml 파일의 id와일치
	 * 메쏘드인자타입은 StudentMapper.xml 파일의 parameterType 와일치
	 * 메쏘드리턴타입은 StudentMapper.xml 파일의 resultType 와일치(ResultSet이 한 개 이상일 경우 반환타입이 List이다)
	 */
	
	public Card findCardByNo(Integer cardNo) throws Exception;
	/*
 	<select id=findCardByNo" parameterType="int" resultMap=cardResultMap">
		select * from card where card_no = #{cardNo}
	</select>
	 */
	
	public List<Card> findCardAll() throws Exception;
	/*
   	<select id=findCardAll" resultMap="cardResultMap">
		select * from card
	</select>
	 */
	
	public int insertCard(Card card) throws Exception;
	/*
	 <insert id="insertCard" parameterType="com.itwill.shop.domain.Card">
		insert into card(card_no,card_number,card_name,card_type)
		values(#{cardNo},#{card_number},#{card_name},#{cardType})
	</insert>
	 */
	
	public int updateCardByNo(Card card) throws Exception;
	/*
	 <update id="updateAddressByNo" parameterType="com.itwill.shop.domain.Address">
		update address set address_name=#{addressName},address_detail=#{addressDetail},address_type=#{addressType}
	</update>
	 */
	
	public int deleteCardByNo(Integer cardNo) throws Exception;
	/*
	 <delete id="deleteCardByNo" parameterType="int">
		delete from card where card_no=#{cardNo}
	</delete>
	 */
	
}
