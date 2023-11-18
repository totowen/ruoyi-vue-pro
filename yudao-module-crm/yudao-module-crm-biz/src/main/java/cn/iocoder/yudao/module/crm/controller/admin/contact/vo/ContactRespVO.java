package cn.iocoder.yudao.module.crm.controller.admin.contact.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import java.time.LocalDateTime;

@Schema(description = "管理后台 - crm联系人 Response VO")
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ContactRespVO extends ContactBaseVO {

    @Schema(description = "创建时间")
    private LocalDateTime createTime;
    @Schema(description = "创建人")
    private String creatorName;
    @Schema(description = "客户")
    private String customerName;
    @Schema(description = "主键", requiredMode = Schema.RequiredMode.REQUIRED, example = "3167")
    private Long id;

}
