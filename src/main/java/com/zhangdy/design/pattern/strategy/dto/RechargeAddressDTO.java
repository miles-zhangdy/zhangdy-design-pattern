package com.zhangdy.design.pattern.strategy.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RechargeAddressDTO {

    /** 币种 */
    private String currency;
    /** 链类型 */
    private String linkType;
    /** 地址 */
    private String address;

}
