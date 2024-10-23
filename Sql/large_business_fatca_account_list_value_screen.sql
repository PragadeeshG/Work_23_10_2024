create table if not exists large_business_fatca_account_list_value_screen(
scree_id Integer not null,
fatca_code Integer null,
federal_scheme varchar(255) null,
reporting_regime varchar(255) null,
revenue_service varchar(255) null,
action_ids varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint large_business_fatca_account_list_value_screen_pk primary key(scree_id));