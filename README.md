# BeatuifulVCF
a vcf file parser

## Install

By maven

```
<dependency>
    <groupId>cn.xjiangwei.beatuifulvcf</groupId>
    <artifactId>beatuifulvcf</artifactId>
    <version>1.0</version>
</dependency>
```



## Demo

```java

import bean.ItemBean;
import beautifulVCF.BeatuifulVcf;
import java.io.FileNotFoundException;
public class test {
    public static void main(String[] args) throws FileNotFoundException {
        
        //  write file
        BeatuifulVcf beatuifulVcf=new BeatuifulVcf();
        ItemBean itemBean=new ItemBean();
        itemBean.setTrueName("Json");
        itemBean.setTelePhone("0816-6065458");
        itemBean.setMobile("13890199242");
        beatuifulVcf.addItem(itemBean);
        beatuifulVcf.write("./test.vcf");
        
        //   read file
        beatuifulVcf=new BeatuifulVcf();
        System.out.println(beatuifulVcf.read("./test.vcf"));
        //  [ItemBean{trueName='Json', mobile='13890199242', workMobile='', telePhone='', email=''}]
    }
}


```