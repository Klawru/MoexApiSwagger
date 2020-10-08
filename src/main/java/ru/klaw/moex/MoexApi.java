package ru.klaw.moex;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.QueryValue;
import io.reactivex.Maybe;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.tags.Tag;
import ru.klaw.moex.types.response0.Response0;
import ru.klaw.moex.types.response1.Response1;
import ru.klaw.moex.types.response10.Response10;
import ru.klaw.moex.types.response100.Response100;
import ru.klaw.moex.types.response101.Response101;
import ru.klaw.moex.types.response102.Response102;
import ru.klaw.moex.types.response103.Response103;
import ru.klaw.moex.types.response104.Response104;
import ru.klaw.moex.types.response105.Response105;
import ru.klaw.moex.types.response106.Response106;
import ru.klaw.moex.types.response107.Response107;
import ru.klaw.moex.types.response108.Response108;
import ru.klaw.moex.types.response109.Response109;
import ru.klaw.moex.types.response11.Response11;
import ru.klaw.moex.types.response110.Response110;
import ru.klaw.moex.types.response111.Response111;
import ru.klaw.moex.types.response112.Response112;
import ru.klaw.moex.types.response113.Response113;
import ru.klaw.moex.types.response114.Response114;
import ru.klaw.moex.types.response115.Response115;
import ru.klaw.moex.types.response116.Response116;
import ru.klaw.moex.types.response117.Response117;
import ru.klaw.moex.types.response118.Response118;
import ru.klaw.moex.types.response119.Response119;
import ru.klaw.moex.types.response12.Response12;
import ru.klaw.moex.types.response120.Response120;
import ru.klaw.moex.types.response121.Response121;
import ru.klaw.moex.types.response122.Response122;
import ru.klaw.moex.types.response123.Response123;
import ru.klaw.moex.types.response124.Response124;
import ru.klaw.moex.types.response125.Response125;
import ru.klaw.moex.types.response126.Response126;
import ru.klaw.moex.types.response127.Response127;
import ru.klaw.moex.types.response128.Response128;
import ru.klaw.moex.types.response129.Response129;
import ru.klaw.moex.types.response13.Response13;
import ru.klaw.moex.types.response130.Response130;
import ru.klaw.moex.types.response131.Response131;
import ru.klaw.moex.types.response132.Response132;
import ru.klaw.moex.types.response133.Response133;
import ru.klaw.moex.types.response134.Response134;
import ru.klaw.moex.types.response135.Response135;
import ru.klaw.moex.types.response136.Response136;
import ru.klaw.moex.types.response137.Response137;
import ru.klaw.moex.types.response138.Response138;
import ru.klaw.moex.types.response139.Response139;
import ru.klaw.moex.types.response14.Response14;
import ru.klaw.moex.types.response15.Response15;
import ru.klaw.moex.types.response16.Response16;
import ru.klaw.moex.types.response17.Response17;
import ru.klaw.moex.types.response18.Response18;
import ru.klaw.moex.types.response19.Response19;
import ru.klaw.moex.types.response2.Response2;
import ru.klaw.moex.types.response20.Response20;
import ru.klaw.moex.types.response21.Response21;
import ru.klaw.moex.types.response22.Response22;
import ru.klaw.moex.types.response23.Response23;
import ru.klaw.moex.types.response24.Response24;
import ru.klaw.moex.types.response25.Response25;
import ru.klaw.moex.types.response26.Response26;
import ru.klaw.moex.types.response27.Response27;
import ru.klaw.moex.types.response28.Response28;
import ru.klaw.moex.types.response29.Response29;
import ru.klaw.moex.types.response3.Response3;
import ru.klaw.moex.types.response30.Response30;
import ru.klaw.moex.types.response31.Response31;
import ru.klaw.moex.types.response32.Response32;
import ru.klaw.moex.types.response33.Response33;
import ru.klaw.moex.types.response34.Response34;
import ru.klaw.moex.types.response35.Response35;
import ru.klaw.moex.types.response36.Response36;
import ru.klaw.moex.types.response37.Response37;
import ru.klaw.moex.types.response38.Response38;
import ru.klaw.moex.types.response39.Response39;
import ru.klaw.moex.types.response4.Response4;
import ru.klaw.moex.types.response40.Response40;
import ru.klaw.moex.types.response41.Response41;
import ru.klaw.moex.types.response42.Response42;
import ru.klaw.moex.types.response43.Response43;
import ru.klaw.moex.types.response44.Response44;
import ru.klaw.moex.types.response45.Response45;
import ru.klaw.moex.types.response46.Response46;
import ru.klaw.moex.types.response47.Response47;
import ru.klaw.moex.types.response48.Response48;
import ru.klaw.moex.types.response49.Response49;
import ru.klaw.moex.types.response5.Response5;
import ru.klaw.moex.types.response50.Response50;
import ru.klaw.moex.types.response51.Response51;
import ru.klaw.moex.types.response52.Response52;
import ru.klaw.moex.types.response53.Response53;
import ru.klaw.moex.types.response54.Response54;
import ru.klaw.moex.types.response55.Response55;
import ru.klaw.moex.types.response56.Response56;
import ru.klaw.moex.types.response57.Response57;
import ru.klaw.moex.types.response58.Response58;
import ru.klaw.moex.types.response59.Response59;
import ru.klaw.moex.types.response6.Response6;
import ru.klaw.moex.types.response60.Response60;
import ru.klaw.moex.types.response61.Response61;
import ru.klaw.moex.types.response62.Response62;
import ru.klaw.moex.types.response63.Response63;
import ru.klaw.moex.types.response64.Response64;
import ru.klaw.moex.types.response65.Response65;
import ru.klaw.moex.types.response66.Response66;
import ru.klaw.moex.types.response67.Response67;
import ru.klaw.moex.types.response68.Response68;
import ru.klaw.moex.types.response69.Response69;
import ru.klaw.moex.types.response7.Response7;
import ru.klaw.moex.types.response70.Response70;
import ru.klaw.moex.types.response71.Response71;
import ru.klaw.moex.types.response72.Response72;
import ru.klaw.moex.types.response73.Response73;
import ru.klaw.moex.types.response74.Response74;
import ru.klaw.moex.types.response75.Response75;
import ru.klaw.moex.types.response76.Response76;
import ru.klaw.moex.types.response77.Response77;
import ru.klaw.moex.types.response78.Response78;
import ru.klaw.moex.types.response79.Response79;
import ru.klaw.moex.types.response8.Response8;
import ru.klaw.moex.types.response80.Response80;
import ru.klaw.moex.types.response81.Response81;
import ru.klaw.moex.types.response82.Response82;
import ru.klaw.moex.types.response83.Response83;
import ru.klaw.moex.types.response84.Response84;
import ru.klaw.moex.types.response85.Response85;
import ru.klaw.moex.types.response86.Response86;
import ru.klaw.moex.types.response87.Response87;
import ru.klaw.moex.types.response88.Response88;
import ru.klaw.moex.types.response89.Response89;
import ru.klaw.moex.types.response9.Response9;
import ru.klaw.moex.types.response90.Response90;
import ru.klaw.moex.types.response91.Response91;
import ru.klaw.moex.types.response92.Response92;
import ru.klaw.moex.types.response93.Response93;
import ru.klaw.moex.types.response94.Response94;
import ru.klaw.moex.types.response95.Response95;
import ru.klaw.moex.types.response96.Response96;
import ru.klaw.moex.types.response97.Response97;
import ru.klaw.moex.types.response98.Response98;
import ru.klaw.moex.types.response99.Response99;

import javax.annotation.Nullable;


@OpenAPIDefinition(
        info = @Info(
                title = "Информационно-статистический сервер Московской Биржи",
                version = "v.0.14.1",
                description = "All requests must be called with the 'iss.json=extended' and 'iss.meta=off'  parameters.",
                contact = @Contact(url = "https://www.moex.com/a2193")
        ),
        servers = @Server(url = "https://iss.moex.com/")
)
@Controller
public interface MoexApi {

    @Operation(description = "Список бумаг торгуемых на московской бирже.")
    @Get(value = "/iss/securities.json{?securities.engine,securities.is_trading,securities.market,securities.q,securities.limit,securities.group_by_filter,securities.group_by,securities.start}")
    Maybe<Response0> get0(
            @Nullable
            @QueryValue(value = "securities.engine")
                    String securitiesEngine,
            @Nullable
            @QueryValue(value = "securities.is_trading")
                    String securitiesIsTrading,
            @Nullable
            @QueryValue(value = "securities.market")
                    String securitiesMarket,
            @Parameter(description = "Поиск инструмента по части Кода, Названию, ISIN, Идентификатору Эмитента, Номеру гос.регистрации. Например: https://iss.moex.com/iss/securities.xml?q=MOEX  Слова длиной менее трёх букв игнорируются. Если параметром передано два слова через пробел. То каждое должно быть длиной не менее трёх букв. ")
            @Nullable
            @QueryValue(value = "securities.q")
                    String securitiesQ,
            @Parameter(description = "Количество выводимых инструментов (5, 10, 20,100)")
            @Nullable
            @QueryValue(value = "securities.limit")
                    String securitiesLimit,
            @Parameter(description = "Фильтровать по типам group или type. Зависит от значения фильтра group_by")
            @Nullable
            @QueryValue(value = "securities.group_by_filter")
                    String securitiesGroupByFilter,
            @Parameter(description = "Группировать выводимый результат по полю. Доступны значения group и type.")
            @Nullable
            @QueryValue(value = "securities.group_by")
                    String securitiesGroupBy,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart
    );

    @Operation(description = "Получить спецификацию инструмента.  Например: https://iss.moex.com/iss/securities/IMOEX.xml")
    @Get(value = "/iss/securities/{security}.json{?boards.start}")
    Maybe<Response1> get1(
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "boards.start")
                    Integer boardsStart
    );

    @Operation(description = "Список индексов в которые входит бумага")
    @Get(value = "/iss/securities/{security}/indices.json{?indices.only_actual}")
    Maybe<Response2> get2(
            @PathVariable
                    String security,
            @Parameter(description = "Выводить индексы в базе которого бумага находится прямо сейчас.")
            @Nullable
            @QueryValue(value = "indices.only_actual")
                    String indicesOnlyActual
    );

    @Operation(description = "Агрегированные итоги торгов за дату по рынкам")
    @Get(value = "/iss/securities/{security}/aggregates.json{?aggregates.date}")
    Maybe<Response3> get3(
            @PathVariable
                    String security,
            @Parameter(description = "дата за которую необходимо отобразить данные. По умолчанию за последнюю дату в итогах торгов.")
            @Nullable
            @QueryValue(value = "aggregates.date")
                    String aggregatesDate
    );

    @Operation(description = "Промежуточные 'Итоги дня'. Только для фондового рынка ")
    @Get(value = "/iss/engines/{engine}/markets/{market}/secstats.json{?secstats.tradingsession,secstats.securities,secstats.boardid}")
    Maybe<Response4> get4(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Показать данные только за необходимую сессию 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "secstats.tradingsession")
                    String secstatsTradingsession,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "secstats.securities")
                    String secstatsSecurities,
            @Parameter(description = "Отфильтровать выдачу по режиму торгов. Например: boardid=TQBR,SMAL (не более 10 режимов).")
            @Nullable
            @QueryValue(value = "secstats.boardid")
                    String secstatsBoardid
    );

    @Operation(description = "Получить сводные обороты по рынкам. Например: https://iss.moex.com/iss/turnovers.xml")
    @Get(value = "/iss/turnovers.json{?turnovers.is_tonight_session,turnovers.date,turnoversprevdate.is_tonight_session,turnoversprevdate.date,turnoverssectors.is_tonight_session,turnoverssectors.date,turnoverssectorsprevdate.date,turnoverssectorsprevdate.is_tonight_session}")
    Maybe<Response5> get5(
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnovers.is_tonight_session")
                    String turnoversIsTonightSession,
            @Nullable
            @QueryValue(value = "turnovers.date")
                    String turnoversDate,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnoversprevdate.is_tonight_session")
                    String turnoversprevdateIsTonightSession,
            @Nullable
            @QueryValue(value = "turnoversprevdate.date")
                    String turnoversprevdateDate,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnoverssectors.is_tonight_session")
                    String turnoverssectorsIsTonightSession,
            @Nullable
            @QueryValue(value = "turnoverssectors.date")
                    String turnoverssectorsDate,
            @Nullable
            @QueryValue(value = "turnoverssectorsprevdate.date")
                    String turnoverssectorsprevdateDate,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnoverssectorsprevdate.is_tonight_session")
                    String turnoverssectorsprevdateIsTonightSession
    );

    @Operation(description = "Получить описание полей для запросов оборотов по рынку/торговой системе. Например: https://iss.moex.com/iss/engines/stock/turnovers/columns.xml")
    @Get(value = "/iss/turnovers/columns.json{?}")
    Maybe<Response6> get6(
    );

    @Operation(description = "Получить текущее значение оборотов торговой сессии по рынкам торговой системы ")
    @Get(value = "/iss/engines/{engine}/turnovers.json{?turnovers.is_tonight_session,turnovers.date,turnoversprevdate.is_tonight_session,turnoversprevdate.date,turnoverssectors.is_tonight_session,turnoverssectors.date,turnoverssectorsprevdate.date,turnoverssectorsprevdate.is_tonight_session}")
    Maybe<Response7> get7(
            @PathVariable
                    String engine,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnovers.is_tonight_session")
                    String turnoversIsTonightSession,
            @Nullable
            @QueryValue(value = "turnovers.date")
                    String turnoversDate,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnoversprevdate.is_tonight_session")
                    String turnoversprevdateIsTonightSession,
            @Nullable
            @QueryValue(value = "turnoversprevdate.date")
                    String turnoversprevdateDate,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnoverssectors.is_tonight_session")
                    String turnoverssectorsIsTonightSession,
            @Nullable
            @QueryValue(value = "turnoverssectors.date")
                    String turnoverssectorsDate,
            @Nullable
            @QueryValue(value = "turnoverssectorsprevdate.date")
                    String turnoverssectorsprevdateDate,
            @Parameter(description = "Показывать обороты за вечернюю сессию")
            @Nullable
            @QueryValue(value = "turnoverssectorsprevdate.is_tonight_session")
                    String turnoverssectorsprevdateIsTonightSession
    );

    @Operation(description = "Получить текущее значение оборота по рынку")
    @Get(value = "/iss/engines/{engine}/markets/{market}/turnovers.json{?}")
    Maybe<Response8> get8(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить данные по кривой бескупонной доходности (Прекращены расчеты с 2018-01-03)")
    @Get(value = "/iss/engines/{engine}/markets/zcyc.json{?parameters.from,parameters.till,parameters.start,values.from,values.till,values.start,parameters.dates.till,intraday.from,intraday.till,intraday.start,yields.from,yields.till,yields.start,base.from,base.till,base.start,model.from,model.till,model.start}")
    Maybe<Response9> get9(
            @PathVariable
                    String engine,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "parameters.from")
                    String parametersFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "parameters.till")
                    String parametersTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "parameters.start")
                    Integer parametersStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "values.from")
                    String valuesFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "values.till")
                    String valuesTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "values.start")
                    Integer valuesStart,
            @Nullable
            @QueryValue(value = "parameters.dates.till")
                    String parametersDatesTill,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "intraday.from")
                    String intradayFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "intraday.till")
                    String intradayTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "intraday.start")
                    Integer intradayStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "yields.from")
                    String yieldsFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "yields.till")
                    String yieldsTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "yields.start")
                    Integer yieldsStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "base.from")
                    String baseFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "base.till")
                    String baseTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "base.start")
                    Integer baseStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "model.from")
                    String modelFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "model.till")
                    String modelTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "model.start")
                    Integer modelStart
    );


    @Get(value = "/iss/engines/{engine}/zcyc.json{?maxdates.date,params.date,securities.date,yearyields.date,yearyields.show}")
    Maybe<Response10> get10(
            @PathVariable
                    String engine,
            @Nullable
            @QueryValue(value = "maxdates.date")
                    String maxdatesDate,
            @Nullable
            @QueryValue(value = "params.date")
                    String paramsDate,
            @Nullable
            @QueryValue(value = "securities.date")
                    String securitiesDate,
            @Nullable
            @QueryValue(value = "yearyields.date")
                    String yearyieldsDate,
            @Nullable
            @QueryValue(value = "yearyields.show")
                    String yearyieldsShow
    );

    @Operation(description = "Получить глобальные справочники ISS.  Например: https://iss.moex.com/iss/index.xml")
    @Get(value = "/iss/index.json{?boardgroups.engine,boardgroups.is_traded,securitytypes.engine,securitygroups.hide_inactive,securitygroups.securitygroups,securitygroups.trade_engine}")
    Maybe<Response11> get11(
            @Nullable
            @QueryValue(value = "boardgroups.engine")
                    String boardgroupsEngine,
            @Parameter(description = "Показывать торгуемые только торгующиеся в настоящий момент группы режимов торгов: is_traded=1")
            @Nullable
            @QueryValue(value = "boardgroups.is_traded")
                    String boardgroupsIsTraded,
            @Parameter(description = "Показывать типы инструментов для торговой системы.")
            @Nullable
            @QueryValue(value = "securitytypes.engine")
                    String securitytypesEngine,
            @Nullable
            @QueryValue(value = "securitygroups.hide_inactive")
                    String securitygroupsHideInactive,
            @Nullable
            @QueryValue(value = "securitygroups.securitygroups")
                    String securitygroupsSecuritygroups,
            @Nullable
            @QueryValue(value = "securitygroups.trade_engine")
                    String securitygroupsTradeEngine
    );

    @Operation(description = "Получить доступные торговые системы.  Например: https://iss.moex.com/iss/engines.xml")
    @Get(value = "/iss/engines.json{?}")
    Maybe<Response12> get12(
    );

    @Operation(description = "Получить описание полей для запросов торгуемости бумаг (листинга)")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/.*?listing/columns.json{?}")
    Maybe<Response13> get13(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Список неторгуемых инструментов с указанием интервалов торгуемости по режимам")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/listing.json{?securities.start,securities.status}")
    Maybe<Response14> get14(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart,
            @Parameter(description = "Фильтр торгуемости инструментов: traded, nottraded или all")
            @Nullable
            @QueryValue(value = "securities.status")
                    String securitiesStatus
    );

    @Operation(description = "Получить данные по листингу бумаг в историческом разрезе по указанному режиму")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/listing.json{?securities.start,securities.status}")
    Maybe<Response15> get15(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart,
            @Parameter(description = "Фильтр торгуемости инструментов: traded, nottraded или all")
            @Nullable
            @QueryValue(value = "securities.status")
                    String securitiesStatus
    );

    @Operation(description = "Получить данные по листингу бумаг в историческом разрезе по указанной группе режимов")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/listing.json{?securities.start,securities.status}")
    Maybe<Response16> get16(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart,
            @Parameter(description = "Фильтр торгуемости инструментов: traded, nottraded или all")
            @Nullable
            @QueryValue(value = "securities.status")
                    String securitiesStatus
    );

    @Operation(description = "Получить описание и режим работы торговой системы. Например: https://iss.moex.com/iss/engines/stock.xml")
    @Get(value = "/iss/engines/{engine}.json{?}")
    Maybe<Response17> get17(
            @PathVariable
                    String engine
    );

    @Operation(description = "Список сессий доступных в итогах торгов.  Только для фондового рынка!")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/sessions.json{?}")
    Maybe<Response18> get18(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить историю по всем бумагам на рынке за одну дату. Например: https://iss.moex.com/iss/history/engines/stock/markets/index/securities.xml?date=2010-11-22")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/sessions/{session}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response19> get19(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String session,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю по одной бумаге на рынке за интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/sessions/{session}/securities/{security}.json{?history.limit,history.sort_column,history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.tradingsession,history.cursor.start,history.cursor.from,history.cursor.till,history.cursor.numtrades,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response20> get20(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String session,
            @PathVariable
                    String security,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.from")
                    String historyCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.till")
                    String historyCursorTill,
            @Parameter(description = "Минимальное количество сделок с бумагой. ")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить описание полей для запросов стакана котировок для рынка. Например: https://iss.moex.com/iss/engines/stock/markets/shares/orderbook/columns.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/.*?orderbook/columns.json{?}")
    Maybe<Response21> get21(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить историю торгов для всех бумаг на указанной группе режимов торгов за указанную дату. ")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/session/{session}/boardgroups/{boardgroup}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response22> get22(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String session,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю торгов для указанной бумаги на выбранной группе режимов торгов за указанный интервал дат. ")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/sessions/{session}/boardgroups/{boardgroup}/securities/{security}.json{?history.limit,history.sort_column,history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.tradingsession,history.cursor.start,history.cursor.from,history.cursor.till,history.cursor.numtrades,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response23> get23(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String session,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.from")
                    String historyCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.till")
                    String historyCursorTill,
            @Parameter(description = "Минимальное количество сделок с бумагой. ")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю торгов для всех бумаг на указанном режиме торгов отфильтрованных по дате. ")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/sessions/{session}/boards/{board}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response24> get24(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String session,
            @PathVariable
                    String board,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю торгов для указанной бумаги на указанном режиме торгов за указанный интервал дат. ")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/sessions/{session}/boards/{board}/securities/{security}.json{?history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.limit,history.sort_column,history.tradingsession}")
    Maybe<Response25> get25(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String session,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession
    );

    @Operation(description = "Получить описание полей для запросов публикуемых бумаг для рынка. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities/columns.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/.*?securities/columns.json{?}")
    Maybe<Response26> get26(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить описание полей для запросов исторических данных по бумагам для рынка.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/.*?securities/columns.json{?}")
    Maybe<Response27> get27(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить описание полей для запросов исторических данных по бумагам для рынка.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/.*?{securities}/columns.json{?}")
    Maybe<Response28> get28(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String securities
    );

    @Operation(description = "Получить список рынков торговой системы.  Например: https://iss.moex.com/iss/engines/stock/markets.xml")
    @Get(value = "/iss/engines/{engine}/markets.json{?}")
    Maybe<Response29> get29(
            @PathVariable
                    String engine
    );

    @Operation(description = "Получить описание полей для запроса сделок по рынку. Например: https://iss.moex.com/iss/engines/stock/markets/shares/trades/columns.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/.*?trades/columns.json{?}")
    Maybe<Response30> get30(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить описание: словарь доступных режимов торгов, описание полей публикуемых таблиц данных и т.д. Например: https://iss.moex.com/iss/engines/stock/markets/shares.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}.json{?}")
    Maybe<Response31> get31(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить таблицу инструментов торговой сессии по рынку в целом. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities.xml ")
    @Get(value = "/iss/engines/{engine}/markets/{market}/securities.json{?securities.securities,securities.sectypes,securities.nearest,securities.leaders,securities.sort_order,securities.sort_column,securities.first,securities.previous_session,securities.security_collection,securities.index,marketdata.securities,marketdata.sectypes,marketdata.nearest,marketdata.leaders,marketdata.sort_column,marketdata.sort_order,marketdata.first,marketdata.previous_session,marketdata.index,marketdata.seqnum,marketdata_yields.securities,marketdata_yields.sectypes,marketdata_yields.nearest,marketdata_yields.leaders,marketdata_yields.sort_column,marketdata_yields.sort_order,marketdata_yields.first,marketdata_yields.previous_session,marketdata_yields.index,marketdata_yields.seqnum}")
    Maybe<Response32> get32(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "securities.securities")
                    String securitiesSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка)")
            @Nullable
            @QueryValue(value = "securities.sectypes")
                    String securitiesSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "securities.nearest")
                    String securitiesNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options)")
            @Nullable
            @QueryValue(value = "securities.leaders")
                    String securitiesLeaders,
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Nullable
            @QueryValue(value = "securities.sort_column")
                    String securitiesSortColumn,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "securities.first")
                    String securitiesFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков  ")
            @Nullable
            @QueryValue(value = "securities.previous_session")
                    String securitiesPreviousSession,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "securities.security_collection")
                    String securitiesSecurityCollection,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "securities.index")
                    String securitiesIndex,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata.securities")
                    String marketdataSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata.sectypes")
                    String marketdataSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata.nearest")
                    String marketdataNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata.leaders")
                    String marketdataLeaders,
            @Nullable
            @QueryValue(value = "marketdata.sort_column")
                    String marketdataSortColumn,
            @Nullable
            @QueryValue(value = "marketdata.sort_order")
                    String marketdataSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata.first")
                    String marketdataFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata.previous_session")
                    String marketdataPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata.index")
                    String marketdataIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata.seqnum")
                    Integer marketdataSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata_yields.securities")
                    String marketdataYieldsSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata_yields.sectypes")
                    String marketdataYieldsSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata_yields.nearest")
                    String marketdataYieldsNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata_yields.leaders")
                    String marketdataYieldsLeaders,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_column")
                    String marketdataYieldsSortColumn,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_order")
                    String marketdataYieldsSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata_yields.first")
                    String marketdataYieldsFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata_yields.previous_session")
                    String marketdataYieldsPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata_yields.index")
                    String marketdataYieldsIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata_yields.seqnum")
                    Integer marketdataYieldsSeqnum
    );

    @Operation(description = "Получить данные по конкретному инструменту рынка. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities/AFLT.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/securities/{security}.json{?securities.security_collection,securities.index,securities.sectypes,securities.nearest,securities.leaders,securities.sort_order,securities.sort_column,securities.first,securities.securities,securities.previous_session,marketdata.previous_session,marketdata.index,marketdata.sectypes,marketdata.nearest,marketdata.leaders,marketdata.sort_column,marketdata.sort_order,marketdata.first,marketdata.securities,marketdata.seqnum,marketdata_yields.securities,marketdata_yields.sectypes,marketdata_yields.nearest,marketdata_yields.leaders,marketdata_yields.sort_column,marketdata_yields.sort_order,marketdata_yields.first,marketdata_yields.previous_session,marketdata_yields.index,marketdata_yields.seqnum}")
    Maybe<Response33> get33(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "securities.security_collection")
                    String securitiesSecurityCollection,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "securities.index")
                    String securitiesIndex,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка)")
            @Nullable
            @QueryValue(value = "securities.sectypes")
                    String securitiesSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "securities.nearest")
                    String securitiesNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options)")
            @Nullable
            @QueryValue(value = "securities.leaders")
                    String securitiesLeaders,
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Nullable
            @QueryValue(value = "securities.sort_column")
                    String securitiesSortColumn,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "securities.first")
                    String securitiesFirst,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "securities.securities")
                    String securitiesSecurities,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков  ")
            @Nullable
            @QueryValue(value = "securities.previous_session")
                    String securitiesPreviousSession,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata.previous_session")
                    String marketdataPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata.index")
                    String marketdataIndex,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata.sectypes")
                    String marketdataSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata.nearest")
                    String marketdataNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata.leaders")
                    String marketdataLeaders,
            @Nullable
            @QueryValue(value = "marketdata.sort_column")
                    String marketdataSortColumn,
            @Nullable
            @QueryValue(value = "marketdata.sort_order")
                    String marketdataSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata.first")
                    String marketdataFirst,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata.securities")
                    String marketdataSecurities,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata.seqnum")
                    Integer marketdataSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata_yields.securities")
                    String marketdataYieldsSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata_yields.sectypes")
                    String marketdataYieldsSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata_yields.nearest")
                    String marketdataYieldsNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata_yields.leaders")
                    String marketdataYieldsLeaders,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_column")
                    String marketdataYieldsSortColumn,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_order")
                    String marketdataYieldsSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata_yields.first")
                    String marketdataYieldsFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata_yields.previous_session")
                    String marketdataYieldsPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata_yields.index")
                    String marketdataYieldsIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata_yields.seqnum")
                    Integer marketdataYieldsSeqnum
    );

    @Operation(description = "Получить сделки по инструменту.  Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities/AFLT/trades.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/securities/{security}/trades.json{?trades.previous_session,trades.tradeno,trades.limit,trades.reversed,trades.securities,trades.start,trades_yields.tradeno,trades_yields.limit,trades_yields.reversed,trades_yields.securities,trades_yields.start,trades_yields.yielddatetype}")
    Maybe<Response34> get34(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Сделки предыдущей сессии для forts и options рынков. И для индексов. ")
            @Nullable
            @QueryValue(value = "trades.previous_session")
                    String tradesPreviousSession,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные.")
            @Nullable
            @QueryValue(value = "trades.tradeno")
                    String tradesTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades.limit")
                    String tradesLimit,
            @Parameter(description = "обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades.reversed")
                    String tradesReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades.securities")
                    String tradesSecurities,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "trades.start")
                    Integer tradesStart,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные. ")
            @Nullable
            @QueryValue(value = "trades_yields.tradeno")
                    String tradesYieldsTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades_yields.limit")
                    String tradesYieldsLimit,
            @Parameter(description = "Обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades_yields.reversed")
                    String tradesYieldsReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades_yields.securities")
                    String tradesYieldsSecurities,
            @Nullable
            @QueryValue(value = "trades_yields.start")
                    Integer tradesYieldsStart,
            @Parameter(description = "Тип доходности. Возможные значения - MBS - MATDATE - OFFERDATE")
            @Nullable
            @QueryValue(value = "trades_yields.yielddatetype")
                    String tradesYieldsYielddatetype
    );

    @Operation(description = "Получить стакан заявок по инструменту. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities/AFLT/orderbook.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/securities/{security}/orderbook.json{?orderbook.start,orderbook.seqnum,orderbook.securities}")
    Maybe<Response35> get35(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "orderbook.start")
                    Integer orderbookStart,
            @Parameter(description = "(Устарел) Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "orderbook.seqnum")
                    Integer orderbookSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "orderbook.securities")
                    String orderbookSecurities
    );

    @Operation(description = "Получить все сделки рынка. Например: https://iss.moex.com/iss/engines/stock/markets/shares/trades.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/trades.json{?trades.tradeno,trades.securities,trades.limit,trades.reversed,trades.previous_session,trades.start,trades_yields.tradeno,trades_yields.limit,trades_yields.reversed,trades_yields.securities,trades_yields.start,trades_yields.yielddatetype}")
    Maybe<Response36> get36(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные.")
            @Nullable
            @QueryValue(value = "trades.tradeno")
                    String tradesTradeno,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades.securities")
                    String tradesSecurities,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades.limit")
                    String tradesLimit,
            @Parameter(description = "обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades.reversed")
                    String tradesReversed,
            @Parameter(description = "Сделки предыдущей сессии для forts и options рынков. И для индексов. ")
            @Nullable
            @QueryValue(value = "trades.previous_session")
                    String tradesPreviousSession,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "trades.start")
                    Integer tradesStart,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные. ")
            @Nullable
            @QueryValue(value = "trades_yields.tradeno")
                    String tradesYieldsTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades_yields.limit")
                    String tradesYieldsLimit,
            @Parameter(description = "Обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades_yields.reversed")
                    String tradesYieldsReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades_yields.securities")
                    String tradesYieldsSecurities,
            @Nullable
            @QueryValue(value = "trades_yields.start")
                    Integer tradesYieldsStart,
            @Parameter(description = "Тип доходности. Возможные значения - MBS - MATDATE - OFFERDATE")
            @Nullable
            @QueryValue(value = "trades_yields.yielddatetype")
                    String tradesYieldsYielddatetype
    );

    @Operation(description = "Получить стаканы заявок всех инструментов рынка. Например: https://iss.moex.com/iss/engines/stock/markets/shares/orderbook.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/orderbook.json{?orderbook.start,orderbook.seqnum,orderbook.securities}")
    Maybe<Response37> get37(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "orderbook.start")
                    Integer orderbookStart,
            @Parameter(description = "(Устарел) Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "orderbook.seqnum")
                    Integer orderbookSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "orderbook.securities")
                    String orderbookSecurities
    );

    @Operation(description = "Получить справочник режимов торгов рынка. Например: https://iss.moex.com/iss/engines/stock/markets/shares/boards.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards.json{?}")
    Maybe<Response38> get38(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить описание режима торгов. Например: https://iss.moex.com/iss/engines/stock/markets/shares/boards/TQBR.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}.json{?}")
    Maybe<Response39> get39(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board
    );

    @Operation(description = "Получить таблицу инструментов по режиму торгов. Например: https://iss.moex.com/iss/engines/stock/markets/shares/boards/TQBR/securities.xml")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/securities.json{?securities.security_collection,securities.index,securities.sectypes,securities.nearest,securities.leaders,securities.sort_order,securities.sort_column,securities.first,securities.securities,securities.previous_session,marketdata.previous_session,marketdata.index,marketdata.sectypes,marketdata.nearest,marketdata.leaders,marketdata.sort_column,marketdata.sort_order,marketdata.first,marketdata.securities,marketdata.seqnum,marketdata_yields.securities,marketdata_yields.sectypes,marketdata_yields.nearest,marketdata_yields.leaders,marketdata_yields.sort_column,marketdata_yields.sort_order,marketdata_yields.first,marketdata_yields.previous_session,marketdata_yields.index,marketdata_yields.seqnum}")
    Maybe<Response40> get40(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "securities.security_collection")
                    String securitiesSecurityCollection,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "securities.index")
                    String securitiesIndex,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка)")
            @Nullable
            @QueryValue(value = "securities.sectypes")
                    String securitiesSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "securities.nearest")
                    String securitiesNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options)")
            @Nullable
            @QueryValue(value = "securities.leaders")
                    String securitiesLeaders,
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Nullable
            @QueryValue(value = "securities.sort_column")
                    String securitiesSortColumn,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "securities.first")
                    String securitiesFirst,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "securities.securities")
                    String securitiesSecurities,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков  ")
            @Nullable
            @QueryValue(value = "securities.previous_session")
                    String securitiesPreviousSession,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata.previous_session")
                    String marketdataPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata.index")
                    String marketdataIndex,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata.sectypes")
                    String marketdataSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata.nearest")
                    String marketdataNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata.leaders")
                    String marketdataLeaders,
            @Nullable
            @QueryValue(value = "marketdata.sort_column")
                    String marketdataSortColumn,
            @Nullable
            @QueryValue(value = "marketdata.sort_order")
                    String marketdataSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata.first")
                    String marketdataFirst,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata.securities")
                    String marketdataSecurities,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata.seqnum")
                    Integer marketdataSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata_yields.securities")
                    String marketdataYieldsSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata_yields.sectypes")
                    String marketdataYieldsSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata_yields.nearest")
                    String marketdataYieldsNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata_yields.leaders")
                    String marketdataYieldsLeaders,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_column")
                    String marketdataYieldsSortColumn,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_order")
                    String marketdataYieldsSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata_yields.first")
                    String marketdataYieldsFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata_yields.previous_session")
                    String marketdataYieldsPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata_yields.index")
                    String marketdataYieldsIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata_yields.seqnum")
                    Integer marketdataYieldsSeqnum
    );

    @Operation(description = "Получить данные по указанному инструменту на выбранном режиме торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/securities/{security}.json{?securities.security_collection,securities.index,securities.sectypes,securities.nearest,securities.leaders,securities.sort_order,securities.sort_column,securities.first,securities.securities,securities.previous_session,marketdata.previous_session,marketdata.index,marketdata.sectypes,marketdata.nearest,marketdata.leaders,marketdata.sort_column,marketdata.sort_order,marketdata.first,marketdata.securities,marketdata.seqnum,marketdata_yields.securities,marketdata_yields.sectypes,marketdata_yields.nearest,marketdata_yields.leaders,marketdata_yields.sort_column,marketdata_yields.sort_order,marketdata_yields.first,marketdata_yields.previous_session,marketdata_yields.index,marketdata_yields.seqnum}")
    Maybe<Response41> get41(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "securities.security_collection")
                    String securitiesSecurityCollection,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "securities.index")
                    String securitiesIndex,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка)")
            @Nullable
            @QueryValue(value = "securities.sectypes")
                    String securitiesSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "securities.nearest")
                    String securitiesNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options)")
            @Nullable
            @QueryValue(value = "securities.leaders")
                    String securitiesLeaders,
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Nullable
            @QueryValue(value = "securities.sort_column")
                    String securitiesSortColumn,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "securities.first")
                    String securitiesFirst,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "securities.securities")
                    String securitiesSecurities,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков  ")
            @Nullable
            @QueryValue(value = "securities.previous_session")
                    String securitiesPreviousSession,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata.previous_session")
                    String marketdataPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata.index")
                    String marketdataIndex,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata.sectypes")
                    String marketdataSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata.nearest")
                    String marketdataNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata.leaders")
                    String marketdataLeaders,
            @Nullable
            @QueryValue(value = "marketdata.sort_column")
                    String marketdataSortColumn,
            @Nullable
            @QueryValue(value = "marketdata.sort_order")
                    String marketdataSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata.first")
                    String marketdataFirst,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata.securities")
                    String marketdataSecurities,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata.seqnum")
                    Integer marketdataSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata_yields.securities")
                    String marketdataYieldsSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata_yields.sectypes")
                    String marketdataYieldsSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata_yields.nearest")
                    String marketdataYieldsNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata_yields.leaders")
                    String marketdataYieldsLeaders,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_column")
                    String marketdataYieldsSortColumn,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_order")
                    String marketdataYieldsSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata_yields.first")
                    String marketdataYieldsFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata_yields.previous_session")
                    String marketdataYieldsPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata_yields.index")
                    String marketdataYieldsIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata_yields.seqnum")
                    Integer marketdataYieldsSeqnum
    );

    @Operation(description = "Получить все сделки указанного инструмента по выбранному режиму торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/securities/{security}/trades.json{?trades.tradeno,trades.securities,trades.limit,trades.reversed,trades.previous_session,trades.start,trades_yields.tradeno,trades_yields.limit,trades_yields.reversed,trades_yields.securities,trades_yields.start,trades_yields.yielddatetype}")
    Maybe<Response42> get42(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные.")
            @Nullable
            @QueryValue(value = "trades.tradeno")
                    String tradesTradeno,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades.securities")
                    String tradesSecurities,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades.limit")
                    String tradesLimit,
            @Parameter(description = "обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades.reversed")
                    String tradesReversed,
            @Parameter(description = "Сделки предыдущей сессии для forts и options рынков. И для индексов. ")
            @Nullable
            @QueryValue(value = "trades.previous_session")
                    String tradesPreviousSession,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "trades.start")
                    Integer tradesStart,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные. ")
            @Nullable
            @QueryValue(value = "trades_yields.tradeno")
                    String tradesYieldsTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades_yields.limit")
                    String tradesYieldsLimit,
            @Parameter(description = "Обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades_yields.reversed")
                    String tradesYieldsReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades_yields.securities")
                    String tradesYieldsSecurities,
            @Nullable
            @QueryValue(value = "trades_yields.start")
                    Integer tradesYieldsStart,
            @Parameter(description = "Тип доходности. Возможные значения - MBS - MATDATE - OFFERDATE")
            @Nullable
            @QueryValue(value = "trades_yields.yielddatetype")
                    String tradesYieldsYielddatetype
    );

    @Operation(description = "Получить стакан котировок указанного инструмента по выбранному режиму торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/securities/{security}/orderbook.json{?orderbook.start,orderbook.seqnum,orderbook.securities}")
    Maybe<Response43> get43(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "orderbook.start")
                    Integer orderbookStart,
            @Parameter(description = "(Устарел) Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "orderbook.seqnum")
                    Integer orderbookSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "orderbook.securities")
                    String orderbookSecurities
    );

    @Operation(description = "Получить свечи указанного инструмента по дефолтной группе режимов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/securities/{security}/candles.json{?candles.start,candles.till,candles.from,candles.interval,candles.iss.reverse}")
    Maybe<Response44> get44(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "candles.start")
                    String candlesStart,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "candles.till")
                    String candlesTill,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "candles.from")
                    String candlesFrom,
            @Parameter(description = "Интервал графика.")
            @Nullable
            @QueryValue(value = "candles.interval")
                    String candlesInterval,
            @Parameter(description = "Изменить порядок сортировки на обратный. Принимает значения true/false.")
            @Nullable
            @QueryValue(value = "candles.iss.reverse")
                    String candlesIssReverse
    );


    @Get(value = "/iss/engines/{engine}/markets/{market}/securities/{security}/candleborders.json{?}")
    Maybe<Response45> get45(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security
    );

    @Operation(description = "Обобщенные данные ОТС ПФИ и РЕПО - список рынков. ")
    @Get(value = "/iss/history/otc/providers/nsd/markets.json{?}")
    Maybe<Response46> get46(
    );

    @Operation(description = "Ежедневные обобщенные данные ОТС ПФИ и РЕПО. ")
    @Get(value = "/iss/history/otc/providers/nsd/markets/{market}/daily.json{?history.date}")
    Maybe<Response47> get47(
            @PathVariable
                    String market,
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate
    );

    @Operation(description = "Ежедневные обобщенные данные ОТС ПФИ и РЕПО.")
    @Get(value = "/iss/history/otc/providers/nsd/markets/{market}/monthly.json{?history.year,history.month}")
    Maybe<Response48> get48(
            @PathVariable
                    String market,
            @Nullable
            @QueryValue(value = "history.year")
                    String historyYear,
            @Nullable
            @QueryValue(value = "history.month")
                    String historyMonth
    );


    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}/candleborders.json{?}")
    Maybe<Response49> get49(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security
    );

    @Operation(description = "Получить свечи указанного инструмента по выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}/candles.json{?candles.start,candles.till,candles.from,candles.interval,candles.iss.reverse}")
    Maybe<Response50> get50(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "candles.start")
                    String candlesStart,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "candles.till")
                    String candlesTill,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "candles.from")
                    String candlesFrom,
            @Parameter(description = "Интервал графика.")
            @Nullable
            @QueryValue(value = "candles.interval")
                    String candlesInterval,
            @Parameter(description = "Изменить порядок сортировки на обратный. Принимает значения true/false.")
            @Nullable
            @QueryValue(value = "candles.iss.reverse")
                    String candlesIssReverse
    );

    @Operation(description = "Получить свечи указанного инструмента по выбранному режиму торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/securities/{security}/candles.json{?candles.start,candles.till,candles.from,candles.interval,candles.iss.reverse}")
    Maybe<Response51> get51(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "candles.start")
                    String candlesStart,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "candles.till")
                    String candlesTill,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "candles.from")
                    String candlesFrom,
            @Parameter(description = "Интервал графика.")
            @Nullable
            @QueryValue(value = "candles.interval")
                    String candlesInterval,
            @Parameter(description = "Изменить порядок сортировки на обратный. Принимает значения true/false.")
            @Nullable
            @QueryValue(value = "candles.iss.reverse")
                    String candlesIssReverse
    );

    @Operation(description = "Получить период дат рассчитанных свечей.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/securities/{security}/candleborders.json{?}")
    Maybe<Response52> get52(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security
    );

    @Operation(description = "Получить все сделки по выбранному режиму торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/trades.json{?trades.previous_session,trades.tradeno,trades.limit,trades.reversed,trades.securities,trades.start,trades_yields.tradeno,trades_yields.limit,trades_yields.reversed,trades_yields.securities,trades_yields.start,trades_yields.yielddatetype}")
    Maybe<Response53> get53(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Сделки предыдущей сессии для forts и options рынков. И для индексов. ")
            @Nullable
            @QueryValue(value = "trades.previous_session")
                    String tradesPreviousSession,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные.")
            @Nullable
            @QueryValue(value = "trades.tradeno")
                    String tradesTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades.limit")
                    String tradesLimit,
            @Parameter(description = "обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades.reversed")
                    String tradesReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades.securities")
                    String tradesSecurities,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "trades.start")
                    Integer tradesStart,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные. ")
            @Nullable
            @QueryValue(value = "trades_yields.tradeno")
                    String tradesYieldsTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades_yields.limit")
                    String tradesYieldsLimit,
            @Parameter(description = "Обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades_yields.reversed")
                    String tradesYieldsReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades_yields.securities")
                    String tradesYieldsSecurities,
            @Nullable
            @QueryValue(value = "trades_yields.start")
                    Integer tradesYieldsStart,
            @Parameter(description = "Тип доходности. Возможные значения - MBS - MATDATE - OFFERDATE")
            @Nullable
            @QueryValue(value = "trades_yields.yielddatetype")
                    String tradesYieldsYielddatetype
    );

    @Operation(description = "Получить все лучшие котировки по выбранному режиму торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boards/{board}/orderbook.json{?orderbook.start,orderbook.seqnum,orderbook.securities}")
    Maybe<Response54> get54(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "orderbook.start")
                    Integer orderbookStart,
            @Parameter(description = "(Устарел) Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "orderbook.seqnum")
                    Integer orderbookSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "orderbook.securities")
                    String orderbookSecurities
    );

    @Operation(description = "Получить справочник групп режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups.json{?}")
    Maybe<Response55> get55(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Получить описание группы режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}.json{?}")
    Maybe<Response56> get56(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup
    );

    @Operation(description = "Получить список всех инструментов, торгуемых на выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities.json{?securities.securities,securities.sectypes,securities.nearest,securities.leaders,securities.sort_order,securities.sort_column,securities.first,securities.previous_session,securities.security_collection,securities.index,marketdata.securities,marketdata.sectypes,marketdata.nearest,marketdata.leaders,marketdata.sort_column,marketdata.sort_order,marketdata.first,marketdata.previous_session,marketdata.index,marketdata.seqnum,marketdata_yields.securities,marketdata_yields.sectypes,marketdata_yields.nearest,marketdata_yields.leaders,marketdata_yields.sort_column,marketdata_yields.sort_order,marketdata_yields.first,marketdata_yields.previous_session,marketdata_yields.index,marketdata_yields.seqnum}")
    Maybe<Response57> get57(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "securities.securities")
                    String securitiesSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка)")
            @Nullable
            @QueryValue(value = "securities.sectypes")
                    String securitiesSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "securities.nearest")
                    String securitiesNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options)")
            @Nullable
            @QueryValue(value = "securities.leaders")
                    String securitiesLeaders,
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Nullable
            @QueryValue(value = "securities.sort_column")
                    String securitiesSortColumn,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "securities.first")
                    String securitiesFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков  ")
            @Nullable
            @QueryValue(value = "securities.previous_session")
                    String securitiesPreviousSession,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "securities.security_collection")
                    String securitiesSecurityCollection,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "securities.index")
                    String securitiesIndex,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata.securities")
                    String marketdataSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata.sectypes")
                    String marketdataSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata.nearest")
                    String marketdataNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata.leaders")
                    String marketdataLeaders,
            @Nullable
            @QueryValue(value = "marketdata.sort_column")
                    String marketdataSortColumn,
            @Nullable
            @QueryValue(value = "marketdata.sort_order")
                    String marketdataSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata.first")
                    String marketdataFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata.previous_session")
                    String marketdataPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata.index")
                    String marketdataIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata.seqnum")
                    Integer marketdataSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata_yields.securities")
                    String marketdataYieldsSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata_yields.sectypes")
                    String marketdataYieldsSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata_yields.nearest")
                    String marketdataYieldsNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata_yields.leaders")
                    String marketdataYieldsLeaders,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_column")
                    String marketdataYieldsSortColumn,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_order")
                    String marketdataYieldsSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata_yields.first")
                    String marketdataYieldsFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata_yields.previous_session")
                    String marketdataYieldsPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata_yields.index")
                    String marketdataYieldsIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata_yields.seqnum")
                    Integer marketdataYieldsSeqnum
    );

    @Operation(description = "Получить данные по указанному инструменту, торгуемому на выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}.json{?securities.securities,securities.sectypes,securities.nearest,securities.leaders,securities.sort_order,securities.sort_column,securities.first,securities.previous_session,securities.security_collection,securities.index,marketdata.securities,marketdata.sectypes,marketdata.nearest,marketdata.leaders,marketdata.sort_column,marketdata.sort_order,marketdata.first,marketdata.previous_session,marketdata.index,marketdata.seqnum,marketdata_yields.securities,marketdata_yields.sectypes,marketdata_yields.nearest,marketdata_yields.leaders,marketdata_yields.sort_column,marketdata_yields.sort_order,marketdata_yields.first,marketdata_yields.previous_session,marketdata_yields.index,marketdata_yields.seqnum}")
    Maybe<Response58> get58(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH (не более 10 инструментов).")
            @Nullable
            @QueryValue(value = "securities.securities")
                    String securitiesSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка)")
            @Nullable
            @QueryValue(value = "securities.sectypes")
                    String securitiesSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "securities.nearest")
                    String securitiesNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options)")
            @Nullable
            @QueryValue(value = "securities.leaders")
                    String securitiesLeaders,
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Nullable
            @QueryValue(value = "securities.sort_column")
                    String securitiesSortColumn,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "securities.first")
                    String securitiesFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков  ")
            @Nullable
            @QueryValue(value = "securities.previous_session")
                    String securitiesPreviousSession,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "securities.security_collection")
                    String securitiesSecurityCollection,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "securities.index")
                    String securitiesIndex,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata.securities")
                    String marketdataSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata.sectypes")
                    String marketdataSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata.nearest")
                    String marketdataNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata.leaders")
                    String marketdataLeaders,
            @Nullable
            @QueryValue(value = "marketdata.sort_column")
                    String marketdataSortColumn,
            @Nullable
            @QueryValue(value = "marketdata.sort_order")
                    String marketdataSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata.first")
                    String marketdataFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata.previous_session")
                    String marketdataPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata.index")
                    String marketdataIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata.seqnum")
                    Integer marketdataSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: https://iss.moex.com/iss/engines/stock/markets/shares/securities?securities=GAZP,AFLT,LKOH Ограничение: 10 инструментов.")
            @Nullable
            @QueryValue(value = "marketdata_yields.securities")
                    String marketdataYieldsSecurities,
            @Parameter(description = "Фильтр по типу инструмента (только для срочного рынка). Например: https://iss.moex.com/iss/engines/futures/markets/forts/securities?sectypes=ri,gz Ограничения: не более 5 типов бумаг.")
            @Nullable
            @QueryValue(value = "marketdata_yields.sectypes")
                    String marketdataYieldsSectypes,
            @Parameter(description = "Выводить фьючерсы с ближайшей датой погашения")
            @Nullable
            @QueryValue(value = "marketdata_yields.nearest")
                    String marketdataYieldsNearest,
            @Parameter(description = "Лидеры торгов (только для futures/options и индексов фондового рынка)")
            @Nullable
            @QueryValue(value = "marketdata_yields.leaders")
                    String marketdataYieldsLeaders,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_column")
                    String marketdataYieldsSortColumn,
            @Nullable
            @QueryValue(value = "marketdata_yields.sort_order")
                    String marketdataYieldsSortOrder,
            @Parameter(description = "Отдать n первых строк")
            @Nullable
            @QueryValue(value = "marketdata_yields.first")
                    String marketdataYieldsFirst,
            @Parameter(description = "Данные предыдущей сессии для forts и options рынков")
            @Nullable
            @QueryValue(value = "marketdata_yields.previous_session")
                    String marketdataYieldsPreviousSession,
            @Parameter(description = "Выводить акции из базы индекса. Только для фондового рынка.")
            @Nullable
            @QueryValue(value = "marketdata_yields.index")
                    String marketdataYieldsIndex,
            @Parameter(description = "Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "marketdata_yields.seqnum")
                    Integer marketdataYieldsSeqnum
    );

    @Operation(description = "Получить сделки выбранного инструмента, торгуемого на выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}/trades.json{?trades.tradeno,trades.securities,trades.limit,trades.reversed,trades.previous_session,trades.start,trades_yields.tradeno,trades_yields.limit,trades_yields.reversed,trades_yields.securities,trades_yields.start,trades_yields.yielddatetype}")
    Maybe<Response59> get59(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные.")
            @Nullable
            @QueryValue(value = "trades.tradeno")
                    String tradesTradeno,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades.securities")
                    String tradesSecurities,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades.limit")
                    String tradesLimit,
            @Parameter(description = "обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades.reversed")
                    String tradesReversed,
            @Parameter(description = "Сделки предыдущей сессии для forts и options рынков. И для индексов. ")
            @Nullable
            @QueryValue(value = "trades.previous_session")
                    String tradesPreviousSession,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "trades.start")
                    Integer tradesStart,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные. ")
            @Nullable
            @QueryValue(value = "trades_yields.tradeno")
                    String tradesYieldsTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades_yields.limit")
                    String tradesYieldsLimit,
            @Parameter(description = "Обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades_yields.reversed")
                    String tradesYieldsReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades_yields.securities")
                    String tradesYieldsSecurities,
            @Nullable
            @QueryValue(value = "trades_yields.start")
                    Integer tradesYieldsStart,
            @Parameter(description = "Тип доходности. Возможные значения - MBS - MATDATE - OFFERDATE")
            @Nullable
            @QueryValue(value = "trades_yields.yielddatetype")
                    String tradesYieldsYielddatetype
    );

    @Operation(description = "Получить лучшие заявки выбранного инструмента, торгуемого на выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}/orderbook.json{?orderbook.start,orderbook.seqnum,orderbook.securities}")
    Maybe<Response60> get60(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "orderbook.start")
                    Integer orderbookStart,
            @Parameter(description = "(Устарел) Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "orderbook.seqnum")
                    Integer orderbookSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "orderbook.securities")
                    String orderbookSecurities
    );

    @Operation(description = "Получить сделки инструментов, торгуемых на выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/trades.json{?trades.tradeno,trades.securities,trades.limit,trades.reversed,trades.previous_session,trades.start,trades_yields.tradeno,trades_yields.limit,trades_yields.reversed,trades_yields.securities,trades_yields.start,trades_yields.yielddatetype}")
    Maybe<Response61> get61(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные.")
            @Nullable
            @QueryValue(value = "trades.tradeno")
                    String tradesTradeno,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades.securities")
                    String tradesSecurities,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades.limit")
                    String tradesLimit,
            @Parameter(description = "обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades.reversed")
                    String tradesReversed,
            @Parameter(description = "Сделки предыдущей сессии для forts и options рынков. И для индексов. ")
            @Nullable
            @QueryValue(value = "trades.previous_session")
                    String tradesPreviousSession,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "trades.start")
                    Integer tradesStart,
            @Parameter(description = "Номер сделки, с которого следует начать возвращать данные. ")
            @Nullable
            @QueryValue(value = "trades_yields.tradeno")
                    String tradesYieldsTradeno,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 100, 1000, 5000")
            @Nullable
            @QueryValue(value = "trades_yields.limit")
                    String tradesYieldsLimit,
            @Parameter(description = "Обратный порядок сортировки")
            @Nullable
            @QueryValue(value = "trades_yields.reversed")
                    String tradesYieldsReversed,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "trades_yields.securities")
                    String tradesYieldsSecurities,
            @Nullable
            @QueryValue(value = "trades_yields.start")
                    Integer tradesYieldsStart,
            @Parameter(description = "Тип доходности. Возможные значения - MBS - MATDATE - OFFERDATE")
            @Nullable
            @QueryValue(value = "trades_yields.yielddatetype")
                    String tradesYieldsYielddatetype
    );

    @Operation(description = "Получить лучшие заявки всех инструментов, торгуемых на выбранной группе режимов торгов.")
    @Get(value = "/iss/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/orderbook.json{?orderbook.start,orderbook.seqnum,orderbook.securities}")
    Maybe<Response62> get62(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "orderbook.start")
                    Integer orderbookStart,
            @Parameter(description = "(Устарел) Номер обновления. Инкрементальный параметр, используется клиентскими приложениями для получения только обновлений данных.")
            @Nullable
            @QueryValue(value = "orderbook.seqnum")
                    Integer orderbookSeqnum,
            @Parameter(description = "Фильтр-список инструментов. Получение данных производится только по инстурментам из списка securities. Например: securities=GAZP,AFLT,LKOH")
            @Nullable
            @QueryValue(value = "orderbook.securities")
                    String orderbookSecurities
    );

    @Operation(description = "Информация по техническому изменению торговых кодов")
    @Get(value = "/iss/history/engines/stock/markets/shares/securities/changeover.json{?}")
    Maybe<Response63> get63(
    );

    @Operation(description = "История изменения параметров КБД (Кривая Бескупоной Доходности).")
    @Get(value = "/iss/history/engines/stock/zcyc.json{?params.date,params.time}")
    Maybe<Response64> get64(
            @Nullable
            @QueryValue(value = "params.date")
                    String paramsDate,
            @Parameter(description = "Если указано - выдается ближайшее значение КБД к данному моменту времени.")
            @Nullable
            @QueryValue(value = "params.time")
                    String paramsTime
    );

    @Operation(description = "Получить историю по всем бумагам на рынке за одну дату. Например: https://iss.moex.com/iss/history/engines/stock/markets/index/securities.xml?date=2010-11-22")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response65> get65(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю рассчитанных доходностей для всех бумаг на указанном режиме торгов отфильтрованных по дате.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/yields.json{?history_yields.sort_order,history_yields.sort_order_desc,history_yields.date,history_yields.numtrades,history_yields.interim,history_yields.security_collection,history_yields.assetcode,history_yields.sort_column,history_yields.limit,history_yields.start}")
    Maybe<Response66> get66(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order")
                    String historyYieldsSortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order_desc")
                    String historyYieldsSortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.date")
                    String historyYieldsDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history_yields.numtrades")
                    String historyYieldsNumtrades,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history_yields.interim")
                    String historyYieldsInterim,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history_yields.security_collection")
                    String historyYieldsSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history_yields.assetcode")
                    String historyYieldsAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history_yields.sort_column")
                    String historyYieldsSortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history_yields.limit")
                    String historyYieldsLimit,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history_yields.start")
                    Integer historyYieldsStart
    );

    @Operation(description = "Получить даты, за которые доступны данные на указанных рынке и торговой системе.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/dates.json{?dates.interim,dates.tradingsession}")
    Maybe<Response67> get67(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Parameter(description = "Показать интервал дат промежуточных итогов торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "dates.interim")
                    String datesInterim,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "dates.tradingsession")
                    String datesTradingsession
    );

    @Operation(description = "Получить историю по одной бумаге на рынке за интервал дат. ")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/securities/{security}.json{?history.limit,history.sort_column,history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.tradingsession,history.cursor.start,history.cursor.from,history.cursor.till,history.cursor.numtrades,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response68> get68(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.from")
                    String historyCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.till")
                    String historyCursorTill,
            @Parameter(description = "Минимальное количество сделок с бумагой. ")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю доходностей по одной бумаге на рынке за интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/yields/{security}.json{?history_yields.sort_order,history_yields.sort_order_desc,history_yields.from,history_yields.till,history_yields.numtrades,history_yields.limit,history_yields.sort_column,history_yields.start}")
    Maybe<Response69> get69(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history_yields.sort_order")
                    String historyYieldsSortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order_desc")
                    String historyYieldsSortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.from")
                    String historyYieldsFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.till")
                    String historyYieldsTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history_yields.numtrades")
                    String historyYieldsNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history_yields.limit")
                    String historyYieldsLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history_yields.sort_column")
                    String historyYieldsSortColumn,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history_yields.start")
                    Integer historyYieldsStart
    );

    @Operation(description = "Получить интервал дат в истории для указанного рынка и бумаги.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/securities/{security}/dates.json{?dates.tradingsession,dates.interim}")
    Maybe<Response70> get70(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "dates.tradingsession")
                    String datesTradingsession,
            @Parameter(description = "Показать интервал дат промежуточных итогов торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "dates.interim")
                    String datesInterim
    );

    @Operation(description = "Получить интервал дат, доступных в истории для рынка по заданному режиму торгов.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/dates.json{?dates.tradingsession,dates.interim}")
    Maybe<Response71> get71(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "dates.tradingsession")
                    String datesTradingsession,
            @Parameter(description = "Показать интервал дат промежуточных итогов торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "dates.interim")
                    String datesInterim
    );

    @Operation(description = "Получить историю торгов для всех бумаг на указанном режиме торгов отфильтрованных по дате.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response72> get72(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю доходностей для всех бумаг на указанном режиме торгов отфильтрованных по дате.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/yields.json{?history_yields.sort_order,history_yields.sort_order_desc,history_yields.date,history_yields.numtrades,history_yields.interim,history_yields.security_collection,history_yields.assetcode,history_yields.sort_column,history_yields.limit,history_yields.start}")
    Maybe<Response73> get73(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order")
                    String historyYieldsSortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order_desc")
                    String historyYieldsSortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.date")
                    String historyYieldsDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history_yields.numtrades")
                    String historyYieldsNumtrades,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history_yields.interim")
                    String historyYieldsInterim,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history_yields.security_collection")
                    String historyYieldsSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history_yields.assetcode")
                    String historyYieldsAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history_yields.sort_column")
                    String historyYieldsSortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history_yields.limit")
                    String historyYieldsLimit,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history_yields.start")
                    Integer historyYieldsStart
    );

    @Operation(description = "Получить историю торгов для указанной бумаги на указанном режиме торгов за указанный интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/securities/{security}.json{?history.limit,history.sort_column,history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.tradingsession}")
    Maybe<Response74> get74(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession
    );

    @Operation(description = "Получить историю доходностей для указанной бумаги на указанном режиме торгов за указанный интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/yields/{security}.json{?history_yields.sort_order,history_yields.sort_order_desc,history_yields.from,history_yields.till,history_yields.numtrades,history_yields.limit,history_yields.sort_column,history_yields.start}")
    Maybe<Response75> get75(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history_yields.sort_order")
                    String historyYieldsSortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order_desc")
                    String historyYieldsSortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.from")
                    String historyYieldsFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.till")
                    String historyYieldsTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history_yields.numtrades")
                    String historyYieldsNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history_yields.limit")
                    String historyYieldsLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history_yields.sort_column")
                    String historyYieldsSortColumn,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history_yields.start")
                    Integer historyYieldsStart
    );

    @Operation(description = "Получить интервал дат в истории, за которые доступна указанная бумага на рынке на указанном режиме торгов.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boards/{board}/securities/{security}/dates.json{?dates.tradingsession,dates.interim}")
    Maybe<Response76> get76(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "dates.tradingsession")
                    String datesTradingsession,
            @Parameter(description = "Показать интервал дат промежуточных итогов торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "dates.interim")
                    String datesInterim
    );

    @Operation(description = "Получить интервал дат для указанной группы режимов торгов.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/dates.json{?dates.tradingsession,dates.interim}")
    Maybe<Response77> get77(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "dates.tradingsession")
                    String datesTradingsession,
            @Parameter(description = "Показать интервал дат промежуточных итогов торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "dates.interim")
                    String datesInterim
    );

    @Operation(description = "Получить историю аукционов даркпул отфильтрованных по дате.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession,auctions.date}")
    Maybe<Response78> get78(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "auctions.date")
                    String auctionsDate
    );

    @Operation(description = "Получить историю аукционов даркпул за интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}.json{?history.limit,history.sort_column,history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.tradingsession,auctions.from,auctions.till,auctions.start,auctions.cursor.from,auctions.cursor.till,auctions.cursor.start}")
    Maybe<Response79> get79(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "auctions.from")
                    String auctionsFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "auctions.till")
                    String auctionsTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "auctions.start")
                    Integer auctionsStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "auctions.cursor.from")
                    String auctionsCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "auctions.cursor.till")
                    String auctionsCursorTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "auctions.cursor.start")
                    String auctionsCursorStart
    );

    @Operation(description = "Получить историю торгов для всех бумаг на указанной группе режимов торгов за указанную дату.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities.json{?history.security_collection,history.assetcode,history.sort_column,history.limit,history.sort_order,history.sort_order_desc,history.date,history.numtrades,history.start,history.tradingsession,history.interim,history.cursor.start,history.cursor.date,history.cursor.interim,history.cursor.security_type_id,history.cursor.numtrades,history.cursor.security_collection,history.cursor.assetcode,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response80> get80(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.security_collection")
                    String historySecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.assetcode")
                    String historyAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.interim")
                    String historyInterim,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.date")
                    String historyCursorDate,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history.cursor.interim")
                    String historyCursorInterim,
            @Parameter(description = "Фильтровать по типу бумаг")
            @Nullable
            @QueryValue(value = "history.cursor.security_type_id")
                    String historyCursorSecurityTypeId,
            @Parameter(description = "Минимальное количество сделок с бумагой")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history.cursor.security_collection")
                    String historyCursorSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history.cursor.assetcode")
                    String historyCursorAssetcode,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить доходности торгов для всех бумаг на указанной группе режимов торгов за указанную дату.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/yields.json{?history_yields.sort_order,history_yields.sort_order_desc,history_yields.date,history_yields.numtrades,history_yields.interim,history_yields.security_collection,history_yields.assetcode,history_yields.sort_column,history_yields.limit,history_yields.start}")
    Maybe<Response81> get81(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @Parameter(description = "Порядок сортировки. Доступные значения 'asc' и 'desc'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order")
                    String historyYieldsSortOrder,
            @Parameter(description = "(Устарело) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order_desc")
                    String historyYieldsSortOrderDesc,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.date")
                    String historyYieldsDate,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history_yields.numtrades")
                    String historyYieldsNumtrades,
            @Parameter(description = "Показать промежуточные итоги торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "history_yields.interim")
                    String historyYieldsInterim,
            @Parameter(description = "Фильтр по коллекции")
            @Nullable
            @QueryValue(value = "history_yields.security_collection")
                    String historyYieldsSecurityCollection,
            @Parameter(description = "Фильтр по коду базового актива.  Только для Фьючерсов и опционов.")
            @Nullable
            @QueryValue(value = "history_yields.assetcode")
                    String historyYieldsAssetcode,
            @Parameter(description = "Поле по которому сортируются выдача данных.")
            @Nullable
            @QueryValue(value = "history_yields.sort_column")
                    String historyYieldsSortColumn,
            @Parameter(description = "Количество отдаваемых строк. Доступные значения: 100, 50, 20, 10, 5, 1")
            @Nullable
            @QueryValue(value = "history_yields.limit")
                    String historyYieldsLimit,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history_yields.start")
                    Integer historyYieldsStart
    );

    @Operation(description = "Получить историю торгов для указанной бумаги на выбранной группе режимов торгов за указанный интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}.json{?history.limit,history.sort_column,history.sort_order,history.sort_order_desc,history.from,history.till,history.numtrades,history.start,history.tradingsession,history.cursor.start,history.cursor.from,history.cursor.till,history.cursor.numtrades,history.cursor.limit,history.cursor.tradingsession}")
    Maybe<Response82> get82(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history.sort_column")
                    String historySortColumn,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history.sort_order_desc")
                    String historySortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history.numtrades")
                    String historyNumtrades,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history.start")
                    Integer historyStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.tradingsession")
                    String historyTradingsession,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.from")
                    String historyCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history.cursor.till")
                    String historyCursorTill,
            @Parameter(description = "Минимальное количество сделок с бумагой. ")
            @Nullable
            @QueryValue(value = "history.cursor.numtrades")
                    String historyCursorNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "history.cursor.tradingsession")
                    String historyCursorTradingsession
    );

    @Operation(description = "Получить историю доходностей для указанной бумаги на выбранной группе режимов торгов за указанный интервал дат.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/yields/{security}.json{?history_yields.sort_order,history_yields.sort_order_desc,history_yields.from,history_yields.till,history_yields.numtrades,history_yields.limit,history_yields.sort_column,history_yields.start}")
    Maybe<Response83> get83(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Направление сортировки. - 'asc' - По возрастанию значения - 'desc' - По убыванию ")
            @Nullable
            @QueryValue(value = "history_yields.sort_order")
                    String historyYieldsSortOrder,
            @Parameter(description = "(Устаревшее) Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "history_yields.sort_order_desc")
                    String historyYieldsSortOrderDesc,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.from")
                    String historyYieldsFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "history_yields.till")
                    String historyYieldsTill,
            @Parameter(description = "Минимальное количество сделок с бумагой.")
            @Nullable
            @QueryValue(value = "history_yields.numtrades")
                    String historyYieldsNumtrades,
            @Parameter(description = "Количество выводимых бумаг доступны значения (1, 5, 10, 20, 50, 100)")
            @Nullable
            @QueryValue(value = "history_yields.limit")
                    String historyYieldsLimit,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "history_yields.sort_column")
                    String historyYieldsSortColumn,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "history_yields.start")
                    Integer historyYieldsStart
    );

    @Operation(description = "Получить интервал дат для указанной бумаги на заданной группе режимов торгов.")
    @Get(value = "/iss/history/engines/{engine}/markets/{market}/boardgroups/{boardgroup}/securities/{security}/dates.json{?dates.tradingsession,dates.interim}")
    Maybe<Response84> get84(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String boardgroup,
            @PathVariable
                    String security,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "dates.tradingsession")
                    String datesTradingsession,
            @Parameter(description = "Показать интервал дат промежуточных итогов торгов (только для валютного рынка)")
            @Nullable
            @QueryValue(value = "dates.interim")
                    String datesInterim
    );

    @Operation(description = "Список годов, за которые существуют ссылки на файлы с архивом сделок и исторической биржевой информацией. datatype может принимать значения securities или trades.")
    @Get(value = "/iss/archives/engines/{engine}/markets/{market}/{datatype}/years.json{?}")
    Maybe<Response85> get85(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String datatype
    );

    @Operation(description = "Получить список ccылок на годовые/месячные/дневные файлы с архивом сделок и исторической биржевой информацией. datatype может принимать значения securities или trades.  period может принимать значения yearly, monthly или daily. Помесячные данные доступны только за последние 30 дней.")
    @Get(value = "/iss/archives/engines/{engine}/markets/{market}/{datatype}/{period}.json{?files.format,files.year,files.month}")
    Maybe<Response86> get86(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String datatype,
            @PathVariable
                    String period,
            @Parameter(description = "На какой формат данных отдавать ссылку: csv,json,xml По умолчанию отдаётся на файлы в запрашиваемом формате. ")
            @Nullable
            @QueryValue(value = "files.format")
                    String filesFormat,
            @Parameter(description = "Фильтр по году")
            @Nullable
            @QueryValue(value = "files.year")
                    String filesYear,
            @Parameter(description = "Фильтр по месяцу")
            @Nullable
            @QueryValue(value = "files.month")
                    String filesMonth
    );

    @Operation(description = "Список месяцев в году, за которые существуют ссылки на файлы с архивом сделок и исторической биржевой информацией. datatype может принимать значения securities или trades.")
    @Get(value = "/iss/archives/engines/{engine}/markets/{market}/{datatype}/years/{year}/months.json{?}")
    Maybe<Response87> get87(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String datatype,
            @PathVariable
                    String year
    );

    @Operation(description = "Группы ценных бумаг")
    @Get(value = "/iss/securitygroups.json{?securitygroups.trade_engine,securitygroups.hide_inactive,securitygroups.securitygroups}")
    Maybe<Response88> get88(
            @Nullable
            @QueryValue(value = "securitygroups.trade_engine")
                    String securitygroupsTradeEngine,
            @Nullable
            @QueryValue(value = "securitygroups.hide_inactive")
                    String securitygroupsHideInactive,
            @Nullable
            @QueryValue(value = "securitygroups.securitygroups")
                    String securitygroupsSecuritygroups
    );

    @Operation(description = "Группа ценных бумаг")
    @Get(value = "/iss/securitygroups/{securitygroup}.json{?securitygroups.trade_engine,securitygroups.hide_inactive,securitygroups.securitygroups}")
    Maybe<Response89> get89(
            @PathVariable
                    String securitygroup,
            @Nullable
            @QueryValue(value = "securitygroups.trade_engine")
                    String securitygroupsTradeEngine,
            @Nullable
            @QueryValue(value = "securitygroups.hide_inactive")
                    String securitygroupsHideInactive,
            @Nullable
            @QueryValue(value = "securitygroups.securitygroups")
                    String securitygroupsSecuritygroups
    );

    @Operation(description = "Коллекции ценных бумаг входящие в группу")
    @Get(value = "/iss/securitygroups/{securitygroup}/collections.json{?}")
    Maybe<Response90> get90(
            @PathVariable
                    String securitygroup
    );

    @Operation(description = "Коллекция ценных бумаг входящие в группу")
    @Get(value = "/iss/securitygroups/{securitygroup}/collections/{collection}.json{?}")
    Maybe<Response91> get91(
            @PathVariable
                    String securitygroup,
            @PathVariable
                    String collection
    );

    @Operation(description = "Описание инструментов")
    @Get(value = "/iss/securitygroups/{securitygroup}/collections/{collection}/securities.json{?securities.start,securities.sort_order,securities.sort_order_desc,securities.cursor.start}")
    Maybe<Response92> get92(
            @PathVariable
                    String securitygroup,
            @PathVariable
                    String collection,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    String securitiesStart,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "securities.sort_order")
                    String securitiesSortOrder,
            @Parameter(description = "Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "securities.sort_order_desc")
                    String securitiesSortOrderDesc,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.cursor.start")
                    String securitiesCursorStart
    );

    @Operation(description = "Типы ценных бумаг")
    @Get(value = "/iss/securitytypes.json{?}")
    Maybe<Response93> get93(
    );

    @Operation(description = "Справочник: тип ценной бумаги")
    @Get(value = "/iss/securitytypes/{securitytype}.json{?}")
    Maybe<Response94> get94(
            @PathVariable
                    String securitytype
    );

    @Operation(description = "Коэффициенты корелляции фондового рынка")
    @Get(value = "/iss/statistics/engines/stock/markets/shares/correlations.json{?coefficients.date,coefficients.start,coefficients.cursor.date,coefficients.cursor.start}")
    Maybe<Response95> get95(
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "coefficients.date")
                    String coefficientsDate,
            @Nullable
            @QueryValue(value = "coefficients.start")
                    Integer coefficientsStart,
            @Nullable
            @QueryValue(value = "coefficients.cursor.date")
                    String coefficientsCursorDate,
            @Nullable
            @QueryValue(value = "coefficients.cursor.start")
                    Integer coefficientsCursorStart
    );

    @Operation(description = "Курсы ЦБРФ")
    @Get(value = "/iss/statistics/engines/currency/markets/selt/rates.json{?}")
    Maybe<Response96> get96(
    );

    @Operation(description = "Справочник дроблений и консолидаций бумаг фондового рынка")
    @Get(value = "/iss/statistics/engines/stock/splits.json{?}")
    Maybe<Response97> get97(
    );


    @Get(value = "/iss/statistics/engines/stock/splits/{security}.json{?}")
    Maybe<Response98> get98(
            @PathVariable
                    String security
    );


    @Get(value = "/iss/statistics/engines/state/markets/repo/mirp.json{?data.date,data.sort_order,data.sort_order_desc,data.start,data.cursor.date,data.cursor.start}")
    Maybe<Response99> get99(
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "data.date")
                    String dataDate,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "data.sort_order")
                    String dataSortOrder,
            @Parameter(description = "Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "data.sort_order_desc")
                    String dataSortOrderDesc,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "data.start")
                    Integer dataStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "data.cursor.date")
                    String dataCursorDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "data.cursor.start")
                    String dataCursorStart
    );


    @Get(value = "/iss/statistics/engines/state/markets/repo/dealers.json{?data.date}")
    Maybe<Response100> get100(
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "data.date")
                    String dataDate
    );

    @Operation(description = "Средневзвешенные ставки по операциям центрального банка")
    @Get(value = "/iss/statistics/engines/state/markets/repo/cboper.json{?date.date}")
    Maybe<Response101> get101(
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "date.date")
                    String dateDate
    );

    @Operation(description = "Показатели для определения критериев существенного отклонения")
    @Get(value = "/iss/statistics/engines/stock/deviationcoeffs.json{?securities.date,securities.start,securities.cursor.date,securities.cursor.start}")
    Maybe<Response102> get102(
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "securities.date")
                    String securitiesDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart,
            @Parameter(description = "Дата за которую необходимо вывести данные.  Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "securities.cursor.date")
                    String securitiesCursorDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.cursor.start")
                    String securitiesCursorStart
    );

    @Operation(description = "Cписок акций, по которым рассчитывается рыночная котировка")
    @Get(value = "/iss/statistics/engines/stock/quotedsecurities.json{?quotedsecurities.date}")
    Maybe<Response103> get103(
            @Nullable
            @QueryValue(value = "quotedsecurities.date")
                    String quotedsecuritiesDate
    );

    @Operation(description = "Текущие цены бумаг ")
    @Get(value = "/iss/statistics/engines/stock/currentprices.json{?currentprices.date,currentprices.start,currentprices.tradingsession,currentprices.dates.tradingsession}")
    Maybe<Response104> get104(
            @Nullable
            @QueryValue(value = "currentprices.date")
                    String currentpricesDate,
            @Nullable
            @QueryValue(value = "currentprices.start")
                    String currentpricesStart,
            @Parameter(description = "Фильтровать по типу торговой сессии:   1 - основная сессия   2 - вечерняя сессия   3 - суммарно по всем сессиям По умолчанию показываются все сессии.")
            @Nullable
            @QueryValue(value = "currentprices.tradingsession")
                    String currentpricesTradingsession,
            @Parameter(description = "Фильтровать по типу торговой сессии:   1 - основная сессия   2 - вечерняя сессия   3 - суммарно по всем сессиям По умолчанию показываются все сессии.")
            @Nullable
            @QueryValue(value = "currentprices.dates.tradingsession")
                    String currentpricesDatesTradingsession
    );

    @Operation(description = "Новости биржи")
    @Get(value = "/iss/sitenews.json{?sitenews.start,sitenews.cursor.start}")
    Maybe<Response105> get105(
            @Nullable
            @QueryValue(value = "sitenews.start")
                    String sitenewsStart,
            @Nullable
            @QueryValue(value = "sitenews.cursor.start")
                    String sitenewsCursorStart
    );

    @Operation(description = "Новость сайта")
    @Get(value = "/iss/sitenews/{news_id}.json{?}")
    Maybe<Response106> get106(
            @PathVariable
                    String news_id
    );

    @Operation(description = "Мероприятия биржи")
    @Get(value = "/iss/events.json{?events.start,events.cursor.start}")
    Maybe<Response107> get107(
            @Nullable
            @QueryValue(value = "events.start")
                    String eventsStart,
            @Nullable
            @QueryValue(value = "events.cursor.start")
                    String eventsCursorStart
    );

    @Operation(description = "Контент мероприятия биржи")
    @Get(value = "/iss/events/{event_id}.json{?}")
    Maybe<Response108> get108(
            @PathVariable
                    String event_id
    );

    @Operation(description = "Агрегированные показатели рынка облигаций")
    @Get(value = "/iss/statistics/engines/stock/markets/bonds/aggregates.json{?aggregates.date}")
    Maybe<Response109> get109(
            @Nullable
            @QueryValue(value = "aggregates.date")
                    String aggregatesDate
    );


    @Get(value = "/iss/statistics/engines/stock/markets/bonds/aggregates/columns.json{?}")
    Maybe<Response110> get110(
    );

    @Operation(description = "Индексы фондового рынка")
    @Get(value = "/iss/statistics/engines/stock/markets/index/analytics.json{?indices.security_collection}")
    Maybe<Response111> get111(
            @Nullable
            @QueryValue(value = "indices.security_collection")
                    String indicesSecurityCollection
    );


    @Get(value = "/iss/statistics/engines/stock/markets/index/analytics/columns.json{?}")
    Maybe<Response112> get112(
    );

    @Operation(description = "Аналитические показатели за дату")
    @Get(value = "/iss/statistics/engines/stock/markets/index/analytics/{indexid}.json{?analytics.date,analytics.limit,analytics.tickers,analytics.start,analytics.cursor.date,analytics.cursor.start,analytics.cursor.limit,analytics.cursor.tickers}")
    Maybe<Response113> get113(
            @PathVariable
                    String indexid,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "analytics.date")
                    String analyticsDate,
            @Parameter(description = "Количество выводимых бумаг (20,100)")
            @Nullable
            @QueryValue(value = "analytics.limit")
                    String analyticsLimit,
            @Nullable
            @QueryValue(value = "analytics.tickers")
                    String analyticsTickers,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "analytics.start")
                    Integer analyticsStart,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "analytics.cursor.date")
                    String analyticsCursorDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "analytics.cursor.start")
                    String analyticsCursorStart,
            @Parameter(description = "Количество выводимых бумаг (20,100)")
            @Nullable
            @QueryValue(value = "analytics.cursor.limit")
                    String analyticsCursorLimit,
            @Nullable
            @QueryValue(value = "analytics.cursor.tickers")
                    String analyticsCursorTickers
    );

    @Operation(description = "Список тикеров за все время торгов")
    @Get(value = "/iss/statistics/engines/stock/markets/index/analytics/{indexid}/tickers.json{?tickers.date}")
    Maybe<Response114> get114(
            @PathVariable
                    String indexid,
            @Parameter(description = "Показывать тикеры за конкретную дату")
            @Nullable
            @QueryValue(value = "tickers.date")
                    String tickersDate
    );

    @Operation(description = "Информация по тикеру")
    @Get(value = "/iss/statistics/engines/stock/markets/index/analytics/{indexid}/tickers/{ticker}.json{?ticker.from,ticker.till,ticker.start,ticker.cursor.from,ticker.cursor.till,ticker.cursor.start}")
    Maybe<Response115> get115(
            @PathVariable
                    String indexid,
            @PathVariable
                    String ticker,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "ticker.from")
                    String tickerFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "ticker.till")
                    String tickerTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "ticker.start")
                    Integer tickerStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "ticker.cursor.from")
                    String tickerCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "ticker.cursor.till")
                    String tickerCursorTill,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "ticker.cursor.start")
                    String tickerCursorStart
    );

    @Operation(description = "Индексы ММВБ для которых существует лист ожидания")
    @Get(value = "/iss/statistics/engines/stock/markets/index/waitlists.json{?}")
    Maybe<Response116> get116(
    );

    @Operation(description = "Лист ожидания по индексу")
    @Get(value = "/iss/statistics/engines/stock/markets/index/waitlists/{indexid}.json{?waitlist.sort_order,waitlist.sort_order_desc,waitlist.start,waitlist.cursor.start}")
    Maybe<Response117> get117(
            @PathVariable
                    String indexid,
            @Parameter(description = "Поле, по которому сортируется ответ.")
            @Nullable
            @QueryValue(value = "waitlist.sort_order")
                    String waitlistSortOrder,
            @Parameter(description = "Порядок сортировки. Доступные значения Пусто и 'DESC'.")
            @Nullable
            @QueryValue(value = "waitlist.sort_order_desc")
                    String waitlistSortOrderDesc,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "waitlist.start")
                    Integer waitlistStart,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "waitlist.cursor.start")
                    String waitlistCursorStart
    );

    @Operation(description = "Капитализация фондового рынка")
    @Get(value = "/iss/statistics/engines/stock/capitalization.json{?capitalization.type,capitalization.date}")
    Maybe<Response118> get118(
            @Parameter(description = "Тип капитализации. Доступные значения: daily, monthly")
            @Nullable
            @QueryValue(value = "capitalization.type")
                    String capitalizationType,
            @Nullable
            @QueryValue(value = "capitalization.date")
                    String capitalizationDate
    );

    @Operation(description = "Список режимов обобщенной информации по фондовому рынку")
    @Get(value = "/iss/history/engines/stock/totals/boards.json{?}")
    Maybe<Response119> get119(
    );

    @Operation(description = "Обобщенная информация по фондовому рынку ")
    @Get(value = "/iss/history/engines/stock/totals/securities.json{?securities.date,securities.start,securities.tradingsession,securities.cursor.date,securities.cursor.start,securities.cursor.tradingsession,securities.dates.tradingsession}")
    Maybe<Response120> get120(
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "securities.date")
                    String securitiesDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "securities.tradingsession")
                    String securitiesTradingsession,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "securities.cursor.date")
                    String securitiesCursorDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.cursor.start")
                    String securitiesCursorStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "securities.cursor.tradingsession")
                    String securitiesCursorTradingsession,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "securities.dates.tradingsession")
                    String securitiesDatesTradingsession
    );

    @Operation(description = "Обобщенная информация по фондовому рынку по выбранному режиму ")
    @Get(value = "/iss/history/engines/stock/totals/boards/{board}/securities.json{?securities.date,securities.start,securities.tradingsession,securities.cursor.date,securities.cursor.start,securities.cursor.tradingsession,securities.dates.tradingsession}")
    Maybe<Response121> get121(
            @PathVariable
                    String board,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "securities.date")
                    String securitiesDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.start")
                    Integer securitiesStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "securities.tradingsession")
                    String securitiesTradingsession,
            @Parameter(description = "Дата за которую необходимо вывести данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "securities.cursor.date")
                    String securitiesCursorDate,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "securities.cursor.start")
                    String securitiesCursorStart,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "securities.cursor.tradingsession")
                    String securitiesCursorTradingsession,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "securities.dates.tradingsession")
                    String securitiesDatesTradingsession
    );

    @Operation(description = "Обобщенная информация по фондовому рынку по выбранному режиму и инструменту ")
    @Get(value = "/iss/history/engines/stock/totals/boards/{board}/securities/{security}.json{?security.start,security.from,security.till,security.tradingsession,security.cursor.start,security.cursor.from,security.cursor.till,security.cursor.tradingsession,security.dates.tradingsession}")
    Maybe<Response122> get122(
            @PathVariable
                    String board,
            @PathVariable
                    String security,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "security.start")
                    Integer securityStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "security.from")
                    String securityFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "security.till")
                    String securityTill,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "security.tradingsession")
                    String securityTradingsession,
            @Parameter(description = "Номер строки (отсчет с нуля), с которой следует начать порцию возвращаемых данных (см. рук-во разработчика). Получение ответа без данных означает, что указанное значение превышает число строк, возвращаемых запросом.")
            @Nullable
            @QueryValue(value = "security.cursor.start")
                    String securityCursorStart,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "security.cursor.from")
                    String securityCursorFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "security.cursor.till")
                    String securityCursorTill,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "security.cursor.tradingsession")
                    String securityCursorTradingsession,
            @Parameter(description = "Показать данные только за необходимую сессию (только для фондового рынка) 1 - Основная 2 - Вечерняя 3 - Итого")
            @Nullable
            @QueryValue(value = "security.dates.tradingsession")
                    String securityDatesTradingsession
    );

    @Operation(description = "Индикаторы риска")
    @Get(value = "/iss/rms/engines/{engine}/objects/irr.json{?irr.date,irr.q,irr.group,irr.indicator,irr.currencyid,irr.instrument,irr.isin}")
    Maybe<Response123> get123(
            @PathVariable
                    String engine,
            @Nullable
            @QueryValue(value = "irr.date")
                    String irrDate,
            @Parameter(description = "Поиск по инструментам")
            @Nullable
            @QueryValue(value = "irr.q")
                    String irrQ,
            @Parameter(description = "Фильтр по полю 'Множество' ('group'). Можно использовать можно через запятую указывать несколько значений (не более 5 элементов). Поиск по подстроке невозможен.")
            @Nullable
            @QueryValue(value = "irr.group")
                    String irrGroup,
            @Parameter(description = "Фильтр по полю 'Индикатор множества' ('indicator'). Можно использовать можно через запятую указывать несколько значений (не более 5 элементов). Поиск по подстроке невозможен.")
            @Nullable
            @QueryValue(value = "irr.indicator")
                    String irrIndicator,
            @Parameter(description = "Фильтр по полю 'Валюта риска' ('currencyid)'. Можно использовать можно через запятую указывать несколько значений (не более 5 элементов). Поиск по подстроке невозможен.")
            @Nullable
            @QueryValue(value = "irr.currencyid")
                    String irrCurrencyid,
            @Parameter(description = "Фильтр по полю 'Торговый код бумаги' ('instrument)'. Можно использовать можно через запятую указывать несколько значений (не более 5 элементов). Поиск по подстроке невозможен.")
            @Nullable
            @QueryValue(value = "irr.instrument")
                    String irrInstrument,
            @Parameter(description = "Фильтр по полю 'ISIN' ('ISIN)'. Можно использовать можно через запятую указывать несколько значений (не более 5 элементов). Поиск по подстроке невозможен.")
            @Nullable
            @QueryValue(value = "irr.isin")
                    String irrIsin
    );

    @Operation(description = "Доступные параметры фильтрации для индикаторов рисков")
    @Get(value = "/iss/rms/engines/{engine}/objects/irr/filters.json{?}")
    Maybe<Response124> get124(
            @PathVariable
                    String engine
    );


    @Get(value = "/iss/statistics/engines/state/rates.json{?}")
    Maybe<Response125> get125(
    );


    @Get(value = "/iss/statistics/engines/state/rates/columns.json{?}")
    Maybe<Response126> get126(
    );

    @Operation(description = "Еженедельные отчеты по валютным деривативам:  numtrades - Информация о количестве договоров по инструментам, являющимся производными финансовыми инструментами (по валютным парам) participants - Информация о количестве лиц, имеющих открытые позиции по инструментам, являющимся производными финансовыми инструментами (по валютным парам) openpositions - Информация об открытых позициях по инструментам, являющимся производными финансовыми инструментами (по валютным парам) expirationparticipants - Информация о количестве лиц, имеющих открытые позиции по договорам, являющимся производными финансовыми инструментами (по срокам экспирации) expirationopenpositions - Информация об объеме открытых позиций по договорам, являющимся производными финансовыми инструментами (по срокам экспирации)")
    @Get(value = "/iss/statistics/engines/{engine}/derivatives/{report_name}.json{?data.date}")
    Maybe<Response127> get127(
            @PathVariable
                    String engine,
            @PathVariable
                    String report_name,
            @Parameter(description = "Дата формирования отчета")
            @Nullable
            @QueryValue(value = "data.date")
                    String dataDate
    );


    @Get(value = "/iss/statistics/engines/{engine}/monthly/{report_name}.json{?data.date}")
    Maybe<Response128> get128(
            @PathVariable
                    String engine,
            @PathVariable
                    String report_name,
            @Parameter(description = "Дата окончания отчетного периода")
            @Nullable
            @QueryValue(value = "data.date")
                    String dataDate
    );

    @Operation(description = "Фиксинги Московской биржи")
    @Get(value = "/iss/statistics/engines/currency/markets/fixing/{security}.json{?history.from,history.till,history.start,history.limit,history.sort_order,history.cursor.from,history.cursor.till,history.cursor.start,history.cursor.limit}")
    Maybe<Response129> get129(
            @PathVariable
                    String security,
            @Nullable
            @QueryValue(value = "history.from")
                    String historyFrom,
            @Nullable
            @QueryValue(value = "history.till")
                    String historyTill,
            @Nullable
            @QueryValue(value = "history.start")
                    String historyStart,
            @Nullable
            @QueryValue(value = "history.limit")
                    String historyLimit,
            @Parameter(description = "No description available.")
            @Nullable
            @QueryValue(value = "history.sort_order")
                    String historySortOrder,
            @Nullable
            @QueryValue(value = "history.cursor.from")
                    String historyCursorFrom,
            @Nullable
            @QueryValue(value = "history.cursor.till")
                    String historyCursorTill,
            @Nullable
            @QueryValue(value = "history.cursor.start")
                    String historyCursorStart,
            @Nullable
            @QueryValue(value = "history.cursor.limit")
                    String historyCursorLimit
    );

    @Operation(description = "Индикативные курсы валют срочного рынка")
    @Get(value = "/iss/statistics/engines/futures/markets/indicativerates/securities.json{?securities.date}")
    Maybe<Response130> get130(
            @Nullable
            @QueryValue(value = "securities.date")
                    String securitiesDate
    );

    @Operation(description = "Индикативный курс валют срочного рынка")
    @Get(value = "/iss/statistics/engines/futures/markets/indicativerates/securities/{security}.json{?securities.from,securities.till,securities.start,securities.cursor.from,securities.cursor.till,securities.cursor.start}")
    Maybe<Response131> get131(
            @PathVariable
                    String security,
            @Nullable
            @QueryValue(value = "securities.from")
                    String securitiesFrom,
            @Nullable
            @QueryValue(value = "securities.till")
                    String securitiesTill,
            @Nullable
            @QueryValue(value = "securities.start")
                    String securitiesStart,
            @Nullable
            @QueryValue(value = "securities.cursor.from")
                    String securitiesCursorFrom,
            @Nullable
            @QueryValue(value = "securities.cursor.till")
                    String securitiesCursorTill,
            @Nullable
            @QueryValue(value = "securities.cursor.start")
                    String securitiesCursorStart
    );

    @Operation(description = "Фиксинги Московской биржи")
    @Get(value = "/iss/statistics/engines/currency/markets/fixing.json{?history.date}")
    Maybe<Response132> get132(
            @Nullable
            @QueryValue(value = "history.date")
                    String historyDate
    );

    @Operation(description = "Курсы переоценки коллатеральных инструментов")
    @Get(value = "/iss/statistics/engines/{engine}/markets/{market}.json{?}")
    Maybe<Response133> get133(
            @PathVariable
                    String engine,
            @PathVariable
                    String market
    );

    @Operation(description = "Курсы переоценки коллатеральных инструментов")
    @Get(value = "/iss/statistics/engines/{engine}/markets/{market}/securities.json{?securities.date}")
    Maybe<Response134> get134(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @Nullable
            @QueryValue(value = "securities.date")
                    String securitiesDate
    );

    @Operation(description = "Курсы переоценки коллатеральных инструментов. Инструмент за интервал дат.")
    @Get(value = "/iss/statistics/engines/{engine}/markets/{market}/securities/{security}.json{?security.from,security.till,security.limit}")
    Maybe<Response135> get135(
            @PathVariable
                    String engine,
            @PathVariable
                    String market,
            @PathVariable
                    String security,
            @Parameter(description = "Дата, начиная с которой необходимо начать выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "security.from")
                    String securityFrom,
            @Parameter(description = "Дата, до которой выводить данные. Формат: ГГГГ-ММ-ДД.")
            @Nullable
            @QueryValue(value = "security.till")
                    String securityTill,
            @Parameter(description = "Количество строк в данных. Доступные значения: 1, 10, 20, 100, 1000, 5000, 10000. Значение по умолчанию 20")
            @Nullable
            @QueryValue(value = "security.limit")
                    String securityLimit
    );


    @Get(value = "/iss/analyticalproducts/netflow2/securities.json{?netflow2.date}")
    Maybe<Response136> get136(
            @Nullable
            @QueryValue(value = "netflow2.date")
                    String netflow2Date
    );


    @Get(value = "/iss/analyticalproducts/netflow2/securities/{security}.json{?netflow2.from,netflow2.till}")
    Maybe<Response137> get137(
            @PathVariable
                    String security,
            @Parameter(description = "Дата в формате YYYY-MM-DD начиная с которой отдаются данные.  Обратите внимание, что для данного запроса нет постраничной навигации. вам необходимо будет изменять параметр &from на дату следующую после полученных вами данных. Количество отдаваемых записей в одном блоке ограничено 1000.")
            @Nullable
            @QueryValue(value = "netflow2.from")
                    String netflow2From,
            @Parameter(description = "Дата в формате YYYY-MM-DD которой будет заканчиваться интервал. Данный параметр должен быть больше или равен параметру till. ")
            @Nullable
            @QueryValue(value = "netflow2.till")
                    String netflow2Till
    );


    @Get(value = "/iss/analyticalproducts/futoi/securities.json{?futoi.latest,futoi.date,futoi.table_type}")
    Maybe<Response138> get138(
            @Parameter(description = "Последний срез за день ('1'-включить)")
            @Nullable
            @QueryValue(value = "futoi.latest")
                    String futoiLatest,
            @Nullable
            @QueryValue(value = "futoi.date")
                    String futoiDate,
            @Nullable
            @QueryValue(value = "futoi.table_type")
                    String futoiTableType
    );


    @Get(value = "/iss/analyticalproducts/futoi/securities/{security}.json{?futoi.latest,futoi.from,futoi.till}")
    Maybe<Response139> get139(
            @PathVariable
                    String security,
            @Parameter(description = "Последний срез за день ('1'-включить)")
            @Nullable
            @QueryValue(value = "futoi.latest")
                    String futoiLatest,
            @Parameter(description = "Дата в формате YYYY-MM-DD начиная с которой отдаются данные.  Обратите внимание, что для данного запроса нет постраничной навигации. вам необходимо будет изменять параметр &from на дату следующую после полученных вами данных. Количество отдаваемых записей в одном блоке ограничено 1000.")
            @Nullable
            @QueryValue(value = "futoi.from")
                    String futoiFrom,
            @Parameter(description = "Дата в формате YYYY-MM-DD которой будет заканчиваться интервал. Данный параметр должен быть больше или равен параметру till. ")
            @Nullable
            @QueryValue(value = "futoi.till")
                    String futoiTill
    );

}