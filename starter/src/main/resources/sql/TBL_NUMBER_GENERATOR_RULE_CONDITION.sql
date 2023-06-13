CREATE TABLE TBL_NUMBER_GENERATOR_RULE_CONDITION
(
    rule_condition_id BIGINT        NOT NULL COMMENT '规则条件Id',
    biz_code          NVARCHAR(100) NOT NULL COMMENT '业务编码',
    rule_condition    NVARCHAR(255) COMMENT '匹配条件',
    priority          INTEGER COMMENT '优先级',
    rule_id           BIGINT        NOT NULL COMMENT '规则Id',
    app_id            NVARCHAR(100) COMMENT '应用Id',
    sub_app_id        NVARCHAR(100) COMMENT '子应用Id'
) COMMENT '规则条件定义表';
ALTER TABLE TBL_NUMBER_GENERATOR_RULE_CONDITION
    ADD CONSTRAINT KEY_TBL_NUMBER_GENERATOR_RULE_CONDITION PRIMARY KEY (rule_condition_id);
