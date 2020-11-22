package com.atguigu.gmall.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PmsBaseCatalog3 implements Serializable {
    @Id
    private String id;
    private String name;
    private String catalog2Id;

}
