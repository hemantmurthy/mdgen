
package hamy.mdgen.api.generator.format.xai.CMIMDSeeder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initialMeasurementDataId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="bo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="fromDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="boStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="statusReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataSource" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1CO"/>
 *               &lt;enumeration value="D1ES"/>
 *               &lt;enumeration value="D1MR"/>
 *               &lt;enumeration value="D1MU"/>
 *               &lt;enumeration value="D1PE"/>
 *               &lt;enumeration value="D1PR"/>
 *               &lt;enumeration value="D1RE"/>
 *               &lt;enumeration value="D1SD"/>
 *               &lt;enumeration value="D1ST"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="timeZone" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="executionMethod" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1RT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="comments" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="254"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isTraceOn" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1NO"/>
 *               &lt;enumeration value="D1YS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isIntervalDateTimePopulated">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1NO"/>
 *               &lt;enumeration value="D1YS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceProvider" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="isAutomatedRetry" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1NO"/>
 *               &lt;enumeration value="D1YS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nextRetryDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="retryUntilDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="veeGroupRole" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1ES"/>
 *               &lt;enumeration value="D1IL"/>
 *               &lt;enumeration value="D1IS"/>
 *               &lt;enumeration value="D1MO"/>
 *               &lt;enumeration value="D1PR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startReadingDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startReading" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="-9999999999.999999"/>
 *               &lt;maxExclusive value="9999999999.999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="startReadingCondition" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="405651"/>
 *               &lt;enumeration value="407951"/>
 *               &lt;enumeration value="405771"/>
 *               &lt;enumeration value="407831"/>
 *               &lt;enumeration value="405411"/>
 *               &lt;enumeration value="405531"/>
 *               &lt;enumeration value="407711"/>
 *               &lt;enumeration value="407151"/>
 *               &lt;enumeration value="407031"/>
 *               &lt;enumeration value="901000"/>
 *               &lt;enumeration value="407391"/>
 *               &lt;enumeration value="407271"/>
 *               &lt;enumeration value="405891"/>
 *               &lt;enumeration value="405091"/>
 *               &lt;enumeration value="405761"/>
 *               &lt;enumeration value="405881"/>
 *               &lt;enumeration value="407941"/>
 *               &lt;enumeration value="405521"/>
 *               &lt;enumeration value="405641"/>
 *               &lt;enumeration value="405401"/>
 *               &lt;enumeration value="407821"/>
 *               &lt;enumeration value="407701"/>
 *               &lt;enumeration value="407261"/>
 *               &lt;enumeration value="405081"/>
 *               &lt;enumeration value="407141"/>
 *               &lt;enumeration value="407381"/>
 *               &lt;enumeration value="407021"/>
 *               &lt;enumeration value="405871"/>
 *               &lt;enumeration value="405991"/>
 *               &lt;enumeration value="405631"/>
 *               &lt;enumeration value="405751"/>
 *               &lt;enumeration value="405511"/>
 *               &lt;enumeration value="407931"/>
 *               &lt;enumeration value="407811"/>
 *               &lt;enumeration value="405071"/>
 *               &lt;enumeration value="407371"/>
 *               &lt;enumeration value="405191"/>
 *               &lt;enumeration value="407251"/>
 *               &lt;enumeration value="407491"/>
 *               &lt;enumeration value="402000"/>
 *               &lt;enumeration value="407131"/>
 *               &lt;enumeration value="407011"/>
 *               &lt;enumeration value="501000"/>
 *               &lt;enumeration value="405981"/>
 *               &lt;enumeration value="405741"/>
 *               &lt;enumeration value="405861"/>
 *               &lt;enumeration value="405501"/>
 *               &lt;enumeration value="407801"/>
 *               &lt;enumeration value="405621"/>
 *               &lt;enumeration value="407921"/>
 *               &lt;enumeration value="405181"/>
 *               &lt;enumeration value="407481"/>
 *               &lt;enumeration value="407361"/>
 *               &lt;enumeration value="405061"/>
 *               &lt;enumeration value="407001"/>
 *               &lt;enumeration value="407241"/>
 *               &lt;enumeration value="407121"/>
 *               &lt;enumeration value="405211"/>
 *               &lt;enumeration value="407511"/>
 *               &lt;enumeration value="405331"/>
 *               &lt;enumeration value="407751"/>
 *               &lt;enumeration value="407631"/>
 *               &lt;enumeration value="405691"/>
 *               &lt;enumeration value="407991"/>
 *               &lt;enumeration value="407871"/>
 *               &lt;enumeration value="405451"/>
 *               &lt;enumeration value="405571"/>
 *               &lt;enumeration value="407191"/>
 *               &lt;enumeration value="407071"/>
 *               &lt;enumeration value="405321"/>
 *               &lt;enumeration value="407621"/>
 *               &lt;enumeration value="405441"/>
 *               &lt;enumeration value="407501"/>
 *               &lt;enumeration value="407861"/>
 *               &lt;enumeration value="405201"/>
 *               &lt;enumeration value="407741"/>
 *               &lt;enumeration value="101000"/>
 *               &lt;enumeration value="409000"/>
 *               &lt;enumeration value="407061"/>
 *               &lt;enumeration value="407981"/>
 *               &lt;enumeration value="405561"/>
 *               &lt;enumeration value="405681"/>
 *               &lt;enumeration value="407181"/>
 *               &lt;enumeration value="405431"/>
 *               &lt;enumeration value="407731"/>
 *               &lt;enumeration value="405551"/>
 *               &lt;enumeration value="407611"/>
 *               &lt;enumeration value="407971"/>
 *               &lt;enumeration value="405311"/>
 *               &lt;enumeration value="407851"/>
 *               &lt;enumeration value="100000"/>
 *               &lt;enumeration value="407171"/>
 *               &lt;enumeration value="407051"/>
 *               &lt;enumeration value="405671"/>
 *               &lt;enumeration value="405791"/>
 *               &lt;enumeration value="407291"/>
 *               &lt;enumeration value="405541"/>
 *               &lt;enumeration value="407841"/>
 *               &lt;enumeration value="405661"/>
 *               &lt;enumeration value="407721"/>
 *               &lt;enumeration value="405301"/>
 *               &lt;enumeration value="405421"/>
 *               &lt;enumeration value="407961"/>
 *               &lt;enumeration value="407601"/>
 *               &lt;enumeration value="407041"/>
 *               &lt;enumeration value="407281"/>
 *               &lt;enumeration value="407161"/>
 *               &lt;enumeration value="405781"/>
 *               &lt;enumeration value="407311"/>
 *               &lt;enumeration value="102000"/>
 *               &lt;enumeration value="405811"/>
 *               &lt;enumeration value="405931"/>
 *               &lt;enumeration value="405491"/>
 *               &lt;enumeration value="405251"/>
 *               &lt;enumeration value="407551"/>
 *               &lt;enumeration value="405371"/>
 *               &lt;enumeration value="407431"/>
 *               &lt;enumeration value="405011"/>
 *               &lt;enumeration value="407791"/>
 *               &lt;enumeration value="405131"/>
 *               &lt;enumeration value="407671"/>
 *               &lt;enumeration value="405801"/>
 *               &lt;enumeration value="405001"/>
 *               &lt;enumeration value="407421"/>
 *               &lt;enumeration value="407301"/>
 *               &lt;enumeration value="405921"/>
 *               &lt;enumeration value="405361"/>
 *               &lt;enumeration value="407661"/>
 *               &lt;enumeration value="405481"/>
 *               &lt;enumeration value="407541"/>
 *               &lt;enumeration value="405121"/>
 *               &lt;enumeration value="405241"/>
 *               &lt;enumeration value="407781"/>
 *               &lt;enumeration value="405911"/>
 *               &lt;enumeration value="100500"/>
 *               &lt;enumeration value="405111"/>
 *               &lt;enumeration value="407531"/>
 *               &lt;enumeration value="407411"/>
 *               &lt;enumeration value="405471"/>
 *               &lt;enumeration value="407771"/>
 *               &lt;enumeration value="405591"/>
 *               &lt;enumeration value="407651"/>
 *               &lt;enumeration value="405231"/>
 *               &lt;enumeration value="405351"/>
 *               &lt;enumeration value="407891"/>
 *               &lt;enumeration value="407091"/>
 *               &lt;enumeration value="405901"/>
 *               &lt;enumeration value="405101"/>
 *               &lt;enumeration value="407401"/>
 *               &lt;enumeration value="405221"/>
 *               &lt;enumeration value="407641"/>
 *               &lt;enumeration value="407521"/>
 *               &lt;enumeration value="405581"/>
 *               &lt;enumeration value="407881"/>
 *               &lt;enumeration value="407761"/>
 *               &lt;enumeration value="405341"/>
 *               &lt;enumeration value="405461"/>
 *               &lt;enumeration value="407081"/>
 *               &lt;enumeration value="405851"/>
 *               &lt;enumeration value="405971"/>
 *               &lt;enumeration value="405611"/>
 *               &lt;enumeration value="407911"/>
 *               &lt;enumeration value="405731"/>
 *               &lt;enumeration value="405291"/>
 *               &lt;enumeration value="407591"/>
 *               &lt;enumeration value="407471"/>
 *               &lt;enumeration value="405051"/>
 *               &lt;enumeration value="405171"/>
 *               &lt;enumeration value="407111"/>
 *               &lt;enumeration value="407351"/>
 *               &lt;enumeration value="407231"/>
 *               &lt;enumeration value="201000"/>
 *               &lt;enumeration value="101500"/>
 *               &lt;enumeration value="405961"/>
 *               &lt;enumeration value="405721"/>
 *               &lt;enumeration value="405841"/>
 *               &lt;enumeration value="407901"/>
 *               &lt;enumeration value="405601"/>
 *               &lt;enumeration value="407581"/>
 *               &lt;enumeration value="405161"/>
 *               &lt;enumeration value="405281"/>
 *               &lt;enumeration value="401000"/>
 *               &lt;enumeration value="407221"/>
 *               &lt;enumeration value="405041"/>
 *               &lt;enumeration value="407101"/>
 *               &lt;enumeration value="407461"/>
 *               &lt;enumeration value="407341"/>
 *               &lt;enumeration value="405831"/>
 *               &lt;enumeration value="405951"/>
 *               &lt;enumeration value="405711"/>
 *               &lt;enumeration value="407691"/>
 *               &lt;enumeration value="405271"/>
 *               &lt;enumeration value="405391"/>
 *               &lt;enumeration value="405031"/>
 *               &lt;enumeration value="407331"/>
 *               &lt;enumeration value="405151"/>
 *               &lt;enumeration value="407211"/>
 *               &lt;enumeration value="407571"/>
 *               &lt;enumeration value="407451"/>
 *               &lt;enumeration value="407201"/>
 *               &lt;enumeration value="405941"/>
 *               &lt;enumeration value="405701"/>
 *               &lt;enumeration value="405821"/>
 *               &lt;enumeration value="405381"/>
 *               &lt;enumeration value="405141"/>
 *               &lt;enumeration value="407441"/>
 *               &lt;enumeration value="405261"/>
 *               &lt;enumeration value="407321"/>
 *               &lt;enumeration value="407681"/>
 *               &lt;enumeration value="405021"/>
 *               &lt;enumeration value="407561"/>
 *               &lt;enumeration value="301000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nmi" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nem12FileName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="transactionId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="preVEE" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="simdId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dvcIdN" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mcId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mcIdN" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="externalId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="120"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="uom" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="externalUOM" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tou" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="externalTOU" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sqi" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="externalSQI" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="stDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="stQty" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minExclusive value="-9999999999.999999"/>
 *                         &lt;maxExclusive value="9999999999.999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="enDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="enQty" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minExclusive value="-9999999999.999999"/>
 *                         &lt;maxExclusive value="9999999999.999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="imdType" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1CO"/>
 *                         &lt;enumeration value="D1ES"/>
 *                         &lt;enumeration value="D1GA"/>
 *                         &lt;enumeration value="D1IL"/>
 *                         &lt;enumeration value="D1MO"/>
 *                         &lt;enumeration value="D1SY"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mcIS" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1IN"/>
 *                         &lt;enumeration value="D1SC"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="inShift" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NS"/>
 *                         &lt;enumeration value="D1SH"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="mcm" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minExclusive value="-999999999999.999999"/>
 *                         &lt;maxExclusive value="999999999999.999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minExclusive value="-999999999"/>
 *                         &lt;maxExclusive value="999999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tz" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="externalTimeZone" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="spi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="ccond" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="405651"/>
 *                         &lt;enumeration value="407951"/>
 *                         &lt;enumeration value="405771"/>
 *                         &lt;enumeration value="407831"/>
 *                         &lt;enumeration value="405411"/>
 *                         &lt;enumeration value="405531"/>
 *                         &lt;enumeration value="407711"/>
 *                         &lt;enumeration value="407151"/>
 *                         &lt;enumeration value="407031"/>
 *                         &lt;enumeration value="901000"/>
 *                         &lt;enumeration value="407391"/>
 *                         &lt;enumeration value="407271"/>
 *                         &lt;enumeration value="405891"/>
 *                         &lt;enumeration value="405091"/>
 *                         &lt;enumeration value="405761"/>
 *                         &lt;enumeration value="405881"/>
 *                         &lt;enumeration value="407941"/>
 *                         &lt;enumeration value="405521"/>
 *                         &lt;enumeration value="405641"/>
 *                         &lt;enumeration value="405401"/>
 *                         &lt;enumeration value="407821"/>
 *                         &lt;enumeration value="407701"/>
 *                         &lt;enumeration value="407261"/>
 *                         &lt;enumeration value="405081"/>
 *                         &lt;enumeration value="407141"/>
 *                         &lt;enumeration value="407381"/>
 *                         &lt;enumeration value="407021"/>
 *                         &lt;enumeration value="405871"/>
 *                         &lt;enumeration value="405991"/>
 *                         &lt;enumeration value="405631"/>
 *                         &lt;enumeration value="405751"/>
 *                         &lt;enumeration value="405511"/>
 *                         &lt;enumeration value="407931"/>
 *                         &lt;enumeration value="407811"/>
 *                         &lt;enumeration value="405071"/>
 *                         &lt;enumeration value="407371"/>
 *                         &lt;enumeration value="405191"/>
 *                         &lt;enumeration value="407251"/>
 *                         &lt;enumeration value="407491"/>
 *                         &lt;enumeration value="402000"/>
 *                         &lt;enumeration value="407131"/>
 *                         &lt;enumeration value="407011"/>
 *                         &lt;enumeration value="501000"/>
 *                         &lt;enumeration value="405981"/>
 *                         &lt;enumeration value="405741"/>
 *                         &lt;enumeration value="405861"/>
 *                         &lt;enumeration value="405501"/>
 *                         &lt;enumeration value="407801"/>
 *                         &lt;enumeration value="405621"/>
 *                         &lt;enumeration value="407921"/>
 *                         &lt;enumeration value="405181"/>
 *                         &lt;enumeration value="407481"/>
 *                         &lt;enumeration value="407361"/>
 *                         &lt;enumeration value="405061"/>
 *                         &lt;enumeration value="407001"/>
 *                         &lt;enumeration value="407241"/>
 *                         &lt;enumeration value="407121"/>
 *                         &lt;enumeration value="405211"/>
 *                         &lt;enumeration value="407511"/>
 *                         &lt;enumeration value="405331"/>
 *                         &lt;enumeration value="407751"/>
 *                         &lt;enumeration value="407631"/>
 *                         &lt;enumeration value="405691"/>
 *                         &lt;enumeration value="407991"/>
 *                         &lt;enumeration value="407871"/>
 *                         &lt;enumeration value="405451"/>
 *                         &lt;enumeration value="405571"/>
 *                         &lt;enumeration value="407191"/>
 *                         &lt;enumeration value="407071"/>
 *                         &lt;enumeration value="405321"/>
 *                         &lt;enumeration value="407621"/>
 *                         &lt;enumeration value="405441"/>
 *                         &lt;enumeration value="407501"/>
 *                         &lt;enumeration value="407861"/>
 *                         &lt;enumeration value="405201"/>
 *                         &lt;enumeration value="407741"/>
 *                         &lt;enumeration value="101000"/>
 *                         &lt;enumeration value="409000"/>
 *                         &lt;enumeration value="407061"/>
 *                         &lt;enumeration value="407981"/>
 *                         &lt;enumeration value="405561"/>
 *                         &lt;enumeration value="405681"/>
 *                         &lt;enumeration value="407181"/>
 *                         &lt;enumeration value="405431"/>
 *                         &lt;enumeration value="407731"/>
 *                         &lt;enumeration value="405551"/>
 *                         &lt;enumeration value="407611"/>
 *                         &lt;enumeration value="407971"/>
 *                         &lt;enumeration value="405311"/>
 *                         &lt;enumeration value="407851"/>
 *                         &lt;enumeration value="100000"/>
 *                         &lt;enumeration value="407171"/>
 *                         &lt;enumeration value="407051"/>
 *                         &lt;enumeration value="405671"/>
 *                         &lt;enumeration value="405791"/>
 *                         &lt;enumeration value="407291"/>
 *                         &lt;enumeration value="405541"/>
 *                         &lt;enumeration value="407841"/>
 *                         &lt;enumeration value="405661"/>
 *                         &lt;enumeration value="407721"/>
 *                         &lt;enumeration value="405301"/>
 *                         &lt;enumeration value="405421"/>
 *                         &lt;enumeration value="407961"/>
 *                         &lt;enumeration value="407601"/>
 *                         &lt;enumeration value="407041"/>
 *                         &lt;enumeration value="407281"/>
 *                         &lt;enumeration value="407161"/>
 *                         &lt;enumeration value="405781"/>
 *                         &lt;enumeration value="407311"/>
 *                         &lt;enumeration value="102000"/>
 *                         &lt;enumeration value="405811"/>
 *                         &lt;enumeration value="405931"/>
 *                         &lt;enumeration value="405491"/>
 *                         &lt;enumeration value="405251"/>
 *                         &lt;enumeration value="407551"/>
 *                         &lt;enumeration value="405371"/>
 *                         &lt;enumeration value="407431"/>
 *                         &lt;enumeration value="405011"/>
 *                         &lt;enumeration value="407791"/>
 *                         &lt;enumeration value="405131"/>
 *                         &lt;enumeration value="407671"/>
 *                         &lt;enumeration value="405801"/>
 *                         &lt;enumeration value="405001"/>
 *                         &lt;enumeration value="407421"/>
 *                         &lt;enumeration value="407301"/>
 *                         &lt;enumeration value="405921"/>
 *                         &lt;enumeration value="405361"/>
 *                         &lt;enumeration value="407661"/>
 *                         &lt;enumeration value="405481"/>
 *                         &lt;enumeration value="407541"/>
 *                         &lt;enumeration value="405121"/>
 *                         &lt;enumeration value="405241"/>
 *                         &lt;enumeration value="407781"/>
 *                         &lt;enumeration value="405911"/>
 *                         &lt;enumeration value="100500"/>
 *                         &lt;enumeration value="405111"/>
 *                         &lt;enumeration value="407531"/>
 *                         &lt;enumeration value="407411"/>
 *                         &lt;enumeration value="405471"/>
 *                         &lt;enumeration value="407771"/>
 *                         &lt;enumeration value="405591"/>
 *                         &lt;enumeration value="407651"/>
 *                         &lt;enumeration value="405231"/>
 *                         &lt;enumeration value="405351"/>
 *                         &lt;enumeration value="407891"/>
 *                         &lt;enumeration value="407091"/>
 *                         &lt;enumeration value="405901"/>
 *                         &lt;enumeration value="405101"/>
 *                         &lt;enumeration value="407401"/>
 *                         &lt;enumeration value="405221"/>
 *                         &lt;enumeration value="407641"/>
 *                         &lt;enumeration value="407521"/>
 *                         &lt;enumeration value="405581"/>
 *                         &lt;enumeration value="407881"/>
 *                         &lt;enumeration value="407761"/>
 *                         &lt;enumeration value="405341"/>
 *                         &lt;enumeration value="405461"/>
 *                         &lt;enumeration value="407081"/>
 *                         &lt;enumeration value="405851"/>
 *                         &lt;enumeration value="405971"/>
 *                         &lt;enumeration value="405611"/>
 *                         &lt;enumeration value="407911"/>
 *                         &lt;enumeration value="405731"/>
 *                         &lt;enumeration value="405291"/>
 *                         &lt;enumeration value="407591"/>
 *                         &lt;enumeration value="407471"/>
 *                         &lt;enumeration value="405051"/>
 *                         &lt;enumeration value="405171"/>
 *                         &lt;enumeration value="407111"/>
 *                         &lt;enumeration value="407351"/>
 *                         &lt;enumeration value="407231"/>
 *                         &lt;enumeration value="201000"/>
 *                         &lt;enumeration value="101500"/>
 *                         &lt;enumeration value="405961"/>
 *                         &lt;enumeration value="405721"/>
 *                         &lt;enumeration value="405841"/>
 *                         &lt;enumeration value="407901"/>
 *                         &lt;enumeration value="405601"/>
 *                         &lt;enumeration value="407581"/>
 *                         &lt;enumeration value="405161"/>
 *                         &lt;enumeration value="405281"/>
 *                         &lt;enumeration value="401000"/>
 *                         &lt;enumeration value="407221"/>
 *                         &lt;enumeration value="405041"/>
 *                         &lt;enumeration value="407101"/>
 *                         &lt;enumeration value="407461"/>
 *                         &lt;enumeration value="407341"/>
 *                         &lt;enumeration value="405831"/>
 *                         &lt;enumeration value="405951"/>
 *                         &lt;enumeration value="405711"/>
 *                         &lt;enumeration value="407691"/>
 *                         &lt;enumeration value="405271"/>
 *                         &lt;enumeration value="405391"/>
 *                         &lt;enumeration value="405031"/>
 *                         &lt;enumeration value="407331"/>
 *                         &lt;enumeration value="405151"/>
 *                         &lt;enumeration value="407211"/>
 *                         &lt;enumeration value="407571"/>
 *                         &lt;enumeration value="407451"/>
 *                         &lt;enumeration value="407201"/>
 *                         &lt;enumeration value="405941"/>
 *                         &lt;enumeration value="405701"/>
 *                         &lt;enumeration value="405821"/>
 *                         &lt;enumeration value="405381"/>
 *                         &lt;enumeration value="405141"/>
 *                         &lt;enumeration value="407441"/>
 *                         &lt;enumeration value="405261"/>
 *                         &lt;enumeration value="407321"/>
 *                         &lt;enumeration value="407681"/>
 *                         &lt;enumeration value="405021"/>
 *                         &lt;enumeration value="407561"/>
 *                         &lt;enumeration value="301000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="sts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="s" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;minExclusive value="-99999"/>
 *                                             &lt;maxExclusive value="99999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="st" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="6"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="msrs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="mL" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="s" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;minExclusive value="-99999"/>
 *                                             &lt;maxExclusive value="99999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                       &lt;element name="q" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;minExclusive value="-9999999999.999999"/>
 *                                             &lt;maxExclusive value="9999999999.999999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="ue" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="D1UE"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="fc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="405651"/>
 *                                             &lt;enumeration value="407951"/>
 *                                             &lt;enumeration value="405771"/>
 *                                             &lt;enumeration value="407831"/>
 *                                             &lt;enumeration value="405411"/>
 *                                             &lt;enumeration value="405531"/>
 *                                             &lt;enumeration value="407711"/>
 *                                             &lt;enumeration value="407151"/>
 *                                             &lt;enumeration value="407031"/>
 *                                             &lt;enumeration value="901000"/>
 *                                             &lt;enumeration value="407391"/>
 *                                             &lt;enumeration value="407271"/>
 *                                             &lt;enumeration value="405891"/>
 *                                             &lt;enumeration value="405091"/>
 *                                             &lt;enumeration value="405761"/>
 *                                             &lt;enumeration value="405881"/>
 *                                             &lt;enumeration value="407941"/>
 *                                             &lt;enumeration value="405521"/>
 *                                             &lt;enumeration value="405641"/>
 *                                             &lt;enumeration value="405401"/>
 *                                             &lt;enumeration value="407821"/>
 *                                             &lt;enumeration value="407701"/>
 *                                             &lt;enumeration value="407261"/>
 *                                             &lt;enumeration value="405081"/>
 *                                             &lt;enumeration value="407141"/>
 *                                             &lt;enumeration value="407381"/>
 *                                             &lt;enumeration value="407021"/>
 *                                             &lt;enumeration value="405871"/>
 *                                             &lt;enumeration value="405991"/>
 *                                             &lt;enumeration value="405631"/>
 *                                             &lt;enumeration value="405751"/>
 *                                             &lt;enumeration value="405511"/>
 *                                             &lt;enumeration value="407931"/>
 *                                             &lt;enumeration value="407811"/>
 *                                             &lt;enumeration value="405071"/>
 *                                             &lt;enumeration value="407371"/>
 *                                             &lt;enumeration value="405191"/>
 *                                             &lt;enumeration value="407251"/>
 *                                             &lt;enumeration value="407491"/>
 *                                             &lt;enumeration value="402000"/>
 *                                             &lt;enumeration value="407131"/>
 *                                             &lt;enumeration value="407011"/>
 *                                             &lt;enumeration value="501000"/>
 *                                             &lt;enumeration value="405981"/>
 *                                             &lt;enumeration value="405741"/>
 *                                             &lt;enumeration value="405861"/>
 *                                             &lt;enumeration value="405501"/>
 *                                             &lt;enumeration value="407801"/>
 *                                             &lt;enumeration value="405621"/>
 *                                             &lt;enumeration value="407921"/>
 *                                             &lt;enumeration value="405181"/>
 *                                             &lt;enumeration value="407481"/>
 *                                             &lt;enumeration value="407361"/>
 *                                             &lt;enumeration value="405061"/>
 *                                             &lt;enumeration value="407001"/>
 *                                             &lt;enumeration value="407241"/>
 *                                             &lt;enumeration value="407121"/>
 *                                             &lt;enumeration value="405211"/>
 *                                             &lt;enumeration value="407511"/>
 *                                             &lt;enumeration value="405331"/>
 *                                             &lt;enumeration value="407751"/>
 *                                             &lt;enumeration value="407631"/>
 *                                             &lt;enumeration value="405691"/>
 *                                             &lt;enumeration value="407991"/>
 *                                             &lt;enumeration value="407871"/>
 *                                             &lt;enumeration value="405451"/>
 *                                             &lt;enumeration value="405571"/>
 *                                             &lt;enumeration value="407191"/>
 *                                             &lt;enumeration value="407071"/>
 *                                             &lt;enumeration value="405321"/>
 *                                             &lt;enumeration value="407621"/>
 *                                             &lt;enumeration value="405441"/>
 *                                             &lt;enumeration value="407501"/>
 *                                             &lt;enumeration value="407861"/>
 *                                             &lt;enumeration value="405201"/>
 *                                             &lt;enumeration value="407741"/>
 *                                             &lt;enumeration value="101000"/>
 *                                             &lt;enumeration value="409000"/>
 *                                             &lt;enumeration value="407061"/>
 *                                             &lt;enumeration value="407981"/>
 *                                             &lt;enumeration value="405561"/>
 *                                             &lt;enumeration value="405681"/>
 *                                             &lt;enumeration value="407181"/>
 *                                             &lt;enumeration value="405431"/>
 *                                             &lt;enumeration value="407731"/>
 *                                             &lt;enumeration value="405551"/>
 *                                             &lt;enumeration value="407611"/>
 *                                             &lt;enumeration value="407971"/>
 *                                             &lt;enumeration value="405311"/>
 *                                             &lt;enumeration value="407851"/>
 *                                             &lt;enumeration value="100000"/>
 *                                             &lt;enumeration value="407171"/>
 *                                             &lt;enumeration value="407051"/>
 *                                             &lt;enumeration value="405671"/>
 *                                             &lt;enumeration value="405791"/>
 *                                             &lt;enumeration value="407291"/>
 *                                             &lt;enumeration value="405541"/>
 *                                             &lt;enumeration value="407841"/>
 *                                             &lt;enumeration value="405661"/>
 *                                             &lt;enumeration value="407721"/>
 *                                             &lt;enumeration value="405301"/>
 *                                             &lt;enumeration value="405421"/>
 *                                             &lt;enumeration value="407961"/>
 *                                             &lt;enumeration value="407601"/>
 *                                             &lt;enumeration value="407041"/>
 *                                             &lt;enumeration value="407281"/>
 *                                             &lt;enumeration value="407161"/>
 *                                             &lt;enumeration value="405781"/>
 *                                             &lt;enumeration value="407311"/>
 *                                             &lt;enumeration value="102000"/>
 *                                             &lt;enumeration value="405811"/>
 *                                             &lt;enumeration value="405931"/>
 *                                             &lt;enumeration value="405491"/>
 *                                             &lt;enumeration value="405251"/>
 *                                             &lt;enumeration value="407551"/>
 *                                             &lt;enumeration value="405371"/>
 *                                             &lt;enumeration value="407431"/>
 *                                             &lt;enumeration value="405011"/>
 *                                             &lt;enumeration value="407791"/>
 *                                             &lt;enumeration value="405131"/>
 *                                             &lt;enumeration value="407671"/>
 *                                             &lt;enumeration value="405801"/>
 *                                             &lt;enumeration value="405001"/>
 *                                             &lt;enumeration value="407421"/>
 *                                             &lt;enumeration value="407301"/>
 *                                             &lt;enumeration value="405921"/>
 *                                             &lt;enumeration value="405361"/>
 *                                             &lt;enumeration value="407661"/>
 *                                             &lt;enumeration value="405481"/>
 *                                             &lt;enumeration value="407541"/>
 *                                             &lt;enumeration value="405121"/>
 *                                             &lt;enumeration value="405241"/>
 *                                             &lt;enumeration value="407781"/>
 *                                             &lt;enumeration value="405911"/>
 *                                             &lt;enumeration value="100500"/>
 *                                             &lt;enumeration value="405111"/>
 *                                             &lt;enumeration value="407531"/>
 *                                             &lt;enumeration value="407411"/>
 *                                             &lt;enumeration value="405471"/>
 *                                             &lt;enumeration value="407771"/>
 *                                             &lt;enumeration value="405591"/>
 *                                             &lt;enumeration value="407651"/>
 *                                             &lt;enumeration value="405231"/>
 *                                             &lt;enumeration value="405351"/>
 *                                             &lt;enumeration value="407891"/>
 *                                             &lt;enumeration value="407091"/>
 *                                             &lt;enumeration value="405901"/>
 *                                             &lt;enumeration value="405101"/>
 *                                             &lt;enumeration value="407401"/>
 *                                             &lt;enumeration value="405221"/>
 *                                             &lt;enumeration value="407641"/>
 *                                             &lt;enumeration value="407521"/>
 *                                             &lt;enumeration value="405581"/>
 *                                             &lt;enumeration value="407881"/>
 *                                             &lt;enumeration value="407761"/>
 *                                             &lt;enumeration value="405341"/>
 *                                             &lt;enumeration value="405461"/>
 *                                             &lt;enumeration value="407081"/>
 *                                             &lt;enumeration value="405851"/>
 *                                             &lt;enumeration value="405971"/>
 *                                             &lt;enumeration value="405611"/>
 *                                             &lt;enumeration value="407911"/>
 *                                             &lt;enumeration value="405731"/>
 *                                             &lt;enumeration value="405291"/>
 *                                             &lt;enumeration value="407591"/>
 *                                             &lt;enumeration value="407471"/>
 *                                             &lt;enumeration value="405051"/>
 *                                             &lt;enumeration value="405171"/>
 *                                             &lt;enumeration value="407111"/>
 *                                             &lt;enumeration value="407351"/>
 *                                             &lt;enumeration value="407231"/>
 *                                             &lt;enumeration value="201000"/>
 *                                             &lt;enumeration value="101500"/>
 *                                             &lt;enumeration value="405961"/>
 *                                             &lt;enumeration value="405721"/>
 *                                             &lt;enumeration value="405841"/>
 *                                             &lt;enumeration value="407901"/>
 *                                             &lt;enumeration value="405601"/>
 *                                             &lt;enumeration value="407581"/>
 *                                             &lt;enumeration value="405161"/>
 *                                             &lt;enumeration value="405281"/>
 *                                             &lt;enumeration value="401000"/>
 *                                             &lt;enumeration value="407221"/>
 *                                             &lt;enumeration value="405041"/>
 *                                             &lt;enumeration value="407101"/>
 *                                             &lt;enumeration value="407461"/>
 *                                             &lt;enumeration value="407341"/>
 *                                             &lt;enumeration value="405831"/>
 *                                             &lt;enumeration value="405951"/>
 *                                             &lt;enumeration value="405711"/>
 *                                             &lt;enumeration value="407691"/>
 *                                             &lt;enumeration value="405271"/>
 *                                             &lt;enumeration value="405391"/>
 *                                             &lt;enumeration value="405031"/>
 *                                             &lt;enumeration value="407331"/>
 *                                             &lt;enumeration value="405151"/>
 *                                             &lt;enumeration value="407211"/>
 *                                             &lt;enumeration value="407571"/>
 *                                             &lt;enumeration value="407451"/>
 *                                             &lt;enumeration value="407201"/>
 *                                             &lt;enumeration value="405941"/>
 *                                             &lt;enumeration value="405701"/>
 *                                             &lt;enumeration value="405821"/>
 *                                             &lt;enumeration value="405381"/>
 *                                             &lt;enumeration value="405141"/>
 *                                             &lt;enumeration value="407441"/>
 *                                             &lt;enumeration value="405261"/>
 *                                             &lt;enumeration value="407321"/>
 *                                             &lt;enumeration value="407681"/>
 *                                             &lt;enumeration value="405021"/>
 *                                             &lt;enumeration value="407561"/>
 *                                             &lt;enumeration value="301000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="r" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;minExclusive value="-9999999999.999999"/>
 *                                             &lt;maxExclusive value="9999999999.999999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="rc" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="405651"/>
 *                                             &lt;enumeration value="407951"/>
 *                                             &lt;enumeration value="405771"/>
 *                                             &lt;enumeration value="407831"/>
 *                                             &lt;enumeration value="405411"/>
 *                                             &lt;enumeration value="405531"/>
 *                                             &lt;enumeration value="407711"/>
 *                                             &lt;enumeration value="407151"/>
 *                                             &lt;enumeration value="407031"/>
 *                                             &lt;enumeration value="901000"/>
 *                                             &lt;enumeration value="407391"/>
 *                                             &lt;enumeration value="407271"/>
 *                                             &lt;enumeration value="405891"/>
 *                                             &lt;enumeration value="405091"/>
 *                                             &lt;enumeration value="405761"/>
 *                                             &lt;enumeration value="405881"/>
 *                                             &lt;enumeration value="407941"/>
 *                                             &lt;enumeration value="405521"/>
 *                                             &lt;enumeration value="405641"/>
 *                                             &lt;enumeration value="405401"/>
 *                                             &lt;enumeration value="407821"/>
 *                                             &lt;enumeration value="407701"/>
 *                                             &lt;enumeration value="407261"/>
 *                                             &lt;enumeration value="405081"/>
 *                                             &lt;enumeration value="407141"/>
 *                                             &lt;enumeration value="407381"/>
 *                                             &lt;enumeration value="407021"/>
 *                                             &lt;enumeration value="405871"/>
 *                                             &lt;enumeration value="405991"/>
 *                                             &lt;enumeration value="405631"/>
 *                                             &lt;enumeration value="405751"/>
 *                                             &lt;enumeration value="405511"/>
 *                                             &lt;enumeration value="407931"/>
 *                                             &lt;enumeration value="407811"/>
 *                                             &lt;enumeration value="405071"/>
 *                                             &lt;enumeration value="407371"/>
 *                                             &lt;enumeration value="405191"/>
 *                                             &lt;enumeration value="407251"/>
 *                                             &lt;enumeration value="407491"/>
 *                                             &lt;enumeration value="402000"/>
 *                                             &lt;enumeration value="407131"/>
 *                                             &lt;enumeration value="407011"/>
 *                                             &lt;enumeration value="501000"/>
 *                                             &lt;enumeration value="405981"/>
 *                                             &lt;enumeration value="405741"/>
 *                                             &lt;enumeration value="405861"/>
 *                                             &lt;enumeration value="405501"/>
 *                                             &lt;enumeration value="407801"/>
 *                                             &lt;enumeration value="405621"/>
 *                                             &lt;enumeration value="407921"/>
 *                                             &lt;enumeration value="405181"/>
 *                                             &lt;enumeration value="407481"/>
 *                                             &lt;enumeration value="407361"/>
 *                                             &lt;enumeration value="405061"/>
 *                                             &lt;enumeration value="407001"/>
 *                                             &lt;enumeration value="407241"/>
 *                                             &lt;enumeration value="407121"/>
 *                                             &lt;enumeration value="405211"/>
 *                                             &lt;enumeration value="407511"/>
 *                                             &lt;enumeration value="405331"/>
 *                                             &lt;enumeration value="407751"/>
 *                                             &lt;enumeration value="407631"/>
 *                                             &lt;enumeration value="405691"/>
 *                                             &lt;enumeration value="407991"/>
 *                                             &lt;enumeration value="407871"/>
 *                                             &lt;enumeration value="405451"/>
 *                                             &lt;enumeration value="405571"/>
 *                                             &lt;enumeration value="407191"/>
 *                                             &lt;enumeration value="407071"/>
 *                                             &lt;enumeration value="405321"/>
 *                                             &lt;enumeration value="407621"/>
 *                                             &lt;enumeration value="405441"/>
 *                                             &lt;enumeration value="407501"/>
 *                                             &lt;enumeration value="407861"/>
 *                                             &lt;enumeration value="405201"/>
 *                                             &lt;enumeration value="407741"/>
 *                                             &lt;enumeration value="101000"/>
 *                                             &lt;enumeration value="409000"/>
 *                                             &lt;enumeration value="407061"/>
 *                                             &lt;enumeration value="407981"/>
 *                                             &lt;enumeration value="405561"/>
 *                                             &lt;enumeration value="405681"/>
 *                                             &lt;enumeration value="407181"/>
 *                                             &lt;enumeration value="405431"/>
 *                                             &lt;enumeration value="407731"/>
 *                                             &lt;enumeration value="405551"/>
 *                                             &lt;enumeration value="407611"/>
 *                                             &lt;enumeration value="407971"/>
 *                                             &lt;enumeration value="405311"/>
 *                                             &lt;enumeration value="407851"/>
 *                                             &lt;enumeration value="100000"/>
 *                                             &lt;enumeration value="407171"/>
 *                                             &lt;enumeration value="407051"/>
 *                                             &lt;enumeration value="405671"/>
 *                                             &lt;enumeration value="405791"/>
 *                                             &lt;enumeration value="407291"/>
 *                                             &lt;enumeration value="405541"/>
 *                                             &lt;enumeration value="407841"/>
 *                                             &lt;enumeration value="405661"/>
 *                                             &lt;enumeration value="407721"/>
 *                                             &lt;enumeration value="405301"/>
 *                                             &lt;enumeration value="405421"/>
 *                                             &lt;enumeration value="407961"/>
 *                                             &lt;enumeration value="407601"/>
 *                                             &lt;enumeration value="407041"/>
 *                                             &lt;enumeration value="407281"/>
 *                                             &lt;enumeration value="407161"/>
 *                                             &lt;enumeration value="405781"/>
 *                                             &lt;enumeration value="407311"/>
 *                                             &lt;enumeration value="102000"/>
 *                                             &lt;enumeration value="405811"/>
 *                                             &lt;enumeration value="405931"/>
 *                                             &lt;enumeration value="405491"/>
 *                                             &lt;enumeration value="405251"/>
 *                                             &lt;enumeration value="407551"/>
 *                                             &lt;enumeration value="405371"/>
 *                                             &lt;enumeration value="407431"/>
 *                                             &lt;enumeration value="405011"/>
 *                                             &lt;enumeration value="407791"/>
 *                                             &lt;enumeration value="405131"/>
 *                                             &lt;enumeration value="407671"/>
 *                                             &lt;enumeration value="405801"/>
 *                                             &lt;enumeration value="405001"/>
 *                                             &lt;enumeration value="407421"/>
 *                                             &lt;enumeration value="407301"/>
 *                                             &lt;enumeration value="405921"/>
 *                                             &lt;enumeration value="405361"/>
 *                                             &lt;enumeration value="407661"/>
 *                                             &lt;enumeration value="405481"/>
 *                                             &lt;enumeration value="407541"/>
 *                                             &lt;enumeration value="405121"/>
 *                                             &lt;enumeration value="405241"/>
 *                                             &lt;enumeration value="407781"/>
 *                                             &lt;enumeration value="405911"/>
 *                                             &lt;enumeration value="100500"/>
 *                                             &lt;enumeration value="405111"/>
 *                                             &lt;enumeration value="407531"/>
 *                                             &lt;enumeration value="407411"/>
 *                                             &lt;enumeration value="405471"/>
 *                                             &lt;enumeration value="407771"/>
 *                                             &lt;enumeration value="405591"/>
 *                                             &lt;enumeration value="407651"/>
 *                                             &lt;enumeration value="405231"/>
 *                                             &lt;enumeration value="405351"/>
 *                                             &lt;enumeration value="407891"/>
 *                                             &lt;enumeration value="407091"/>
 *                                             &lt;enumeration value="405901"/>
 *                                             &lt;enumeration value="405101"/>
 *                                             &lt;enumeration value="407401"/>
 *                                             &lt;enumeration value="405221"/>
 *                                             &lt;enumeration value="407641"/>
 *                                             &lt;enumeration value="407521"/>
 *                                             &lt;enumeration value="405581"/>
 *                                             &lt;enumeration value="407881"/>
 *                                             &lt;enumeration value="407761"/>
 *                                             &lt;enumeration value="405341"/>
 *                                             &lt;enumeration value="405461"/>
 *                                             &lt;enumeration value="407081"/>
 *                                             &lt;enumeration value="405851"/>
 *                                             &lt;enumeration value="405971"/>
 *                                             &lt;enumeration value="405611"/>
 *                                             &lt;enumeration value="407911"/>
 *                                             &lt;enumeration value="405731"/>
 *                                             &lt;enumeration value="405291"/>
 *                                             &lt;enumeration value="407591"/>
 *                                             &lt;enumeration value="407471"/>
 *                                             &lt;enumeration value="405051"/>
 *                                             &lt;enumeration value="405171"/>
 *                                             &lt;enumeration value="407111"/>
 *                                             &lt;enumeration value="407351"/>
 *                                             &lt;enumeration value="407231"/>
 *                                             &lt;enumeration value="201000"/>
 *                                             &lt;enumeration value="101500"/>
 *                                             &lt;enumeration value="405961"/>
 *                                             &lt;enumeration value="405721"/>
 *                                             &lt;enumeration value="405841"/>
 *                                             &lt;enumeration value="407901"/>
 *                                             &lt;enumeration value="405601"/>
 *                                             &lt;enumeration value="407581"/>
 *                                             &lt;enumeration value="405161"/>
 *                                             &lt;enumeration value="405281"/>
 *                                             &lt;enumeration value="401000"/>
 *                                             &lt;enumeration value="407221"/>
 *                                             &lt;enumeration value="405041"/>
 *                                             &lt;enumeration value="407101"/>
 *                                             &lt;enumeration value="407461"/>
 *                                             &lt;enumeration value="407341"/>
 *                                             &lt;enumeration value="405831"/>
 *                                             &lt;enumeration value="405951"/>
 *                                             &lt;enumeration value="405711"/>
 *                                             &lt;enumeration value="407691"/>
 *                                             &lt;enumeration value="405271"/>
 *                                             &lt;enumeration value="405391"/>
 *                                             &lt;enumeration value="405031"/>
 *                                             &lt;enumeration value="407331"/>
 *                                             &lt;enumeration value="405151"/>
 *                                             &lt;enumeration value="407211"/>
 *                                             &lt;enumeration value="407571"/>
 *                                             &lt;enumeration value="407451"/>
 *                                             &lt;enumeration value="407201"/>
 *                                             &lt;enumeration value="405941"/>
 *                                             &lt;enumeration value="405701"/>
 *                                             &lt;enumeration value="405821"/>
 *                                             &lt;enumeration value="405381"/>
 *                                             &lt;enumeration value="405141"/>
 *                                             &lt;enumeration value="407441"/>
 *                                             &lt;enumeration value="405261"/>
 *                                             &lt;enumeration value="407321"/>
 *                                             &lt;enumeration value="407681"/>
 *                                             &lt;enumeration value="405021"/>
 *                                             &lt;enumeration value="407561"/>
 *                                             &lt;enumeration value="301000"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="sts" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="s" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                                 &lt;minExclusive value="-99999"/>
 *                                                                 &lt;maxExclusive value="99999"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="st" minOccurs="0">
 *                                                             &lt;simpleType>
 *                                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                 &lt;maxLength value="6"/>
 *                                                               &lt;/restriction>
 *                                                             &lt;/simpleType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="mdp" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="16"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nem12UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="soCodeGroup" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="soCodeList" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="seq" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                             &lt;minExclusive value="-99999"/>
 *                                             &lt;maxExclusive value="99999"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="soCode" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;enumeration value="A"/>
 *                                             &lt;enumeration value="C"/>
 *                                             &lt;enumeration value="D"/>
 *                                             &lt;enumeration value="E"/>
 *                                             &lt;enumeration value="G"/>
 *                                             &lt;enumeration value="N"/>
 *                                             &lt;enumeration value="O"/>
 *                                             &lt;enumeration value="R"/>
 *                                             &lt;enumeration value="S"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="indexRead" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="registerId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="30"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rawData" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="processData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="isShiftedStartEnd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isShiftedIntervals" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isShiftCorrectedStartEnd" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isShiftCorrectedIntervals" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isTimeZoneConverted" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isErrorEncountered" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="isEndDateTimeDerived" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="servicePointId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="installationConstant" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                         &lt;minExclusive value="-999999.999999"/>
 *                         &lt;maxExclusive value="999999.999999"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="deviceId" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="12"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="allowNonZeroIntervalsForEstimate" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="disableReEstimate" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="reEstimationActivity" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="disableSubtractiveConsumptionCalculation" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NO"/>
 *                         &lt;enumeration value="D1YS"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="currentErrorMessage" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="400"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="intervalScalarIndicator" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1IN"/>
 *                         &lt;enumeration value="D1SC"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="imdImportDateTimeFormat" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="D1NT"/>
 *                         &lt;enumeration value="D1WT"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="multiplierApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="logs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="logsList" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="logsEntry" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sequence" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;minExclusive value="-999"/>
 *                                                       &lt;maxExclusive value="999"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="mo" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="12"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pkValue1" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pkValue2" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pkValue3" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pkValue4" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pkValue5" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="logEntryType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;enumeration value="D1TD"/>
 *                                                       &lt;enumeration value="F1CR"/>
 *                                                       &lt;enumeration value="F1ER"/>
 *                                                       &lt;enumeration value="F1EX"/>
 *                                                       &lt;enumeration value="F1ST"/>
 *                                                       &lt;enumeration value="F1SY"/>
 *                                                       &lt;enumeration value="F1TD"/>
 *                                                       &lt;enumeration value="F1US"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="logDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                                                 &lt;element name="boStatus" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="12"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="description" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="60"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="user" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="8"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="logMessage" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="4000"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="characteristicType" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="20"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="characteristicValue" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="16"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="adhocValue" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="254"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="fkValue1" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="fkValue2" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="fkValue3" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="fkValue4" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="fkValue5" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="50"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageCategory" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;minExclusive value="-99999"/>
 *                                                       &lt;maxExclusive value="99999"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageNumber" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                                       &lt;minExclusive value="-99999"/>
 *                                                       &lt;maxExclusive value="99999"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm1" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm2" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm3" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm4" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm5" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm6" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm7" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm8" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="messageParm9" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                       &lt;maxLength value="30"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="deviceEventTypes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="deviceEventTypesList" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="deviceEventType" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;maxLength value="30"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="boStatusDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="isReprocessPerformed" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D1NO"/>
 *               &lt;enumeration value="D1YS"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="serviceProviderExternalId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="60"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="syncIMDOtherInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="version" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minExclusive value="-99999"/>
 *               &lt;maxExclusive value="99999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="dateTimeTagFormat" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="xsd:strict" />
 *       &lt;attribute name="transactionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ADD"/>
 *             &lt;enumeration value="READ"/>
 *             &lt;enumeration value="DEL"/>
 *             &lt;enumeration value="UPD"/>
 *             &lt;enumeration value="REPL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "initialMeasurementDataId",
    "bo",
    "fromDateTime",
    "toDateTime",
    "boStatus",
    "statusReason",
    "dataSource",
    "timeZone",
    "executionMethod",
    "creationDateTime",
    "comments",
    "isTraceOn",
    "isIntervalDateTimePopulated",
    "serviceProvider",
    "isAutomatedRetry",
    "nextRetryDateTime",
    "retryUntilDateTime",
    "veeGroupRole",
    "startReadingDateTime",
    "startReading",
    "startReadingCondition",
    "nmi",
    "nem12FileName",
    "transactionId",
    "preVEE",
    "rawData",
    "processData",
    "boStatusDateTime",
    "isReprocessPerformed",
    "serviceProviderExternalId",
    "syncIMDOtherInfo",
    "version"
})
@XmlRootElement(name = "CM-IMDSeeder")
public class CMIMDSeeder {

    protected String initialMeasurementDataId;
    @XmlElement(required = true)
    protected String bo;
    @XmlElementRef(name = "fromDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fromDateTime;
    @XmlElementRef(name = "toDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> toDateTime;
    protected String boStatus;
    protected String statusReason;
    @XmlElementRef(name = "dataSource", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataSource;
    protected String timeZone;
    @XmlElementRef(name = "executionMethod", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> executionMethod;
    @XmlElementRef(name = "creationDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDateTime;
    protected String comments;
    @XmlElementRef(name = "isTraceOn", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isTraceOn;
    @XmlElement(required = true, nillable = true)
    protected String isIntervalDateTimePopulated;
    protected String serviceProvider;
    @XmlElementRef(name = "isAutomatedRetry", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isAutomatedRetry;
    @XmlElementRef(name = "nextRetryDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> nextRetryDateTime;
    @XmlElementRef(name = "retryUntilDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> retryUntilDateTime;
    @XmlElementRef(name = "veeGroupRole", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> veeGroupRole;
    @XmlElementRef(name = "startReadingDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startReadingDateTime;
    protected BigDecimal startReading;
    @XmlElementRef(name = "startReadingCondition", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> startReadingCondition;
    protected String nmi;
    protected String nem12FileName;
    protected String transactionId;
    protected CMIMDSeeder.PreVEE preVEE;
    protected List<Object> rawData;
    protected CMIMDSeeder.ProcessData processData;
    @XmlElementRef(name = "boStatusDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> boStatusDateTime;
    @XmlElementRef(name = "isReprocessPerformed", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isReprocessPerformed;
    protected String serviceProviderExternalId;
    protected CMIMDSeeder.SyncIMDOtherInfo syncIMDOtherInfo;
    protected BigDecimal version;
    @XmlAttribute(name = "dateTimeTagFormat", required = true)
    protected String dateTimeTagFormat;
    @XmlAttribute(name = "transactionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String transactionType;

    /**
     * Gets the value of the initialMeasurementDataId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialMeasurementDataId() {
        return initialMeasurementDataId;
    }

    /**
     * Sets the value of the initialMeasurementDataId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialMeasurementDataId(String value) {
        this.initialMeasurementDataId = value;
    }

    /**
     * Gets the value of the bo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBo() {
        return bo;
    }

    /**
     * Sets the value of the bo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBo(String value) {
        this.bo = value;
    }

    /**
     * Gets the value of the fromDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFromDateTime() {
        return fromDateTime;
    }

    /**
     * Sets the value of the fromDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFromDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.fromDateTime = value;
    }

    /**
     * Gets the value of the toDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getToDateTime() {
        return toDateTime;
    }

    /**
     * Sets the value of the toDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setToDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.toDateTime = value;
    }

    /**
     * Gets the value of the boStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoStatus() {
        return boStatus;
    }

    /**
     * Sets the value of the boStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoStatus(String value) {
        this.boStatus = value;
    }

    /**
     * Gets the value of the statusReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusReason() {
        return statusReason;
    }

    /**
     * Sets the value of the statusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusReason(String value) {
        this.statusReason = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataSource(JAXBElement<String> value) {
        this.dataSource = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the executionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExecutionMethod() {
        return executionMethod;
    }

    /**
     * Sets the value of the executionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExecutionMethod(JAXBElement<String> value) {
        this.executionMethod = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the isTraceOn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsTraceOn() {
        return isTraceOn;
    }

    /**
     * Sets the value of the isTraceOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsTraceOn(JAXBElement<String> value) {
        this.isTraceOn = value;
    }

    /**
     * Gets the value of the isIntervalDateTimePopulated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsIntervalDateTimePopulated() {
        return isIntervalDateTimePopulated;
    }

    /**
     * Sets the value of the isIntervalDateTimePopulated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsIntervalDateTimePopulated(String value) {
        this.isIntervalDateTimePopulated = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvider(String value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the isAutomatedRetry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsAutomatedRetry() {
        return isAutomatedRetry;
    }

    /**
     * Sets the value of the isAutomatedRetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsAutomatedRetry(JAXBElement<String> value) {
        this.isAutomatedRetry = value;
    }

    /**
     * Gets the value of the nextRetryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNextRetryDateTime() {
        return nextRetryDateTime;
    }

    /**
     * Sets the value of the nextRetryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNextRetryDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.nextRetryDateTime = value;
    }

    /**
     * Gets the value of the retryUntilDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRetryUntilDateTime() {
        return retryUntilDateTime;
    }

    /**
     * Sets the value of the retryUntilDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRetryUntilDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.retryUntilDateTime = value;
    }

    /**
     * Gets the value of the veeGroupRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVeeGroupRole() {
        return veeGroupRole;
    }

    /**
     * Sets the value of the veeGroupRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVeeGroupRole(JAXBElement<String> value) {
        this.veeGroupRole = value;
    }

    /**
     * Gets the value of the startReadingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartReadingDateTime() {
        return startReadingDateTime;
    }

    /**
     * Sets the value of the startReadingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartReadingDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startReadingDateTime = value;
    }

    /**
     * Gets the value of the startReading property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartReading() {
        return startReading;
    }

    /**
     * Sets the value of the startReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartReading(BigDecimal value) {
        this.startReading = value;
    }

    /**
     * Gets the value of the startReadingCondition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStartReadingCondition() {
        return startReadingCondition;
    }

    /**
     * Sets the value of the startReadingCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStartReadingCondition(JAXBElement<String> value) {
        this.startReadingCondition = value;
    }

    /**
     * Gets the value of the nmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNmi() {
        return nmi;
    }

    /**
     * Sets the value of the nmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNmi(String value) {
        this.nmi = value;
    }

    /**
     * Gets the value of the nem12FileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNem12FileName() {
        return nem12FileName;
    }

    /**
     * Sets the value of the nem12FileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNem12FileName(String value) {
        this.nem12FileName = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the preVEE property.
     * 
     * @return
     *     possible object is
     *     {@link CMIMDSeeder.PreVEE }
     *     
     */
    public CMIMDSeeder.PreVEE getPreVEE() {
        return preVEE;
    }

    /**
     * Sets the value of the preVEE property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMIMDSeeder.PreVEE }
     *     
     */
    public void setPreVEE(CMIMDSeeder.PreVEE value) {
        this.preVEE = value;
    }

    /**
     * Gets the value of the rawData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rawData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRawData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRawData() {
        if (rawData == null) {
            rawData = new ArrayList<Object>();
        }
        return this.rawData;
    }

    /**
     * Gets the value of the processData property.
     * 
     * @return
     *     possible object is
     *     {@link CMIMDSeeder.ProcessData }
     *     
     */
    public CMIMDSeeder.ProcessData getProcessData() {
        return processData;
    }

    /**
     * Sets the value of the processData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMIMDSeeder.ProcessData }
     *     
     */
    public void setProcessData(CMIMDSeeder.ProcessData value) {
        this.processData = value;
    }

    /**
     * Gets the value of the boStatusDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBoStatusDateTime() {
        return boStatusDateTime;
    }

    /**
     * Sets the value of the boStatusDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBoStatusDateTime(JAXBElement<XMLGregorianCalendar> value) {
        this.boStatusDateTime = value;
    }

    /**
     * Gets the value of the isReprocessPerformed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsReprocessPerformed() {
        return isReprocessPerformed;
    }

    /**
     * Sets the value of the isReprocessPerformed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsReprocessPerformed(JAXBElement<String> value) {
        this.isReprocessPerformed = value;
    }

    /**
     * Gets the value of the serviceProviderExternalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderExternalId() {
        return serviceProviderExternalId;
    }

    /**
     * Sets the value of the serviceProviderExternalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderExternalId(String value) {
        this.serviceProviderExternalId = value;
    }

    /**
     * Gets the value of the syncIMDOtherInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CMIMDSeeder.SyncIMDOtherInfo }
     *     
     */
    public CMIMDSeeder.SyncIMDOtherInfo getSyncIMDOtherInfo() {
        return syncIMDOtherInfo;
    }

    /**
     * Sets the value of the syncIMDOtherInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CMIMDSeeder.SyncIMDOtherInfo }
     *     
     */
    public void setSyncIMDOtherInfo(CMIMDSeeder.SyncIMDOtherInfo value) {
        this.syncIMDOtherInfo = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

    /**
     * Gets the value of the dateTimeTagFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimeTagFormat() {
        if (dateTimeTagFormat == null) {
            return "xsd:strict";
        } else {
            return dateTimeTagFormat;
        }
    }

    /**
     * Sets the value of the dateTimeTagFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimeTagFormat(String value) {
        this.dateTimeTagFormat = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="simdId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dvcIdN" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mcId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mcIdN" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="externalId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="120"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="uom" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="externalUOM" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tou" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="externalTOU" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sqi" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="externalSQI" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="stDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="stQty" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minExclusive value="-9999999999.999999"/>
     *               &lt;maxExclusive value="9999999999.999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="enDt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="enQty" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minExclusive value="-9999999999.999999"/>
     *               &lt;maxExclusive value="9999999999.999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="imdType" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1CO"/>
     *               &lt;enumeration value="D1ES"/>
     *               &lt;enumeration value="D1GA"/>
     *               &lt;enumeration value="D1IL"/>
     *               &lt;enumeration value="D1MO"/>
     *               &lt;enumeration value="D1SY"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mcIS" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1IN"/>
     *               &lt;enumeration value="D1SC"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="inShift" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NS"/>
     *               &lt;enumeration value="D1SH"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="mcm" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minExclusive value="-999999999999.999999"/>
     *               &lt;maxExclusive value="999999999999.999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minExclusive value="-999999999"/>
     *               &lt;maxExclusive value="999999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tz" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="externalTimeZone" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="spi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="ccond" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="405651"/>
     *               &lt;enumeration value="407951"/>
     *               &lt;enumeration value="405771"/>
     *               &lt;enumeration value="407831"/>
     *               &lt;enumeration value="405411"/>
     *               &lt;enumeration value="405531"/>
     *               &lt;enumeration value="407711"/>
     *               &lt;enumeration value="407151"/>
     *               &lt;enumeration value="407031"/>
     *               &lt;enumeration value="901000"/>
     *               &lt;enumeration value="407391"/>
     *               &lt;enumeration value="407271"/>
     *               &lt;enumeration value="405891"/>
     *               &lt;enumeration value="405091"/>
     *               &lt;enumeration value="405761"/>
     *               &lt;enumeration value="405881"/>
     *               &lt;enumeration value="407941"/>
     *               &lt;enumeration value="405521"/>
     *               &lt;enumeration value="405641"/>
     *               &lt;enumeration value="405401"/>
     *               &lt;enumeration value="407821"/>
     *               &lt;enumeration value="407701"/>
     *               &lt;enumeration value="407261"/>
     *               &lt;enumeration value="405081"/>
     *               &lt;enumeration value="407141"/>
     *               &lt;enumeration value="407381"/>
     *               &lt;enumeration value="407021"/>
     *               &lt;enumeration value="405871"/>
     *               &lt;enumeration value="405991"/>
     *               &lt;enumeration value="405631"/>
     *               &lt;enumeration value="405751"/>
     *               &lt;enumeration value="405511"/>
     *               &lt;enumeration value="407931"/>
     *               &lt;enumeration value="407811"/>
     *               &lt;enumeration value="405071"/>
     *               &lt;enumeration value="407371"/>
     *               &lt;enumeration value="405191"/>
     *               &lt;enumeration value="407251"/>
     *               &lt;enumeration value="407491"/>
     *               &lt;enumeration value="402000"/>
     *               &lt;enumeration value="407131"/>
     *               &lt;enumeration value="407011"/>
     *               &lt;enumeration value="501000"/>
     *               &lt;enumeration value="405981"/>
     *               &lt;enumeration value="405741"/>
     *               &lt;enumeration value="405861"/>
     *               &lt;enumeration value="405501"/>
     *               &lt;enumeration value="407801"/>
     *               &lt;enumeration value="405621"/>
     *               &lt;enumeration value="407921"/>
     *               &lt;enumeration value="405181"/>
     *               &lt;enumeration value="407481"/>
     *               &lt;enumeration value="407361"/>
     *               &lt;enumeration value="405061"/>
     *               &lt;enumeration value="407001"/>
     *               &lt;enumeration value="407241"/>
     *               &lt;enumeration value="407121"/>
     *               &lt;enumeration value="405211"/>
     *               &lt;enumeration value="407511"/>
     *               &lt;enumeration value="405331"/>
     *               &lt;enumeration value="407751"/>
     *               &lt;enumeration value="407631"/>
     *               &lt;enumeration value="405691"/>
     *               &lt;enumeration value="407991"/>
     *               &lt;enumeration value="407871"/>
     *               &lt;enumeration value="405451"/>
     *               &lt;enumeration value="405571"/>
     *               &lt;enumeration value="407191"/>
     *               &lt;enumeration value="407071"/>
     *               &lt;enumeration value="405321"/>
     *               &lt;enumeration value="407621"/>
     *               &lt;enumeration value="405441"/>
     *               &lt;enumeration value="407501"/>
     *               &lt;enumeration value="407861"/>
     *               &lt;enumeration value="405201"/>
     *               &lt;enumeration value="407741"/>
     *               &lt;enumeration value="101000"/>
     *               &lt;enumeration value="409000"/>
     *               &lt;enumeration value="407061"/>
     *               &lt;enumeration value="407981"/>
     *               &lt;enumeration value="405561"/>
     *               &lt;enumeration value="405681"/>
     *               &lt;enumeration value="407181"/>
     *               &lt;enumeration value="405431"/>
     *               &lt;enumeration value="407731"/>
     *               &lt;enumeration value="405551"/>
     *               &lt;enumeration value="407611"/>
     *               &lt;enumeration value="407971"/>
     *               &lt;enumeration value="405311"/>
     *               &lt;enumeration value="407851"/>
     *               &lt;enumeration value="100000"/>
     *               &lt;enumeration value="407171"/>
     *               &lt;enumeration value="407051"/>
     *               &lt;enumeration value="405671"/>
     *               &lt;enumeration value="405791"/>
     *               &lt;enumeration value="407291"/>
     *               &lt;enumeration value="405541"/>
     *               &lt;enumeration value="407841"/>
     *               &lt;enumeration value="405661"/>
     *               &lt;enumeration value="407721"/>
     *               &lt;enumeration value="405301"/>
     *               &lt;enumeration value="405421"/>
     *               &lt;enumeration value="407961"/>
     *               &lt;enumeration value="407601"/>
     *               &lt;enumeration value="407041"/>
     *               &lt;enumeration value="407281"/>
     *               &lt;enumeration value="407161"/>
     *               &lt;enumeration value="405781"/>
     *               &lt;enumeration value="407311"/>
     *               &lt;enumeration value="102000"/>
     *               &lt;enumeration value="405811"/>
     *               &lt;enumeration value="405931"/>
     *               &lt;enumeration value="405491"/>
     *               &lt;enumeration value="405251"/>
     *               &lt;enumeration value="407551"/>
     *               &lt;enumeration value="405371"/>
     *               &lt;enumeration value="407431"/>
     *               &lt;enumeration value="405011"/>
     *               &lt;enumeration value="407791"/>
     *               &lt;enumeration value="405131"/>
     *               &lt;enumeration value="407671"/>
     *               &lt;enumeration value="405801"/>
     *               &lt;enumeration value="405001"/>
     *               &lt;enumeration value="407421"/>
     *               &lt;enumeration value="407301"/>
     *               &lt;enumeration value="405921"/>
     *               &lt;enumeration value="405361"/>
     *               &lt;enumeration value="407661"/>
     *               &lt;enumeration value="405481"/>
     *               &lt;enumeration value="407541"/>
     *               &lt;enumeration value="405121"/>
     *               &lt;enumeration value="405241"/>
     *               &lt;enumeration value="407781"/>
     *               &lt;enumeration value="405911"/>
     *               &lt;enumeration value="100500"/>
     *               &lt;enumeration value="405111"/>
     *               &lt;enumeration value="407531"/>
     *               &lt;enumeration value="407411"/>
     *               &lt;enumeration value="405471"/>
     *               &lt;enumeration value="407771"/>
     *               &lt;enumeration value="405591"/>
     *               &lt;enumeration value="407651"/>
     *               &lt;enumeration value="405231"/>
     *               &lt;enumeration value="405351"/>
     *               &lt;enumeration value="407891"/>
     *               &lt;enumeration value="407091"/>
     *               &lt;enumeration value="405901"/>
     *               &lt;enumeration value="405101"/>
     *               &lt;enumeration value="407401"/>
     *               &lt;enumeration value="405221"/>
     *               &lt;enumeration value="407641"/>
     *               &lt;enumeration value="407521"/>
     *               &lt;enumeration value="405581"/>
     *               &lt;enumeration value="407881"/>
     *               &lt;enumeration value="407761"/>
     *               &lt;enumeration value="405341"/>
     *               &lt;enumeration value="405461"/>
     *               &lt;enumeration value="407081"/>
     *               &lt;enumeration value="405851"/>
     *               &lt;enumeration value="405971"/>
     *               &lt;enumeration value="405611"/>
     *               &lt;enumeration value="407911"/>
     *               &lt;enumeration value="405731"/>
     *               &lt;enumeration value="405291"/>
     *               &lt;enumeration value="407591"/>
     *               &lt;enumeration value="407471"/>
     *               &lt;enumeration value="405051"/>
     *               &lt;enumeration value="405171"/>
     *               &lt;enumeration value="407111"/>
     *               &lt;enumeration value="407351"/>
     *               &lt;enumeration value="407231"/>
     *               &lt;enumeration value="201000"/>
     *               &lt;enumeration value="101500"/>
     *               &lt;enumeration value="405961"/>
     *               &lt;enumeration value="405721"/>
     *               &lt;enumeration value="405841"/>
     *               &lt;enumeration value="407901"/>
     *               &lt;enumeration value="405601"/>
     *               &lt;enumeration value="407581"/>
     *               &lt;enumeration value="405161"/>
     *               &lt;enumeration value="405281"/>
     *               &lt;enumeration value="401000"/>
     *               &lt;enumeration value="407221"/>
     *               &lt;enumeration value="405041"/>
     *               &lt;enumeration value="407101"/>
     *               &lt;enumeration value="407461"/>
     *               &lt;enumeration value="407341"/>
     *               &lt;enumeration value="405831"/>
     *               &lt;enumeration value="405951"/>
     *               &lt;enumeration value="405711"/>
     *               &lt;enumeration value="407691"/>
     *               &lt;enumeration value="405271"/>
     *               &lt;enumeration value="405391"/>
     *               &lt;enumeration value="405031"/>
     *               &lt;enumeration value="407331"/>
     *               &lt;enumeration value="405151"/>
     *               &lt;enumeration value="407211"/>
     *               &lt;enumeration value="407571"/>
     *               &lt;enumeration value="407451"/>
     *               &lt;enumeration value="407201"/>
     *               &lt;enumeration value="405941"/>
     *               &lt;enumeration value="405701"/>
     *               &lt;enumeration value="405821"/>
     *               &lt;enumeration value="405381"/>
     *               &lt;enumeration value="405141"/>
     *               &lt;enumeration value="407441"/>
     *               &lt;enumeration value="405261"/>
     *               &lt;enumeration value="407321"/>
     *               &lt;enumeration value="407681"/>
     *               &lt;enumeration value="405021"/>
     *               &lt;enumeration value="407561"/>
     *               &lt;enumeration value="301000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="sts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="s" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;minExclusive value="-99999"/>
     *                                   &lt;maxExclusive value="99999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="st" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="6"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="msrs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="mL" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="s" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;minExclusive value="-99999"/>
     *                                   &lt;maxExclusive value="99999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                             &lt;element name="q" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;minExclusive value="-9999999999.999999"/>
     *                                   &lt;maxExclusive value="9999999999.999999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="ue" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="D1UE"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="fc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="405651"/>
     *                                   &lt;enumeration value="407951"/>
     *                                   &lt;enumeration value="405771"/>
     *                                   &lt;enumeration value="407831"/>
     *                                   &lt;enumeration value="405411"/>
     *                                   &lt;enumeration value="405531"/>
     *                                   &lt;enumeration value="407711"/>
     *                                   &lt;enumeration value="407151"/>
     *                                   &lt;enumeration value="407031"/>
     *                                   &lt;enumeration value="901000"/>
     *                                   &lt;enumeration value="407391"/>
     *                                   &lt;enumeration value="407271"/>
     *                                   &lt;enumeration value="405891"/>
     *                                   &lt;enumeration value="405091"/>
     *                                   &lt;enumeration value="405761"/>
     *                                   &lt;enumeration value="405881"/>
     *                                   &lt;enumeration value="407941"/>
     *                                   &lt;enumeration value="405521"/>
     *                                   &lt;enumeration value="405641"/>
     *                                   &lt;enumeration value="405401"/>
     *                                   &lt;enumeration value="407821"/>
     *                                   &lt;enumeration value="407701"/>
     *                                   &lt;enumeration value="407261"/>
     *                                   &lt;enumeration value="405081"/>
     *                                   &lt;enumeration value="407141"/>
     *                                   &lt;enumeration value="407381"/>
     *                                   &lt;enumeration value="407021"/>
     *                                   &lt;enumeration value="405871"/>
     *                                   &lt;enumeration value="405991"/>
     *                                   &lt;enumeration value="405631"/>
     *                                   &lt;enumeration value="405751"/>
     *                                   &lt;enumeration value="405511"/>
     *                                   &lt;enumeration value="407931"/>
     *                                   &lt;enumeration value="407811"/>
     *                                   &lt;enumeration value="405071"/>
     *                                   &lt;enumeration value="407371"/>
     *                                   &lt;enumeration value="405191"/>
     *                                   &lt;enumeration value="407251"/>
     *                                   &lt;enumeration value="407491"/>
     *                                   &lt;enumeration value="402000"/>
     *                                   &lt;enumeration value="407131"/>
     *                                   &lt;enumeration value="407011"/>
     *                                   &lt;enumeration value="501000"/>
     *                                   &lt;enumeration value="405981"/>
     *                                   &lt;enumeration value="405741"/>
     *                                   &lt;enumeration value="405861"/>
     *                                   &lt;enumeration value="405501"/>
     *                                   &lt;enumeration value="407801"/>
     *                                   &lt;enumeration value="405621"/>
     *                                   &lt;enumeration value="407921"/>
     *                                   &lt;enumeration value="405181"/>
     *                                   &lt;enumeration value="407481"/>
     *                                   &lt;enumeration value="407361"/>
     *                                   &lt;enumeration value="405061"/>
     *                                   &lt;enumeration value="407001"/>
     *                                   &lt;enumeration value="407241"/>
     *                                   &lt;enumeration value="407121"/>
     *                                   &lt;enumeration value="405211"/>
     *                                   &lt;enumeration value="407511"/>
     *                                   &lt;enumeration value="405331"/>
     *                                   &lt;enumeration value="407751"/>
     *                                   &lt;enumeration value="407631"/>
     *                                   &lt;enumeration value="405691"/>
     *                                   &lt;enumeration value="407991"/>
     *                                   &lt;enumeration value="407871"/>
     *                                   &lt;enumeration value="405451"/>
     *                                   &lt;enumeration value="405571"/>
     *                                   &lt;enumeration value="407191"/>
     *                                   &lt;enumeration value="407071"/>
     *                                   &lt;enumeration value="405321"/>
     *                                   &lt;enumeration value="407621"/>
     *                                   &lt;enumeration value="405441"/>
     *                                   &lt;enumeration value="407501"/>
     *                                   &lt;enumeration value="407861"/>
     *                                   &lt;enumeration value="405201"/>
     *                                   &lt;enumeration value="407741"/>
     *                                   &lt;enumeration value="101000"/>
     *                                   &lt;enumeration value="409000"/>
     *                                   &lt;enumeration value="407061"/>
     *                                   &lt;enumeration value="407981"/>
     *                                   &lt;enumeration value="405561"/>
     *                                   &lt;enumeration value="405681"/>
     *                                   &lt;enumeration value="407181"/>
     *                                   &lt;enumeration value="405431"/>
     *                                   &lt;enumeration value="407731"/>
     *                                   &lt;enumeration value="405551"/>
     *                                   &lt;enumeration value="407611"/>
     *                                   &lt;enumeration value="407971"/>
     *                                   &lt;enumeration value="405311"/>
     *                                   &lt;enumeration value="407851"/>
     *                                   &lt;enumeration value="100000"/>
     *                                   &lt;enumeration value="407171"/>
     *                                   &lt;enumeration value="407051"/>
     *                                   &lt;enumeration value="405671"/>
     *                                   &lt;enumeration value="405791"/>
     *                                   &lt;enumeration value="407291"/>
     *                                   &lt;enumeration value="405541"/>
     *                                   &lt;enumeration value="407841"/>
     *                                   &lt;enumeration value="405661"/>
     *                                   &lt;enumeration value="407721"/>
     *                                   &lt;enumeration value="405301"/>
     *                                   &lt;enumeration value="405421"/>
     *                                   &lt;enumeration value="407961"/>
     *                                   &lt;enumeration value="407601"/>
     *                                   &lt;enumeration value="407041"/>
     *                                   &lt;enumeration value="407281"/>
     *                                   &lt;enumeration value="407161"/>
     *                                   &lt;enumeration value="405781"/>
     *                                   &lt;enumeration value="407311"/>
     *                                   &lt;enumeration value="102000"/>
     *                                   &lt;enumeration value="405811"/>
     *                                   &lt;enumeration value="405931"/>
     *                                   &lt;enumeration value="405491"/>
     *                                   &lt;enumeration value="405251"/>
     *                                   &lt;enumeration value="407551"/>
     *                                   &lt;enumeration value="405371"/>
     *                                   &lt;enumeration value="407431"/>
     *                                   &lt;enumeration value="405011"/>
     *                                   &lt;enumeration value="407791"/>
     *                                   &lt;enumeration value="405131"/>
     *                                   &lt;enumeration value="407671"/>
     *                                   &lt;enumeration value="405801"/>
     *                                   &lt;enumeration value="405001"/>
     *                                   &lt;enumeration value="407421"/>
     *                                   &lt;enumeration value="407301"/>
     *                                   &lt;enumeration value="405921"/>
     *                                   &lt;enumeration value="405361"/>
     *                                   &lt;enumeration value="407661"/>
     *                                   &lt;enumeration value="405481"/>
     *                                   &lt;enumeration value="407541"/>
     *                                   &lt;enumeration value="405121"/>
     *                                   &lt;enumeration value="405241"/>
     *                                   &lt;enumeration value="407781"/>
     *                                   &lt;enumeration value="405911"/>
     *                                   &lt;enumeration value="100500"/>
     *                                   &lt;enumeration value="405111"/>
     *                                   &lt;enumeration value="407531"/>
     *                                   &lt;enumeration value="407411"/>
     *                                   &lt;enumeration value="405471"/>
     *                                   &lt;enumeration value="407771"/>
     *                                   &lt;enumeration value="405591"/>
     *                                   &lt;enumeration value="407651"/>
     *                                   &lt;enumeration value="405231"/>
     *                                   &lt;enumeration value="405351"/>
     *                                   &lt;enumeration value="407891"/>
     *                                   &lt;enumeration value="407091"/>
     *                                   &lt;enumeration value="405901"/>
     *                                   &lt;enumeration value="405101"/>
     *                                   &lt;enumeration value="407401"/>
     *                                   &lt;enumeration value="405221"/>
     *                                   &lt;enumeration value="407641"/>
     *                                   &lt;enumeration value="407521"/>
     *                                   &lt;enumeration value="405581"/>
     *                                   &lt;enumeration value="407881"/>
     *                                   &lt;enumeration value="407761"/>
     *                                   &lt;enumeration value="405341"/>
     *                                   &lt;enumeration value="405461"/>
     *                                   &lt;enumeration value="407081"/>
     *                                   &lt;enumeration value="405851"/>
     *                                   &lt;enumeration value="405971"/>
     *                                   &lt;enumeration value="405611"/>
     *                                   &lt;enumeration value="407911"/>
     *                                   &lt;enumeration value="405731"/>
     *                                   &lt;enumeration value="405291"/>
     *                                   &lt;enumeration value="407591"/>
     *                                   &lt;enumeration value="407471"/>
     *                                   &lt;enumeration value="405051"/>
     *                                   &lt;enumeration value="405171"/>
     *                                   &lt;enumeration value="407111"/>
     *                                   &lt;enumeration value="407351"/>
     *                                   &lt;enumeration value="407231"/>
     *                                   &lt;enumeration value="201000"/>
     *                                   &lt;enumeration value="101500"/>
     *                                   &lt;enumeration value="405961"/>
     *                                   &lt;enumeration value="405721"/>
     *                                   &lt;enumeration value="405841"/>
     *                                   &lt;enumeration value="407901"/>
     *                                   &lt;enumeration value="405601"/>
     *                                   &lt;enumeration value="407581"/>
     *                                   &lt;enumeration value="405161"/>
     *                                   &lt;enumeration value="405281"/>
     *                                   &lt;enumeration value="401000"/>
     *                                   &lt;enumeration value="407221"/>
     *                                   &lt;enumeration value="405041"/>
     *                                   &lt;enumeration value="407101"/>
     *                                   &lt;enumeration value="407461"/>
     *                                   &lt;enumeration value="407341"/>
     *                                   &lt;enumeration value="405831"/>
     *                                   &lt;enumeration value="405951"/>
     *                                   &lt;enumeration value="405711"/>
     *                                   &lt;enumeration value="407691"/>
     *                                   &lt;enumeration value="405271"/>
     *                                   &lt;enumeration value="405391"/>
     *                                   &lt;enumeration value="405031"/>
     *                                   &lt;enumeration value="407331"/>
     *                                   &lt;enumeration value="405151"/>
     *                                   &lt;enumeration value="407211"/>
     *                                   &lt;enumeration value="407571"/>
     *                                   &lt;enumeration value="407451"/>
     *                                   &lt;enumeration value="407201"/>
     *                                   &lt;enumeration value="405941"/>
     *                                   &lt;enumeration value="405701"/>
     *                                   &lt;enumeration value="405821"/>
     *                                   &lt;enumeration value="405381"/>
     *                                   &lt;enumeration value="405141"/>
     *                                   &lt;enumeration value="407441"/>
     *                                   &lt;enumeration value="405261"/>
     *                                   &lt;enumeration value="407321"/>
     *                                   &lt;enumeration value="407681"/>
     *                                   &lt;enumeration value="405021"/>
     *                                   &lt;enumeration value="407561"/>
     *                                   &lt;enumeration value="301000"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="r" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;minExclusive value="-9999999999.999999"/>
     *                                   &lt;maxExclusive value="9999999999.999999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="rc" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="405651"/>
     *                                   &lt;enumeration value="407951"/>
     *                                   &lt;enumeration value="405771"/>
     *                                   &lt;enumeration value="407831"/>
     *                                   &lt;enumeration value="405411"/>
     *                                   &lt;enumeration value="405531"/>
     *                                   &lt;enumeration value="407711"/>
     *                                   &lt;enumeration value="407151"/>
     *                                   &lt;enumeration value="407031"/>
     *                                   &lt;enumeration value="901000"/>
     *                                   &lt;enumeration value="407391"/>
     *                                   &lt;enumeration value="407271"/>
     *                                   &lt;enumeration value="405891"/>
     *                                   &lt;enumeration value="405091"/>
     *                                   &lt;enumeration value="405761"/>
     *                                   &lt;enumeration value="405881"/>
     *                                   &lt;enumeration value="407941"/>
     *                                   &lt;enumeration value="405521"/>
     *                                   &lt;enumeration value="405641"/>
     *                                   &lt;enumeration value="405401"/>
     *                                   &lt;enumeration value="407821"/>
     *                                   &lt;enumeration value="407701"/>
     *                                   &lt;enumeration value="407261"/>
     *                                   &lt;enumeration value="405081"/>
     *                                   &lt;enumeration value="407141"/>
     *                                   &lt;enumeration value="407381"/>
     *                                   &lt;enumeration value="407021"/>
     *                                   &lt;enumeration value="405871"/>
     *                                   &lt;enumeration value="405991"/>
     *                                   &lt;enumeration value="405631"/>
     *                                   &lt;enumeration value="405751"/>
     *                                   &lt;enumeration value="405511"/>
     *                                   &lt;enumeration value="407931"/>
     *                                   &lt;enumeration value="407811"/>
     *                                   &lt;enumeration value="405071"/>
     *                                   &lt;enumeration value="407371"/>
     *                                   &lt;enumeration value="405191"/>
     *                                   &lt;enumeration value="407251"/>
     *                                   &lt;enumeration value="407491"/>
     *                                   &lt;enumeration value="402000"/>
     *                                   &lt;enumeration value="407131"/>
     *                                   &lt;enumeration value="407011"/>
     *                                   &lt;enumeration value="501000"/>
     *                                   &lt;enumeration value="405981"/>
     *                                   &lt;enumeration value="405741"/>
     *                                   &lt;enumeration value="405861"/>
     *                                   &lt;enumeration value="405501"/>
     *                                   &lt;enumeration value="407801"/>
     *                                   &lt;enumeration value="405621"/>
     *                                   &lt;enumeration value="407921"/>
     *                                   &lt;enumeration value="405181"/>
     *                                   &lt;enumeration value="407481"/>
     *                                   &lt;enumeration value="407361"/>
     *                                   &lt;enumeration value="405061"/>
     *                                   &lt;enumeration value="407001"/>
     *                                   &lt;enumeration value="407241"/>
     *                                   &lt;enumeration value="407121"/>
     *                                   &lt;enumeration value="405211"/>
     *                                   &lt;enumeration value="407511"/>
     *                                   &lt;enumeration value="405331"/>
     *                                   &lt;enumeration value="407751"/>
     *                                   &lt;enumeration value="407631"/>
     *                                   &lt;enumeration value="405691"/>
     *                                   &lt;enumeration value="407991"/>
     *                                   &lt;enumeration value="407871"/>
     *                                   &lt;enumeration value="405451"/>
     *                                   &lt;enumeration value="405571"/>
     *                                   &lt;enumeration value="407191"/>
     *                                   &lt;enumeration value="407071"/>
     *                                   &lt;enumeration value="405321"/>
     *                                   &lt;enumeration value="407621"/>
     *                                   &lt;enumeration value="405441"/>
     *                                   &lt;enumeration value="407501"/>
     *                                   &lt;enumeration value="407861"/>
     *                                   &lt;enumeration value="405201"/>
     *                                   &lt;enumeration value="407741"/>
     *                                   &lt;enumeration value="101000"/>
     *                                   &lt;enumeration value="409000"/>
     *                                   &lt;enumeration value="407061"/>
     *                                   &lt;enumeration value="407981"/>
     *                                   &lt;enumeration value="405561"/>
     *                                   &lt;enumeration value="405681"/>
     *                                   &lt;enumeration value="407181"/>
     *                                   &lt;enumeration value="405431"/>
     *                                   &lt;enumeration value="407731"/>
     *                                   &lt;enumeration value="405551"/>
     *                                   &lt;enumeration value="407611"/>
     *                                   &lt;enumeration value="407971"/>
     *                                   &lt;enumeration value="405311"/>
     *                                   &lt;enumeration value="407851"/>
     *                                   &lt;enumeration value="100000"/>
     *                                   &lt;enumeration value="407171"/>
     *                                   &lt;enumeration value="407051"/>
     *                                   &lt;enumeration value="405671"/>
     *                                   &lt;enumeration value="405791"/>
     *                                   &lt;enumeration value="407291"/>
     *                                   &lt;enumeration value="405541"/>
     *                                   &lt;enumeration value="407841"/>
     *                                   &lt;enumeration value="405661"/>
     *                                   &lt;enumeration value="407721"/>
     *                                   &lt;enumeration value="405301"/>
     *                                   &lt;enumeration value="405421"/>
     *                                   &lt;enumeration value="407961"/>
     *                                   &lt;enumeration value="407601"/>
     *                                   &lt;enumeration value="407041"/>
     *                                   &lt;enumeration value="407281"/>
     *                                   &lt;enumeration value="407161"/>
     *                                   &lt;enumeration value="405781"/>
     *                                   &lt;enumeration value="407311"/>
     *                                   &lt;enumeration value="102000"/>
     *                                   &lt;enumeration value="405811"/>
     *                                   &lt;enumeration value="405931"/>
     *                                   &lt;enumeration value="405491"/>
     *                                   &lt;enumeration value="405251"/>
     *                                   &lt;enumeration value="407551"/>
     *                                   &lt;enumeration value="405371"/>
     *                                   &lt;enumeration value="407431"/>
     *                                   &lt;enumeration value="405011"/>
     *                                   &lt;enumeration value="407791"/>
     *                                   &lt;enumeration value="405131"/>
     *                                   &lt;enumeration value="407671"/>
     *                                   &lt;enumeration value="405801"/>
     *                                   &lt;enumeration value="405001"/>
     *                                   &lt;enumeration value="407421"/>
     *                                   &lt;enumeration value="407301"/>
     *                                   &lt;enumeration value="405921"/>
     *                                   &lt;enumeration value="405361"/>
     *                                   &lt;enumeration value="407661"/>
     *                                   &lt;enumeration value="405481"/>
     *                                   &lt;enumeration value="407541"/>
     *                                   &lt;enumeration value="405121"/>
     *                                   &lt;enumeration value="405241"/>
     *                                   &lt;enumeration value="407781"/>
     *                                   &lt;enumeration value="405911"/>
     *                                   &lt;enumeration value="100500"/>
     *                                   &lt;enumeration value="405111"/>
     *                                   &lt;enumeration value="407531"/>
     *                                   &lt;enumeration value="407411"/>
     *                                   &lt;enumeration value="405471"/>
     *                                   &lt;enumeration value="407771"/>
     *                                   &lt;enumeration value="405591"/>
     *                                   &lt;enumeration value="407651"/>
     *                                   &lt;enumeration value="405231"/>
     *                                   &lt;enumeration value="405351"/>
     *                                   &lt;enumeration value="407891"/>
     *                                   &lt;enumeration value="407091"/>
     *                                   &lt;enumeration value="405901"/>
     *                                   &lt;enumeration value="405101"/>
     *                                   &lt;enumeration value="407401"/>
     *                                   &lt;enumeration value="405221"/>
     *                                   &lt;enumeration value="407641"/>
     *                                   &lt;enumeration value="407521"/>
     *                                   &lt;enumeration value="405581"/>
     *                                   &lt;enumeration value="407881"/>
     *                                   &lt;enumeration value="407761"/>
     *                                   &lt;enumeration value="405341"/>
     *                                   &lt;enumeration value="405461"/>
     *                                   &lt;enumeration value="407081"/>
     *                                   &lt;enumeration value="405851"/>
     *                                   &lt;enumeration value="405971"/>
     *                                   &lt;enumeration value="405611"/>
     *                                   &lt;enumeration value="407911"/>
     *                                   &lt;enumeration value="405731"/>
     *                                   &lt;enumeration value="405291"/>
     *                                   &lt;enumeration value="407591"/>
     *                                   &lt;enumeration value="407471"/>
     *                                   &lt;enumeration value="405051"/>
     *                                   &lt;enumeration value="405171"/>
     *                                   &lt;enumeration value="407111"/>
     *                                   &lt;enumeration value="407351"/>
     *                                   &lt;enumeration value="407231"/>
     *                                   &lt;enumeration value="201000"/>
     *                                   &lt;enumeration value="101500"/>
     *                                   &lt;enumeration value="405961"/>
     *                                   &lt;enumeration value="405721"/>
     *                                   &lt;enumeration value="405841"/>
     *                                   &lt;enumeration value="407901"/>
     *                                   &lt;enumeration value="405601"/>
     *                                   &lt;enumeration value="407581"/>
     *                                   &lt;enumeration value="405161"/>
     *                                   &lt;enumeration value="405281"/>
     *                                   &lt;enumeration value="401000"/>
     *                                   &lt;enumeration value="407221"/>
     *                                   &lt;enumeration value="405041"/>
     *                                   &lt;enumeration value="407101"/>
     *                                   &lt;enumeration value="407461"/>
     *                                   &lt;enumeration value="407341"/>
     *                                   &lt;enumeration value="405831"/>
     *                                   &lt;enumeration value="405951"/>
     *                                   &lt;enumeration value="405711"/>
     *                                   &lt;enumeration value="407691"/>
     *                                   &lt;enumeration value="405271"/>
     *                                   &lt;enumeration value="405391"/>
     *                                   &lt;enumeration value="405031"/>
     *                                   &lt;enumeration value="407331"/>
     *                                   &lt;enumeration value="405151"/>
     *                                   &lt;enumeration value="407211"/>
     *                                   &lt;enumeration value="407571"/>
     *                                   &lt;enumeration value="407451"/>
     *                                   &lt;enumeration value="407201"/>
     *                                   &lt;enumeration value="405941"/>
     *                                   &lt;enumeration value="405701"/>
     *                                   &lt;enumeration value="405821"/>
     *                                   &lt;enumeration value="405381"/>
     *                                   &lt;enumeration value="405141"/>
     *                                   &lt;enumeration value="407441"/>
     *                                   &lt;enumeration value="405261"/>
     *                                   &lt;enumeration value="407321"/>
     *                                   &lt;enumeration value="407681"/>
     *                                   &lt;enumeration value="405021"/>
     *                                   &lt;enumeration value="407561"/>
     *                                   &lt;enumeration value="301000"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="sts" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="s" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                                       &lt;minExclusive value="-99999"/>
     *                                                       &lt;maxExclusive value="99999"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="st" minOccurs="0">
     *                                                   &lt;simpleType>
     *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                       &lt;maxLength value="6"/>
     *                                                     &lt;/restriction>
     *                                                   &lt;/simpleType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="mdp" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="16"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nem12UpdateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="soCodeGroup" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="soCodeList" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="seq" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                   &lt;minExclusive value="-99999"/>
     *                                   &lt;maxExclusive value="99999"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="soCode" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;enumeration value="A"/>
     *                                   &lt;enumeration value="C"/>
     *                                   &lt;enumeration value="D"/>
     *                                   &lt;enumeration value="E"/>
     *                                   &lt;enumeration value="G"/>
     *                                   &lt;enumeration value="N"/>
     *                                   &lt;enumeration value="O"/>
     *                                   &lt;enumeration value="R"/>
     *                                   &lt;enumeration value="S"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="indexRead" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="registerId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="30"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "simdId",
        "dvcIdN",
        "mcId",
        "mcIdN",
        "externalId",
        "uom",
        "externalUOM",
        "tou",
        "externalTOU",
        "sqi",
        "externalSQI",
        "stDt",
        "stQty",
        "enDt",
        "enQty",
        "imdType",
        "mcIS",
        "inShift",
        "mcm",
        "nd",
        "tz",
        "externalTimeZone",
        "spi",
        "ccond",
        "sts",
        "msrs",
        "mdp",
        "nem12UpdateDateTime",
        "soCodeGroup",
        "indexRead",
        "registerId"
    })
    public static class PreVEE {

        protected String simdId;
        protected String dvcIdN;
        protected String mcId;
        protected String mcIdN;
        protected String externalId;
        protected String uom;
        protected String externalUOM;
        protected String tou;
        protected String externalTOU;
        protected String sqi;
        protected String externalSQI;
        @XmlElementRef(name = "stDt", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> stDt;
        protected BigDecimal stQty;
        @XmlElementRef(name = "enDt", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> enDt;
        protected BigDecimal enQty;
        @XmlElementRef(name = "imdType", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> imdType;
        @XmlElementRef(name = "mcIS", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> mcIS;
        @XmlElementRef(name = "inShift", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> inShift;
        protected BigDecimal mcm;
        protected BigDecimal nd;
        protected String tz;
        protected String externalTimeZone;
        @XmlElementRef(name = "spi", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Integer> spi;
        @XmlElementRef(name = "ccond", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> ccond;
        protected CMIMDSeeder.PreVEE.Sts sts;
        protected CMIMDSeeder.PreVEE.Msrs msrs;
        protected String mdp;
        @XmlElementRef(name = "nem12UpdateDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> nem12UpdateDateTime;
        protected CMIMDSeeder.PreVEE.SoCodeGroup soCodeGroup;
        protected String indexRead;
        protected String registerId;

        /**
         * Gets the value of the simdId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSimdId() {
            return simdId;
        }

        /**
         * Sets the value of the simdId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSimdId(String value) {
            this.simdId = value;
        }

        /**
         * Gets the value of the dvcIdN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDvcIdN() {
            return dvcIdN;
        }

        /**
         * Sets the value of the dvcIdN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDvcIdN(String value) {
            this.dvcIdN = value;
        }

        /**
         * Gets the value of the mcId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMcId() {
            return mcId;
        }

        /**
         * Sets the value of the mcId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcId(String value) {
            this.mcId = value;
        }

        /**
         * Gets the value of the mcIdN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMcIdN() {
            return mcIdN;
        }

        /**
         * Sets the value of the mcIdN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMcIdN(String value) {
            this.mcIdN = value;
        }

        /**
         * Gets the value of the externalId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalId() {
            return externalId;
        }

        /**
         * Sets the value of the externalId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalId(String value) {
            this.externalId = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUom() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUom(String value) {
            this.uom = value;
        }

        /**
         * Gets the value of the externalUOM property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalUOM() {
            return externalUOM;
        }

        /**
         * Sets the value of the externalUOM property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalUOM(String value) {
            this.externalUOM = value;
        }

        /**
         * Gets the value of the tou property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTou() {
            return tou;
        }

        /**
         * Sets the value of the tou property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTou(String value) {
            this.tou = value;
        }

        /**
         * Gets the value of the externalTOU property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalTOU() {
            return externalTOU;
        }

        /**
         * Sets the value of the externalTOU property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalTOU(String value) {
            this.externalTOU = value;
        }

        /**
         * Gets the value of the sqi property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSqi() {
            return sqi;
        }

        /**
         * Sets the value of the sqi property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSqi(String value) {
            this.sqi = value;
        }

        /**
         * Gets the value of the externalSQI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalSQI() {
            return externalSQI;
        }

        /**
         * Sets the value of the externalSQI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalSQI(String value) {
            this.externalSQI = value;
        }

        /**
         * Gets the value of the stDt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getStDt() {
            return stDt;
        }

        /**
         * Sets the value of the stDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setStDt(JAXBElement<XMLGregorianCalendar> value) {
            this.stDt = value;
        }

        /**
         * Gets the value of the stQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getStQty() {
            return stQty;
        }

        /**
         * Sets the value of the stQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setStQty(BigDecimal value) {
            this.stQty = value;
        }

        /**
         * Gets the value of the enDt property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getEnDt() {
            return enDt;
        }

        /**
         * Sets the value of the enDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setEnDt(JAXBElement<XMLGregorianCalendar> value) {
            this.enDt = value;
        }

        /**
         * Gets the value of the enQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEnQty() {
            return enQty;
        }

        /**
         * Sets the value of the enQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEnQty(BigDecimal value) {
            this.enQty = value;
        }

        /**
         * Gets the value of the imdType property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getImdType() {
            return imdType;
        }

        /**
         * Sets the value of the imdType property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setImdType(JAXBElement<String> value) {
            this.imdType = value;
        }

        /**
         * Gets the value of the mcIS property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getMcIS() {
            return mcIS;
        }

        /**
         * Sets the value of the mcIS property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setMcIS(JAXBElement<String> value) {
            this.mcIS = value;
        }

        /**
         * Gets the value of the inShift property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getInShift() {
            return inShift;
        }

        /**
         * Sets the value of the inShift property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setInShift(JAXBElement<String> value) {
            this.inShift = value;
        }

        /**
         * Gets the value of the mcm property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMcm() {
            return mcm;
        }

        /**
         * Sets the value of the mcm property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMcm(BigDecimal value) {
            this.mcm = value;
        }

        /**
         * Gets the value of the nd property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getNd() {
            return nd;
        }

        /**
         * Sets the value of the nd property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setNd(BigDecimal value) {
            this.nd = value;
        }

        /**
         * Gets the value of the tz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTz() {
            return tz;
        }

        /**
         * Sets the value of the tz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTz(String value) {
            this.tz = value;
        }

        /**
         * Gets the value of the externalTimeZone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExternalTimeZone() {
            return externalTimeZone;
        }

        /**
         * Sets the value of the externalTimeZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExternalTimeZone(String value) {
            this.externalTimeZone = value;
        }

        /**
         * Gets the value of the spi property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getSpi() {
            return spi;
        }

        /**
         * Sets the value of the spi property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setSpi(JAXBElement<Integer> value) {
            this.spi = value;
        }

        /**
         * Gets the value of the ccond property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getCcond() {
            return ccond;
        }

        /**
         * Sets the value of the ccond property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setCcond(JAXBElement<String> value) {
            this.ccond = value;
        }

        /**
         * Gets the value of the sts property.
         * 
         * @return
         *     possible object is
         *     {@link CMIMDSeeder.PreVEE.Sts }
         *     
         */
        public CMIMDSeeder.PreVEE.Sts getSts() {
            return sts;
        }

        /**
         * Sets the value of the sts property.
         * 
         * @param value
         *     allowed object is
         *     {@link CMIMDSeeder.PreVEE.Sts }
         *     
         */
        public void setSts(CMIMDSeeder.PreVEE.Sts value) {
            this.sts = value;
        }

        /**
         * Gets the value of the msrs property.
         * 
         * @return
         *     possible object is
         *     {@link CMIMDSeeder.PreVEE.Msrs }
         *     
         */
        public CMIMDSeeder.PreVEE.Msrs getMsrs() {
            return msrs;
        }

        /**
         * Sets the value of the msrs property.
         * 
         * @param value
         *     allowed object is
         *     {@link CMIMDSeeder.PreVEE.Msrs }
         *     
         */
        public void setMsrs(CMIMDSeeder.PreVEE.Msrs value) {
            this.msrs = value;
        }

        /**
         * Gets the value of the mdp property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMdp() {
            return mdp;
        }

        /**
         * Sets the value of the mdp property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMdp(String value) {
            this.mdp = value;
        }

        /**
         * Gets the value of the nem12UpdateDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public JAXBElement<XMLGregorianCalendar> getNem12UpdateDateTime() {
            return nem12UpdateDateTime;
        }

        /**
         * Sets the value of the nem12UpdateDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *     
         */
        public void setNem12UpdateDateTime(JAXBElement<XMLGregorianCalendar> value) {
            this.nem12UpdateDateTime = value;
        }

        /**
         * Gets the value of the soCodeGroup property.
         * 
         * @return
         *     possible object is
         *     {@link CMIMDSeeder.PreVEE.SoCodeGroup }
         *     
         */
        public CMIMDSeeder.PreVEE.SoCodeGroup getSoCodeGroup() {
            return soCodeGroup;
        }

        /**
         * Sets the value of the soCodeGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link CMIMDSeeder.PreVEE.SoCodeGroup }
         *     
         */
        public void setSoCodeGroup(CMIMDSeeder.PreVEE.SoCodeGroup value) {
            this.soCodeGroup = value;
        }

        /**
         * Gets the value of the indexRead property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndexRead() {
            return indexRead;
        }

        /**
         * Sets the value of the indexRead property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndexRead(String value) {
            this.indexRead = value;
        }

        /**
         * Gets the value of the registerId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegisterId() {
            return registerId;
        }

        /**
         * Sets the value of the registerId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegisterId(String value) {
            this.registerId = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="mL" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="s" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;minExclusive value="-99999"/>
         *                         &lt;maxExclusive value="99999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                   &lt;element name="q" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;minExclusive value="-9999999999.999999"/>
         *                         &lt;maxExclusive value="9999999999.999999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="ue" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="D1UE"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="fc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="405651"/>
         *                         &lt;enumeration value="407951"/>
         *                         &lt;enumeration value="405771"/>
         *                         &lt;enumeration value="407831"/>
         *                         &lt;enumeration value="405411"/>
         *                         &lt;enumeration value="405531"/>
         *                         &lt;enumeration value="407711"/>
         *                         &lt;enumeration value="407151"/>
         *                         &lt;enumeration value="407031"/>
         *                         &lt;enumeration value="901000"/>
         *                         &lt;enumeration value="407391"/>
         *                         &lt;enumeration value="407271"/>
         *                         &lt;enumeration value="405891"/>
         *                         &lt;enumeration value="405091"/>
         *                         &lt;enumeration value="405761"/>
         *                         &lt;enumeration value="405881"/>
         *                         &lt;enumeration value="407941"/>
         *                         &lt;enumeration value="405521"/>
         *                         &lt;enumeration value="405641"/>
         *                         &lt;enumeration value="405401"/>
         *                         &lt;enumeration value="407821"/>
         *                         &lt;enumeration value="407701"/>
         *                         &lt;enumeration value="407261"/>
         *                         &lt;enumeration value="405081"/>
         *                         &lt;enumeration value="407141"/>
         *                         &lt;enumeration value="407381"/>
         *                         &lt;enumeration value="407021"/>
         *                         &lt;enumeration value="405871"/>
         *                         &lt;enumeration value="405991"/>
         *                         &lt;enumeration value="405631"/>
         *                         &lt;enumeration value="405751"/>
         *                         &lt;enumeration value="405511"/>
         *                         &lt;enumeration value="407931"/>
         *                         &lt;enumeration value="407811"/>
         *                         &lt;enumeration value="405071"/>
         *                         &lt;enumeration value="407371"/>
         *                         &lt;enumeration value="405191"/>
         *                         &lt;enumeration value="407251"/>
         *                         &lt;enumeration value="407491"/>
         *                         &lt;enumeration value="402000"/>
         *                         &lt;enumeration value="407131"/>
         *                         &lt;enumeration value="407011"/>
         *                         &lt;enumeration value="501000"/>
         *                         &lt;enumeration value="405981"/>
         *                         &lt;enumeration value="405741"/>
         *                         &lt;enumeration value="405861"/>
         *                         &lt;enumeration value="405501"/>
         *                         &lt;enumeration value="407801"/>
         *                         &lt;enumeration value="405621"/>
         *                         &lt;enumeration value="407921"/>
         *                         &lt;enumeration value="405181"/>
         *                         &lt;enumeration value="407481"/>
         *                         &lt;enumeration value="407361"/>
         *                         &lt;enumeration value="405061"/>
         *                         &lt;enumeration value="407001"/>
         *                         &lt;enumeration value="407241"/>
         *                         &lt;enumeration value="407121"/>
         *                         &lt;enumeration value="405211"/>
         *                         &lt;enumeration value="407511"/>
         *                         &lt;enumeration value="405331"/>
         *                         &lt;enumeration value="407751"/>
         *                         &lt;enumeration value="407631"/>
         *                         &lt;enumeration value="405691"/>
         *                         &lt;enumeration value="407991"/>
         *                         &lt;enumeration value="407871"/>
         *                         &lt;enumeration value="405451"/>
         *                         &lt;enumeration value="405571"/>
         *                         &lt;enumeration value="407191"/>
         *                         &lt;enumeration value="407071"/>
         *                         &lt;enumeration value="405321"/>
         *                         &lt;enumeration value="407621"/>
         *                         &lt;enumeration value="405441"/>
         *                         &lt;enumeration value="407501"/>
         *                         &lt;enumeration value="407861"/>
         *                         &lt;enumeration value="405201"/>
         *                         &lt;enumeration value="407741"/>
         *                         &lt;enumeration value="101000"/>
         *                         &lt;enumeration value="409000"/>
         *                         &lt;enumeration value="407061"/>
         *                         &lt;enumeration value="407981"/>
         *                         &lt;enumeration value="405561"/>
         *                         &lt;enumeration value="405681"/>
         *                         &lt;enumeration value="407181"/>
         *                         &lt;enumeration value="405431"/>
         *                         &lt;enumeration value="407731"/>
         *                         &lt;enumeration value="405551"/>
         *                         &lt;enumeration value="407611"/>
         *                         &lt;enumeration value="407971"/>
         *                         &lt;enumeration value="405311"/>
         *                         &lt;enumeration value="407851"/>
         *                         &lt;enumeration value="100000"/>
         *                         &lt;enumeration value="407171"/>
         *                         &lt;enumeration value="407051"/>
         *                         &lt;enumeration value="405671"/>
         *                         &lt;enumeration value="405791"/>
         *                         &lt;enumeration value="407291"/>
         *                         &lt;enumeration value="405541"/>
         *                         &lt;enumeration value="407841"/>
         *                         &lt;enumeration value="405661"/>
         *                         &lt;enumeration value="407721"/>
         *                         &lt;enumeration value="405301"/>
         *                         &lt;enumeration value="405421"/>
         *                         &lt;enumeration value="407961"/>
         *                         &lt;enumeration value="407601"/>
         *                         &lt;enumeration value="407041"/>
         *                         &lt;enumeration value="407281"/>
         *                         &lt;enumeration value="407161"/>
         *                         &lt;enumeration value="405781"/>
         *                         &lt;enumeration value="407311"/>
         *                         &lt;enumeration value="102000"/>
         *                         &lt;enumeration value="405811"/>
         *                         &lt;enumeration value="405931"/>
         *                         &lt;enumeration value="405491"/>
         *                         &lt;enumeration value="405251"/>
         *                         &lt;enumeration value="407551"/>
         *                         &lt;enumeration value="405371"/>
         *                         &lt;enumeration value="407431"/>
         *                         &lt;enumeration value="405011"/>
         *                         &lt;enumeration value="407791"/>
         *                         &lt;enumeration value="405131"/>
         *                         &lt;enumeration value="407671"/>
         *                         &lt;enumeration value="405801"/>
         *                         &lt;enumeration value="405001"/>
         *                         &lt;enumeration value="407421"/>
         *                         &lt;enumeration value="407301"/>
         *                         &lt;enumeration value="405921"/>
         *                         &lt;enumeration value="405361"/>
         *                         &lt;enumeration value="407661"/>
         *                         &lt;enumeration value="405481"/>
         *                         &lt;enumeration value="407541"/>
         *                         &lt;enumeration value="405121"/>
         *                         &lt;enumeration value="405241"/>
         *                         &lt;enumeration value="407781"/>
         *                         &lt;enumeration value="405911"/>
         *                         &lt;enumeration value="100500"/>
         *                         &lt;enumeration value="405111"/>
         *                         &lt;enumeration value="407531"/>
         *                         &lt;enumeration value="407411"/>
         *                         &lt;enumeration value="405471"/>
         *                         &lt;enumeration value="407771"/>
         *                         &lt;enumeration value="405591"/>
         *                         &lt;enumeration value="407651"/>
         *                         &lt;enumeration value="405231"/>
         *                         &lt;enumeration value="405351"/>
         *                         &lt;enumeration value="407891"/>
         *                         &lt;enumeration value="407091"/>
         *                         &lt;enumeration value="405901"/>
         *                         &lt;enumeration value="405101"/>
         *                         &lt;enumeration value="407401"/>
         *                         &lt;enumeration value="405221"/>
         *                         &lt;enumeration value="407641"/>
         *                         &lt;enumeration value="407521"/>
         *                         &lt;enumeration value="405581"/>
         *                         &lt;enumeration value="407881"/>
         *                         &lt;enumeration value="407761"/>
         *                         &lt;enumeration value="405341"/>
         *                         &lt;enumeration value="405461"/>
         *                         &lt;enumeration value="407081"/>
         *                         &lt;enumeration value="405851"/>
         *                         &lt;enumeration value="405971"/>
         *                         &lt;enumeration value="405611"/>
         *                         &lt;enumeration value="407911"/>
         *                         &lt;enumeration value="405731"/>
         *                         &lt;enumeration value="405291"/>
         *                         &lt;enumeration value="407591"/>
         *                         &lt;enumeration value="407471"/>
         *                         &lt;enumeration value="405051"/>
         *                         &lt;enumeration value="405171"/>
         *                         &lt;enumeration value="407111"/>
         *                         &lt;enumeration value="407351"/>
         *                         &lt;enumeration value="407231"/>
         *                         &lt;enumeration value="201000"/>
         *                         &lt;enumeration value="101500"/>
         *                         &lt;enumeration value="405961"/>
         *                         &lt;enumeration value="405721"/>
         *                         &lt;enumeration value="405841"/>
         *                         &lt;enumeration value="407901"/>
         *                         &lt;enumeration value="405601"/>
         *                         &lt;enumeration value="407581"/>
         *                         &lt;enumeration value="405161"/>
         *                         &lt;enumeration value="405281"/>
         *                         &lt;enumeration value="401000"/>
         *                         &lt;enumeration value="407221"/>
         *                         &lt;enumeration value="405041"/>
         *                         &lt;enumeration value="407101"/>
         *                         &lt;enumeration value="407461"/>
         *                         &lt;enumeration value="407341"/>
         *                         &lt;enumeration value="405831"/>
         *                         &lt;enumeration value="405951"/>
         *                         &lt;enumeration value="405711"/>
         *                         &lt;enumeration value="407691"/>
         *                         &lt;enumeration value="405271"/>
         *                         &lt;enumeration value="405391"/>
         *                         &lt;enumeration value="405031"/>
         *                         &lt;enumeration value="407331"/>
         *                         &lt;enumeration value="405151"/>
         *                         &lt;enumeration value="407211"/>
         *                         &lt;enumeration value="407571"/>
         *                         &lt;enumeration value="407451"/>
         *                         &lt;enumeration value="407201"/>
         *                         &lt;enumeration value="405941"/>
         *                         &lt;enumeration value="405701"/>
         *                         &lt;enumeration value="405821"/>
         *                         &lt;enumeration value="405381"/>
         *                         &lt;enumeration value="405141"/>
         *                         &lt;enumeration value="407441"/>
         *                         &lt;enumeration value="405261"/>
         *                         &lt;enumeration value="407321"/>
         *                         &lt;enumeration value="407681"/>
         *                         &lt;enumeration value="405021"/>
         *                         &lt;enumeration value="407561"/>
         *                         &lt;enumeration value="301000"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="r" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;minExclusive value="-9999999999.999999"/>
         *                         &lt;maxExclusive value="9999999999.999999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="rc" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="405651"/>
         *                         &lt;enumeration value="407951"/>
         *                         &lt;enumeration value="405771"/>
         *                         &lt;enumeration value="407831"/>
         *                         &lt;enumeration value="405411"/>
         *                         &lt;enumeration value="405531"/>
         *                         &lt;enumeration value="407711"/>
         *                         &lt;enumeration value="407151"/>
         *                         &lt;enumeration value="407031"/>
         *                         &lt;enumeration value="901000"/>
         *                         &lt;enumeration value="407391"/>
         *                         &lt;enumeration value="407271"/>
         *                         &lt;enumeration value="405891"/>
         *                         &lt;enumeration value="405091"/>
         *                         &lt;enumeration value="405761"/>
         *                         &lt;enumeration value="405881"/>
         *                         &lt;enumeration value="407941"/>
         *                         &lt;enumeration value="405521"/>
         *                         &lt;enumeration value="405641"/>
         *                         &lt;enumeration value="405401"/>
         *                         &lt;enumeration value="407821"/>
         *                         &lt;enumeration value="407701"/>
         *                         &lt;enumeration value="407261"/>
         *                         &lt;enumeration value="405081"/>
         *                         &lt;enumeration value="407141"/>
         *                         &lt;enumeration value="407381"/>
         *                         &lt;enumeration value="407021"/>
         *                         &lt;enumeration value="405871"/>
         *                         &lt;enumeration value="405991"/>
         *                         &lt;enumeration value="405631"/>
         *                         &lt;enumeration value="405751"/>
         *                         &lt;enumeration value="405511"/>
         *                         &lt;enumeration value="407931"/>
         *                         &lt;enumeration value="407811"/>
         *                         &lt;enumeration value="405071"/>
         *                         &lt;enumeration value="407371"/>
         *                         &lt;enumeration value="405191"/>
         *                         &lt;enumeration value="407251"/>
         *                         &lt;enumeration value="407491"/>
         *                         &lt;enumeration value="402000"/>
         *                         &lt;enumeration value="407131"/>
         *                         &lt;enumeration value="407011"/>
         *                         &lt;enumeration value="501000"/>
         *                         &lt;enumeration value="405981"/>
         *                         &lt;enumeration value="405741"/>
         *                         &lt;enumeration value="405861"/>
         *                         &lt;enumeration value="405501"/>
         *                         &lt;enumeration value="407801"/>
         *                         &lt;enumeration value="405621"/>
         *                         &lt;enumeration value="407921"/>
         *                         &lt;enumeration value="405181"/>
         *                         &lt;enumeration value="407481"/>
         *                         &lt;enumeration value="407361"/>
         *                         &lt;enumeration value="405061"/>
         *                         &lt;enumeration value="407001"/>
         *                         &lt;enumeration value="407241"/>
         *                         &lt;enumeration value="407121"/>
         *                         &lt;enumeration value="405211"/>
         *                         &lt;enumeration value="407511"/>
         *                         &lt;enumeration value="405331"/>
         *                         &lt;enumeration value="407751"/>
         *                         &lt;enumeration value="407631"/>
         *                         &lt;enumeration value="405691"/>
         *                         &lt;enumeration value="407991"/>
         *                         &lt;enumeration value="407871"/>
         *                         &lt;enumeration value="405451"/>
         *                         &lt;enumeration value="405571"/>
         *                         &lt;enumeration value="407191"/>
         *                         &lt;enumeration value="407071"/>
         *                         &lt;enumeration value="405321"/>
         *                         &lt;enumeration value="407621"/>
         *                         &lt;enumeration value="405441"/>
         *                         &lt;enumeration value="407501"/>
         *                         &lt;enumeration value="407861"/>
         *                         &lt;enumeration value="405201"/>
         *                         &lt;enumeration value="407741"/>
         *                         &lt;enumeration value="101000"/>
         *                         &lt;enumeration value="409000"/>
         *                         &lt;enumeration value="407061"/>
         *                         &lt;enumeration value="407981"/>
         *                         &lt;enumeration value="405561"/>
         *                         &lt;enumeration value="405681"/>
         *                         &lt;enumeration value="407181"/>
         *                         &lt;enumeration value="405431"/>
         *                         &lt;enumeration value="407731"/>
         *                         &lt;enumeration value="405551"/>
         *                         &lt;enumeration value="407611"/>
         *                         &lt;enumeration value="407971"/>
         *                         &lt;enumeration value="405311"/>
         *                         &lt;enumeration value="407851"/>
         *                         &lt;enumeration value="100000"/>
         *                         &lt;enumeration value="407171"/>
         *                         &lt;enumeration value="407051"/>
         *                         &lt;enumeration value="405671"/>
         *                         &lt;enumeration value="405791"/>
         *                         &lt;enumeration value="407291"/>
         *                         &lt;enumeration value="405541"/>
         *                         &lt;enumeration value="407841"/>
         *                         &lt;enumeration value="405661"/>
         *                         &lt;enumeration value="407721"/>
         *                         &lt;enumeration value="405301"/>
         *                         &lt;enumeration value="405421"/>
         *                         &lt;enumeration value="407961"/>
         *                         &lt;enumeration value="407601"/>
         *                         &lt;enumeration value="407041"/>
         *                         &lt;enumeration value="407281"/>
         *                         &lt;enumeration value="407161"/>
         *                         &lt;enumeration value="405781"/>
         *                         &lt;enumeration value="407311"/>
         *                         &lt;enumeration value="102000"/>
         *                         &lt;enumeration value="405811"/>
         *                         &lt;enumeration value="405931"/>
         *                         &lt;enumeration value="405491"/>
         *                         &lt;enumeration value="405251"/>
         *                         &lt;enumeration value="407551"/>
         *                         &lt;enumeration value="405371"/>
         *                         &lt;enumeration value="407431"/>
         *                         &lt;enumeration value="405011"/>
         *                         &lt;enumeration value="407791"/>
         *                         &lt;enumeration value="405131"/>
         *                         &lt;enumeration value="407671"/>
         *                         &lt;enumeration value="405801"/>
         *                         &lt;enumeration value="405001"/>
         *                         &lt;enumeration value="407421"/>
         *                         &lt;enumeration value="407301"/>
         *                         &lt;enumeration value="405921"/>
         *                         &lt;enumeration value="405361"/>
         *                         &lt;enumeration value="407661"/>
         *                         &lt;enumeration value="405481"/>
         *                         &lt;enumeration value="407541"/>
         *                         &lt;enumeration value="405121"/>
         *                         &lt;enumeration value="405241"/>
         *                         &lt;enumeration value="407781"/>
         *                         &lt;enumeration value="405911"/>
         *                         &lt;enumeration value="100500"/>
         *                         &lt;enumeration value="405111"/>
         *                         &lt;enumeration value="407531"/>
         *                         &lt;enumeration value="407411"/>
         *                         &lt;enumeration value="405471"/>
         *                         &lt;enumeration value="407771"/>
         *                         &lt;enumeration value="405591"/>
         *                         &lt;enumeration value="407651"/>
         *                         &lt;enumeration value="405231"/>
         *                         &lt;enumeration value="405351"/>
         *                         &lt;enumeration value="407891"/>
         *                         &lt;enumeration value="407091"/>
         *                         &lt;enumeration value="405901"/>
         *                         &lt;enumeration value="405101"/>
         *                         &lt;enumeration value="407401"/>
         *                         &lt;enumeration value="405221"/>
         *                         &lt;enumeration value="407641"/>
         *                         &lt;enumeration value="407521"/>
         *                         &lt;enumeration value="405581"/>
         *                         &lt;enumeration value="407881"/>
         *                         &lt;enumeration value="407761"/>
         *                         &lt;enumeration value="405341"/>
         *                         &lt;enumeration value="405461"/>
         *                         &lt;enumeration value="407081"/>
         *                         &lt;enumeration value="405851"/>
         *                         &lt;enumeration value="405971"/>
         *                         &lt;enumeration value="405611"/>
         *                         &lt;enumeration value="407911"/>
         *                         &lt;enumeration value="405731"/>
         *                         &lt;enumeration value="405291"/>
         *                         &lt;enumeration value="407591"/>
         *                         &lt;enumeration value="407471"/>
         *                         &lt;enumeration value="405051"/>
         *                         &lt;enumeration value="405171"/>
         *                         &lt;enumeration value="407111"/>
         *                         &lt;enumeration value="407351"/>
         *                         &lt;enumeration value="407231"/>
         *                         &lt;enumeration value="201000"/>
         *                         &lt;enumeration value="101500"/>
         *                         &lt;enumeration value="405961"/>
         *                         &lt;enumeration value="405721"/>
         *                         &lt;enumeration value="405841"/>
         *                         &lt;enumeration value="407901"/>
         *                         &lt;enumeration value="405601"/>
         *                         &lt;enumeration value="407581"/>
         *                         &lt;enumeration value="405161"/>
         *                         &lt;enumeration value="405281"/>
         *                         &lt;enumeration value="401000"/>
         *                         &lt;enumeration value="407221"/>
         *                         &lt;enumeration value="405041"/>
         *                         &lt;enumeration value="407101"/>
         *                         &lt;enumeration value="407461"/>
         *                         &lt;enumeration value="407341"/>
         *                         &lt;enumeration value="405831"/>
         *                         &lt;enumeration value="405951"/>
         *                         &lt;enumeration value="405711"/>
         *                         &lt;enumeration value="407691"/>
         *                         &lt;enumeration value="405271"/>
         *                         &lt;enumeration value="405391"/>
         *                         &lt;enumeration value="405031"/>
         *                         &lt;enumeration value="407331"/>
         *                         &lt;enumeration value="405151"/>
         *                         &lt;enumeration value="407211"/>
         *                         &lt;enumeration value="407571"/>
         *                         &lt;enumeration value="407451"/>
         *                         &lt;enumeration value="407201"/>
         *                         &lt;enumeration value="405941"/>
         *                         &lt;enumeration value="405701"/>
         *                         &lt;enumeration value="405821"/>
         *                         &lt;enumeration value="405381"/>
         *                         &lt;enumeration value="405141"/>
         *                         &lt;enumeration value="407441"/>
         *                         &lt;enumeration value="405261"/>
         *                         &lt;enumeration value="407321"/>
         *                         &lt;enumeration value="407681"/>
         *                         &lt;enumeration value="405021"/>
         *                         &lt;enumeration value="407561"/>
         *                         &lt;enumeration value="301000"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="sts" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="s" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                             &lt;minExclusive value="-99999"/>
         *                                             &lt;maxExclusive value="99999"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                       &lt;element name="st" minOccurs="0">
         *                                         &lt;simpleType>
         *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                             &lt;maxLength value="6"/>
         *                                           &lt;/restriction>
         *                                         &lt;/simpleType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ml"
        })
        public static class Msrs {

            @XmlElement(name = "mL")
            protected List<CMIMDSeeder.PreVEE.Msrs.ML> ml;

            /**
             * Gets the value of the ml property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ml property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getML().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CMIMDSeeder.PreVEE.Msrs.ML }
             * 
             * 
             */
            public List<CMIMDSeeder.PreVEE.Msrs.ML> getML() {
                if (ml == null) {
                    ml = new ArrayList<CMIMDSeeder.PreVEE.Msrs.ML>();
                }
                return this.ml;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="s" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;minExclusive value="-99999"/>
             *               &lt;maxExclusive value="99999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *         &lt;element name="q" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;minExclusive value="-9999999999.999999"/>
             *               &lt;maxExclusive value="9999999999.999999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="ue" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="D1UE"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="fc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="405651"/>
             *               &lt;enumeration value="407951"/>
             *               &lt;enumeration value="405771"/>
             *               &lt;enumeration value="407831"/>
             *               &lt;enumeration value="405411"/>
             *               &lt;enumeration value="405531"/>
             *               &lt;enumeration value="407711"/>
             *               &lt;enumeration value="407151"/>
             *               &lt;enumeration value="407031"/>
             *               &lt;enumeration value="901000"/>
             *               &lt;enumeration value="407391"/>
             *               &lt;enumeration value="407271"/>
             *               &lt;enumeration value="405891"/>
             *               &lt;enumeration value="405091"/>
             *               &lt;enumeration value="405761"/>
             *               &lt;enumeration value="405881"/>
             *               &lt;enumeration value="407941"/>
             *               &lt;enumeration value="405521"/>
             *               &lt;enumeration value="405641"/>
             *               &lt;enumeration value="405401"/>
             *               &lt;enumeration value="407821"/>
             *               &lt;enumeration value="407701"/>
             *               &lt;enumeration value="407261"/>
             *               &lt;enumeration value="405081"/>
             *               &lt;enumeration value="407141"/>
             *               &lt;enumeration value="407381"/>
             *               &lt;enumeration value="407021"/>
             *               &lt;enumeration value="405871"/>
             *               &lt;enumeration value="405991"/>
             *               &lt;enumeration value="405631"/>
             *               &lt;enumeration value="405751"/>
             *               &lt;enumeration value="405511"/>
             *               &lt;enumeration value="407931"/>
             *               &lt;enumeration value="407811"/>
             *               &lt;enumeration value="405071"/>
             *               &lt;enumeration value="407371"/>
             *               &lt;enumeration value="405191"/>
             *               &lt;enumeration value="407251"/>
             *               &lt;enumeration value="407491"/>
             *               &lt;enumeration value="402000"/>
             *               &lt;enumeration value="407131"/>
             *               &lt;enumeration value="407011"/>
             *               &lt;enumeration value="501000"/>
             *               &lt;enumeration value="405981"/>
             *               &lt;enumeration value="405741"/>
             *               &lt;enumeration value="405861"/>
             *               &lt;enumeration value="405501"/>
             *               &lt;enumeration value="407801"/>
             *               &lt;enumeration value="405621"/>
             *               &lt;enumeration value="407921"/>
             *               &lt;enumeration value="405181"/>
             *               &lt;enumeration value="407481"/>
             *               &lt;enumeration value="407361"/>
             *               &lt;enumeration value="405061"/>
             *               &lt;enumeration value="407001"/>
             *               &lt;enumeration value="407241"/>
             *               &lt;enumeration value="407121"/>
             *               &lt;enumeration value="405211"/>
             *               &lt;enumeration value="407511"/>
             *               &lt;enumeration value="405331"/>
             *               &lt;enumeration value="407751"/>
             *               &lt;enumeration value="407631"/>
             *               &lt;enumeration value="405691"/>
             *               &lt;enumeration value="407991"/>
             *               &lt;enumeration value="407871"/>
             *               &lt;enumeration value="405451"/>
             *               &lt;enumeration value="405571"/>
             *               &lt;enumeration value="407191"/>
             *               &lt;enumeration value="407071"/>
             *               &lt;enumeration value="405321"/>
             *               &lt;enumeration value="407621"/>
             *               &lt;enumeration value="405441"/>
             *               &lt;enumeration value="407501"/>
             *               &lt;enumeration value="407861"/>
             *               &lt;enumeration value="405201"/>
             *               &lt;enumeration value="407741"/>
             *               &lt;enumeration value="101000"/>
             *               &lt;enumeration value="409000"/>
             *               &lt;enumeration value="407061"/>
             *               &lt;enumeration value="407981"/>
             *               &lt;enumeration value="405561"/>
             *               &lt;enumeration value="405681"/>
             *               &lt;enumeration value="407181"/>
             *               &lt;enumeration value="405431"/>
             *               &lt;enumeration value="407731"/>
             *               &lt;enumeration value="405551"/>
             *               &lt;enumeration value="407611"/>
             *               &lt;enumeration value="407971"/>
             *               &lt;enumeration value="405311"/>
             *               &lt;enumeration value="407851"/>
             *               &lt;enumeration value="100000"/>
             *               &lt;enumeration value="407171"/>
             *               &lt;enumeration value="407051"/>
             *               &lt;enumeration value="405671"/>
             *               &lt;enumeration value="405791"/>
             *               &lt;enumeration value="407291"/>
             *               &lt;enumeration value="405541"/>
             *               &lt;enumeration value="407841"/>
             *               &lt;enumeration value="405661"/>
             *               &lt;enumeration value="407721"/>
             *               &lt;enumeration value="405301"/>
             *               &lt;enumeration value="405421"/>
             *               &lt;enumeration value="407961"/>
             *               &lt;enumeration value="407601"/>
             *               &lt;enumeration value="407041"/>
             *               &lt;enumeration value="407281"/>
             *               &lt;enumeration value="407161"/>
             *               &lt;enumeration value="405781"/>
             *               &lt;enumeration value="407311"/>
             *               &lt;enumeration value="102000"/>
             *               &lt;enumeration value="405811"/>
             *               &lt;enumeration value="405931"/>
             *               &lt;enumeration value="405491"/>
             *               &lt;enumeration value="405251"/>
             *               &lt;enumeration value="407551"/>
             *               &lt;enumeration value="405371"/>
             *               &lt;enumeration value="407431"/>
             *               &lt;enumeration value="405011"/>
             *               &lt;enumeration value="407791"/>
             *               &lt;enumeration value="405131"/>
             *               &lt;enumeration value="407671"/>
             *               &lt;enumeration value="405801"/>
             *               &lt;enumeration value="405001"/>
             *               &lt;enumeration value="407421"/>
             *               &lt;enumeration value="407301"/>
             *               &lt;enumeration value="405921"/>
             *               &lt;enumeration value="405361"/>
             *               &lt;enumeration value="407661"/>
             *               &lt;enumeration value="405481"/>
             *               &lt;enumeration value="407541"/>
             *               &lt;enumeration value="405121"/>
             *               &lt;enumeration value="405241"/>
             *               &lt;enumeration value="407781"/>
             *               &lt;enumeration value="405911"/>
             *               &lt;enumeration value="100500"/>
             *               &lt;enumeration value="405111"/>
             *               &lt;enumeration value="407531"/>
             *               &lt;enumeration value="407411"/>
             *               &lt;enumeration value="405471"/>
             *               &lt;enumeration value="407771"/>
             *               &lt;enumeration value="405591"/>
             *               &lt;enumeration value="407651"/>
             *               &lt;enumeration value="405231"/>
             *               &lt;enumeration value="405351"/>
             *               &lt;enumeration value="407891"/>
             *               &lt;enumeration value="407091"/>
             *               &lt;enumeration value="405901"/>
             *               &lt;enumeration value="405101"/>
             *               &lt;enumeration value="407401"/>
             *               &lt;enumeration value="405221"/>
             *               &lt;enumeration value="407641"/>
             *               &lt;enumeration value="407521"/>
             *               &lt;enumeration value="405581"/>
             *               &lt;enumeration value="407881"/>
             *               &lt;enumeration value="407761"/>
             *               &lt;enumeration value="405341"/>
             *               &lt;enumeration value="405461"/>
             *               &lt;enumeration value="407081"/>
             *               &lt;enumeration value="405851"/>
             *               &lt;enumeration value="405971"/>
             *               &lt;enumeration value="405611"/>
             *               &lt;enumeration value="407911"/>
             *               &lt;enumeration value="405731"/>
             *               &lt;enumeration value="405291"/>
             *               &lt;enumeration value="407591"/>
             *               &lt;enumeration value="407471"/>
             *               &lt;enumeration value="405051"/>
             *               &lt;enumeration value="405171"/>
             *               &lt;enumeration value="407111"/>
             *               &lt;enumeration value="407351"/>
             *               &lt;enumeration value="407231"/>
             *               &lt;enumeration value="201000"/>
             *               &lt;enumeration value="101500"/>
             *               &lt;enumeration value="405961"/>
             *               &lt;enumeration value="405721"/>
             *               &lt;enumeration value="405841"/>
             *               &lt;enumeration value="407901"/>
             *               &lt;enumeration value="405601"/>
             *               &lt;enumeration value="407581"/>
             *               &lt;enumeration value="405161"/>
             *               &lt;enumeration value="405281"/>
             *               &lt;enumeration value="401000"/>
             *               &lt;enumeration value="407221"/>
             *               &lt;enumeration value="405041"/>
             *               &lt;enumeration value="407101"/>
             *               &lt;enumeration value="407461"/>
             *               &lt;enumeration value="407341"/>
             *               &lt;enumeration value="405831"/>
             *               &lt;enumeration value="405951"/>
             *               &lt;enumeration value="405711"/>
             *               &lt;enumeration value="407691"/>
             *               &lt;enumeration value="405271"/>
             *               &lt;enumeration value="405391"/>
             *               &lt;enumeration value="405031"/>
             *               &lt;enumeration value="407331"/>
             *               &lt;enumeration value="405151"/>
             *               &lt;enumeration value="407211"/>
             *               &lt;enumeration value="407571"/>
             *               &lt;enumeration value="407451"/>
             *               &lt;enumeration value="407201"/>
             *               &lt;enumeration value="405941"/>
             *               &lt;enumeration value="405701"/>
             *               &lt;enumeration value="405821"/>
             *               &lt;enumeration value="405381"/>
             *               &lt;enumeration value="405141"/>
             *               &lt;enumeration value="407441"/>
             *               &lt;enumeration value="405261"/>
             *               &lt;enumeration value="407321"/>
             *               &lt;enumeration value="407681"/>
             *               &lt;enumeration value="405021"/>
             *               &lt;enumeration value="407561"/>
             *               &lt;enumeration value="301000"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="r" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;minExclusive value="-9999999999.999999"/>
             *               &lt;maxExclusive value="9999999999.999999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="rc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="405651"/>
             *               &lt;enumeration value="407951"/>
             *               &lt;enumeration value="405771"/>
             *               &lt;enumeration value="407831"/>
             *               &lt;enumeration value="405411"/>
             *               &lt;enumeration value="405531"/>
             *               &lt;enumeration value="407711"/>
             *               &lt;enumeration value="407151"/>
             *               &lt;enumeration value="407031"/>
             *               &lt;enumeration value="901000"/>
             *               &lt;enumeration value="407391"/>
             *               &lt;enumeration value="407271"/>
             *               &lt;enumeration value="405891"/>
             *               &lt;enumeration value="405091"/>
             *               &lt;enumeration value="405761"/>
             *               &lt;enumeration value="405881"/>
             *               &lt;enumeration value="407941"/>
             *               &lt;enumeration value="405521"/>
             *               &lt;enumeration value="405641"/>
             *               &lt;enumeration value="405401"/>
             *               &lt;enumeration value="407821"/>
             *               &lt;enumeration value="407701"/>
             *               &lt;enumeration value="407261"/>
             *               &lt;enumeration value="405081"/>
             *               &lt;enumeration value="407141"/>
             *               &lt;enumeration value="407381"/>
             *               &lt;enumeration value="407021"/>
             *               &lt;enumeration value="405871"/>
             *               &lt;enumeration value="405991"/>
             *               &lt;enumeration value="405631"/>
             *               &lt;enumeration value="405751"/>
             *               &lt;enumeration value="405511"/>
             *               &lt;enumeration value="407931"/>
             *               &lt;enumeration value="407811"/>
             *               &lt;enumeration value="405071"/>
             *               &lt;enumeration value="407371"/>
             *               &lt;enumeration value="405191"/>
             *               &lt;enumeration value="407251"/>
             *               &lt;enumeration value="407491"/>
             *               &lt;enumeration value="402000"/>
             *               &lt;enumeration value="407131"/>
             *               &lt;enumeration value="407011"/>
             *               &lt;enumeration value="501000"/>
             *               &lt;enumeration value="405981"/>
             *               &lt;enumeration value="405741"/>
             *               &lt;enumeration value="405861"/>
             *               &lt;enumeration value="405501"/>
             *               &lt;enumeration value="407801"/>
             *               &lt;enumeration value="405621"/>
             *               &lt;enumeration value="407921"/>
             *               &lt;enumeration value="405181"/>
             *               &lt;enumeration value="407481"/>
             *               &lt;enumeration value="407361"/>
             *               &lt;enumeration value="405061"/>
             *               &lt;enumeration value="407001"/>
             *               &lt;enumeration value="407241"/>
             *               &lt;enumeration value="407121"/>
             *               &lt;enumeration value="405211"/>
             *               &lt;enumeration value="407511"/>
             *               &lt;enumeration value="405331"/>
             *               &lt;enumeration value="407751"/>
             *               &lt;enumeration value="407631"/>
             *               &lt;enumeration value="405691"/>
             *               &lt;enumeration value="407991"/>
             *               &lt;enumeration value="407871"/>
             *               &lt;enumeration value="405451"/>
             *               &lt;enumeration value="405571"/>
             *               &lt;enumeration value="407191"/>
             *               &lt;enumeration value="407071"/>
             *               &lt;enumeration value="405321"/>
             *               &lt;enumeration value="407621"/>
             *               &lt;enumeration value="405441"/>
             *               &lt;enumeration value="407501"/>
             *               &lt;enumeration value="407861"/>
             *               &lt;enumeration value="405201"/>
             *               &lt;enumeration value="407741"/>
             *               &lt;enumeration value="101000"/>
             *               &lt;enumeration value="409000"/>
             *               &lt;enumeration value="407061"/>
             *               &lt;enumeration value="407981"/>
             *               &lt;enumeration value="405561"/>
             *               &lt;enumeration value="405681"/>
             *               &lt;enumeration value="407181"/>
             *               &lt;enumeration value="405431"/>
             *               &lt;enumeration value="407731"/>
             *               &lt;enumeration value="405551"/>
             *               &lt;enumeration value="407611"/>
             *               &lt;enumeration value="407971"/>
             *               &lt;enumeration value="405311"/>
             *               &lt;enumeration value="407851"/>
             *               &lt;enumeration value="100000"/>
             *               &lt;enumeration value="407171"/>
             *               &lt;enumeration value="407051"/>
             *               &lt;enumeration value="405671"/>
             *               &lt;enumeration value="405791"/>
             *               &lt;enumeration value="407291"/>
             *               &lt;enumeration value="405541"/>
             *               &lt;enumeration value="407841"/>
             *               &lt;enumeration value="405661"/>
             *               &lt;enumeration value="407721"/>
             *               &lt;enumeration value="405301"/>
             *               &lt;enumeration value="405421"/>
             *               &lt;enumeration value="407961"/>
             *               &lt;enumeration value="407601"/>
             *               &lt;enumeration value="407041"/>
             *               &lt;enumeration value="407281"/>
             *               &lt;enumeration value="407161"/>
             *               &lt;enumeration value="405781"/>
             *               &lt;enumeration value="407311"/>
             *               &lt;enumeration value="102000"/>
             *               &lt;enumeration value="405811"/>
             *               &lt;enumeration value="405931"/>
             *               &lt;enumeration value="405491"/>
             *               &lt;enumeration value="405251"/>
             *               &lt;enumeration value="407551"/>
             *               &lt;enumeration value="405371"/>
             *               &lt;enumeration value="407431"/>
             *               &lt;enumeration value="405011"/>
             *               &lt;enumeration value="407791"/>
             *               &lt;enumeration value="405131"/>
             *               &lt;enumeration value="407671"/>
             *               &lt;enumeration value="405801"/>
             *               &lt;enumeration value="405001"/>
             *               &lt;enumeration value="407421"/>
             *               &lt;enumeration value="407301"/>
             *               &lt;enumeration value="405921"/>
             *               &lt;enumeration value="405361"/>
             *               &lt;enumeration value="407661"/>
             *               &lt;enumeration value="405481"/>
             *               &lt;enumeration value="407541"/>
             *               &lt;enumeration value="405121"/>
             *               &lt;enumeration value="405241"/>
             *               &lt;enumeration value="407781"/>
             *               &lt;enumeration value="405911"/>
             *               &lt;enumeration value="100500"/>
             *               &lt;enumeration value="405111"/>
             *               &lt;enumeration value="407531"/>
             *               &lt;enumeration value="407411"/>
             *               &lt;enumeration value="405471"/>
             *               &lt;enumeration value="407771"/>
             *               &lt;enumeration value="405591"/>
             *               &lt;enumeration value="407651"/>
             *               &lt;enumeration value="405231"/>
             *               &lt;enumeration value="405351"/>
             *               &lt;enumeration value="407891"/>
             *               &lt;enumeration value="407091"/>
             *               &lt;enumeration value="405901"/>
             *               &lt;enumeration value="405101"/>
             *               &lt;enumeration value="407401"/>
             *               &lt;enumeration value="405221"/>
             *               &lt;enumeration value="407641"/>
             *               &lt;enumeration value="407521"/>
             *               &lt;enumeration value="405581"/>
             *               &lt;enumeration value="407881"/>
             *               &lt;enumeration value="407761"/>
             *               &lt;enumeration value="405341"/>
             *               &lt;enumeration value="405461"/>
             *               &lt;enumeration value="407081"/>
             *               &lt;enumeration value="405851"/>
             *               &lt;enumeration value="405971"/>
             *               &lt;enumeration value="405611"/>
             *               &lt;enumeration value="407911"/>
             *               &lt;enumeration value="405731"/>
             *               &lt;enumeration value="405291"/>
             *               &lt;enumeration value="407591"/>
             *               &lt;enumeration value="407471"/>
             *               &lt;enumeration value="405051"/>
             *               &lt;enumeration value="405171"/>
             *               &lt;enumeration value="407111"/>
             *               &lt;enumeration value="407351"/>
             *               &lt;enumeration value="407231"/>
             *               &lt;enumeration value="201000"/>
             *               &lt;enumeration value="101500"/>
             *               &lt;enumeration value="405961"/>
             *               &lt;enumeration value="405721"/>
             *               &lt;enumeration value="405841"/>
             *               &lt;enumeration value="407901"/>
             *               &lt;enumeration value="405601"/>
             *               &lt;enumeration value="407581"/>
             *               &lt;enumeration value="405161"/>
             *               &lt;enumeration value="405281"/>
             *               &lt;enumeration value="401000"/>
             *               &lt;enumeration value="407221"/>
             *               &lt;enumeration value="405041"/>
             *               &lt;enumeration value="407101"/>
             *               &lt;enumeration value="407461"/>
             *               &lt;enumeration value="407341"/>
             *               &lt;enumeration value="405831"/>
             *               &lt;enumeration value="405951"/>
             *               &lt;enumeration value="405711"/>
             *               &lt;enumeration value="407691"/>
             *               &lt;enumeration value="405271"/>
             *               &lt;enumeration value="405391"/>
             *               &lt;enumeration value="405031"/>
             *               &lt;enumeration value="407331"/>
             *               &lt;enumeration value="405151"/>
             *               &lt;enumeration value="407211"/>
             *               &lt;enumeration value="407571"/>
             *               &lt;enumeration value="407451"/>
             *               &lt;enumeration value="407201"/>
             *               &lt;enumeration value="405941"/>
             *               &lt;enumeration value="405701"/>
             *               &lt;enumeration value="405821"/>
             *               &lt;enumeration value="405381"/>
             *               &lt;enumeration value="405141"/>
             *               &lt;enumeration value="407441"/>
             *               &lt;enumeration value="405261"/>
             *               &lt;enumeration value="407321"/>
             *               &lt;enumeration value="407681"/>
             *               &lt;enumeration value="405021"/>
             *               &lt;enumeration value="407561"/>
             *               &lt;enumeration value="301000"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="sts" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="s" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                                   &lt;minExclusive value="-99999"/>
             *                                   &lt;maxExclusive value="99999"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                             &lt;element name="st" minOccurs="0">
             *                               &lt;simpleType>
             *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                   &lt;maxLength value="6"/>
             *                                 &lt;/restriction>
             *                               &lt;/simpleType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                           &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "s",
                "dt",
                "q",
                "ue",
                "fc",
                "r",
                "rc",
                "sts"
            })
            public static class ML {

                protected BigDecimal s;
                @XmlElementRef(name = "dt", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<XMLGregorianCalendar> dt;
                protected BigDecimal q;
                @XmlElementRef(name = "ue", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<String> ue;
                @XmlElementRef(name = "fc", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<String> fc;
                protected BigDecimal r;
                @XmlElementRef(name = "rc", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<String> rc;
                protected CMIMDSeeder.PreVEE.Msrs.ML.Sts sts;
                @XmlAttribute(name = "action")
                protected ListAction action;

                /**
                 * Gets the value of the s property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getS() {
                    return s;
                }

                /**
                 * Sets the value of the s property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setS(BigDecimal value) {
                    this.s = value;
                }

                /**
                 * Gets the value of the dt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *     
                 */
                public JAXBElement<XMLGregorianCalendar> getDt() {
                    return dt;
                }

                /**
                 * Sets the value of the dt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                 *     
                 */
                public void setDt(JAXBElement<XMLGregorianCalendar> value) {
                    this.dt = value;
                }

                /**
                 * Gets the value of the q property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getQ() {
                    return q;
                }

                /**
                 * Sets the value of the q property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setQ(BigDecimal value) {
                    this.q = value;
                }

                /**
                 * Gets the value of the ue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getUe() {
                    return ue;
                }

                /**
                 * Sets the value of the ue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setUe(JAXBElement<String> value) {
                    this.ue = value;
                }

                /**
                 * Gets the value of the fc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getFc() {
                    return fc;
                }

                /**
                 * Sets the value of the fc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setFc(JAXBElement<String> value) {
                    this.fc = value;
                }

                /**
                 * Gets the value of the r property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getR() {
                    return r;
                }

                /**
                 * Sets the value of the r property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setR(BigDecimal value) {
                    this.r = value;
                }

                /**
                 * Gets the value of the rc property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getRc() {
                    return rc;
                }

                /**
                 * Sets the value of the rc property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setRc(JAXBElement<String> value) {
                    this.rc = value;
                }

                /**
                 * Gets the value of the sts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CMIMDSeeder.PreVEE.Msrs.ML.Sts }
                 *     
                 */
                public CMIMDSeeder.PreVEE.Msrs.ML.Sts getSts() {
                    return sts;
                }

                /**
                 * Sets the value of the sts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CMIMDSeeder.PreVEE.Msrs.ML.Sts }
                 *     
                 */
                public void setSts(CMIMDSeeder.PreVEE.Msrs.ML.Sts value) {
                    this.sts = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListAction }
                 *     
                 */
                public ListAction getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListAction }
                 *     
                 */
                public void setAction(ListAction value) {
                    this.action = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="s" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *                         &lt;minExclusive value="-99999"/>
                 *                         &lt;maxExclusive value="99999"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="st" minOccurs="0">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;maxLength value="6"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "stsL"
                })
                public static class Sts {

                    protected List<CMIMDSeeder.PreVEE.Msrs.ML.Sts.StsL> stsL;

                    /**
                     * Gets the value of the stsL property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the stsL property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getStsL().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link CMIMDSeeder.PreVEE.Msrs.ML.Sts.StsL }
                     * 
                     * 
                     */
                    public List<CMIMDSeeder.PreVEE.Msrs.ML.Sts.StsL> getStsL() {
                        if (stsL == null) {
                            stsL = new ArrayList<CMIMDSeeder.PreVEE.Msrs.ML.Sts.StsL>();
                        }
                        return this.stsL;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="s" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                     *               &lt;minExclusive value="-99999"/>
                     *               &lt;maxExclusive value="99999"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="st" minOccurs="0">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;maxLength value="6"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "s",
                        "st"
                    })
                    public static class StsL {

                        protected BigDecimal s;
                        protected String st;
                        @XmlAttribute(name = "action")
                        protected ListAction action;

                        /**
                         * Gets the value of the s property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getS() {
                            return s;
                        }

                        /**
                         * Sets the value of the s property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setS(BigDecimal value) {
                            this.s = value;
                        }

                        /**
                         * Gets the value of the st property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSt() {
                            return st;
                        }

                        /**
                         * Sets the value of the st property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSt(String value) {
                            this.st = value;
                        }

                        /**
                         * Gets the value of the action property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ListAction }
                         *     
                         */
                        public ListAction getAction() {
                            return action;
                        }

                        /**
                         * Sets the value of the action property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ListAction }
                         *     
                         */
                        public void setAction(ListAction value) {
                            this.action = value;
                        }

                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="soCodeList" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="seq" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;minExclusive value="-99999"/>
         *                         &lt;maxExclusive value="99999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="soCode" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;enumeration value="A"/>
         *                         &lt;enumeration value="C"/>
         *                         &lt;enumeration value="D"/>
         *                         &lt;enumeration value="E"/>
         *                         &lt;enumeration value="G"/>
         *                         &lt;enumeration value="N"/>
         *                         &lt;enumeration value="O"/>
         *                         &lt;enumeration value="R"/>
         *                         &lt;enumeration value="S"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "soCodeList"
        })
        public static class SoCodeGroup {

            protected List<CMIMDSeeder.PreVEE.SoCodeGroup.SoCodeList> soCodeList;

            /**
             * Gets the value of the soCodeList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the soCodeList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSoCodeList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CMIMDSeeder.PreVEE.SoCodeGroup.SoCodeList }
             * 
             * 
             */
            public List<CMIMDSeeder.PreVEE.SoCodeGroup.SoCodeList> getSoCodeList() {
                if (soCodeList == null) {
                    soCodeList = new ArrayList<CMIMDSeeder.PreVEE.SoCodeGroup.SoCodeList>();
                }
                return this.soCodeList;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="seq" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;minExclusive value="-99999"/>
             *               &lt;maxExclusive value="99999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="soCode" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;enumeration value="A"/>
             *               &lt;enumeration value="C"/>
             *               &lt;enumeration value="D"/>
             *               &lt;enumeration value="E"/>
             *               &lt;enumeration value="G"/>
             *               &lt;enumeration value="N"/>
             *               &lt;enumeration value="O"/>
             *               &lt;enumeration value="R"/>
             *               &lt;enumeration value="S"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "seq",
                "soCode"
            })
            public static class SoCodeList {

                protected BigDecimal seq;
                @XmlElementRef(name = "soCode", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                protected JAXBElement<String> soCode;
                @XmlAttribute(name = "action")
                protected ListAction action;

                /**
                 * Gets the value of the seq property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getSeq() {
                    return seq;
                }

                /**
                 * Sets the value of the seq property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setSeq(BigDecimal value) {
                    this.seq = value;
                }

                /**
                 * Gets the value of the soCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getSoCode() {
                    return soCode;
                }

                /**
                 * Sets the value of the soCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setSoCode(JAXBElement<String> value) {
                    this.soCode = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListAction }
                 *     
                 */
                public ListAction getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListAction }
                 *     
                 */
                public void setAction(ListAction value) {
                    this.action = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="stsL" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="s" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                         &lt;minExclusive value="-99999"/>
         *                         &lt;maxExclusive value="99999"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="st" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "stsL"
        })
        public static class Sts {

            protected List<CMIMDSeeder.PreVEE.Sts.StsL> stsL;

            /**
             * Gets the value of the stsL property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the stsL property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStsL().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CMIMDSeeder.PreVEE.Sts.StsL }
             * 
             * 
             */
            public List<CMIMDSeeder.PreVEE.Sts.StsL> getStsL() {
                if (stsL == null) {
                    stsL = new ArrayList<CMIMDSeeder.PreVEE.Sts.StsL>();
                }
                return this.stsL;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="s" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *               &lt;minExclusive value="-99999"/>
             *               &lt;maxExclusive value="99999"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="st" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "s",
                "st"
            })
            public static class StsL {

                protected BigDecimal s;
                protected String st;
                @XmlAttribute(name = "action")
                protected ListAction action;

                /**
                 * Gets the value of the s property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getS() {
                    return s;
                }

                /**
                 * Sets the value of the s property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setS(BigDecimal value) {
                    this.s = value;
                }

                /**
                 * Gets the value of the st property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSt() {
                    return st;
                }

                /**
                 * Sets the value of the st property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSt(String value) {
                    this.st = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListAction }
                 *     
                 */
                public ListAction getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListAction }
                 *     
                 */
                public void setAction(ListAction value) {
                    this.action = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="isShiftedStartEnd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isShiftedIntervals" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isShiftCorrectedStartEnd" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isShiftCorrectedIntervals" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isTimeZoneConverted" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isErrorEncountered" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="isEndDateTimeDerived" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="servicePointId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="installationConstant" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *               &lt;minExclusive value="-999999.999999"/>
     *               &lt;maxExclusive value="999999.999999"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="deviceId" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="12"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="allowNonZeroIntervalsForEstimate" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="disableReEstimate" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="reEstimationActivity" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="disableSubtractiveConsumptionCalculation" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NO"/>
     *               &lt;enumeration value="D1YS"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="currentErrorMessage" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="400"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="intervalScalarIndicator" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1IN"/>
     *               &lt;enumeration value="D1SC"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="imdImportDateTimeFormat" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="D1NT"/>
     *               &lt;enumeration value="D1WT"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="multiplierApplied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="logs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="logsList" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="logsEntry" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sequence" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;minExclusive value="-999"/>
     *                                             &lt;maxExclusive value="999"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="mo" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="12"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="pkValue1" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="pkValue2" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="pkValue3" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="pkValue4" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="pkValue5" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="logEntryType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;enumeration value="D1TD"/>
     *                                             &lt;enumeration value="F1CR"/>
     *                                             &lt;enumeration value="F1ER"/>
     *                                             &lt;enumeration value="F1EX"/>
     *                                             &lt;enumeration value="F1ST"/>
     *                                             &lt;enumeration value="F1SY"/>
     *                                             &lt;enumeration value="F1TD"/>
     *                                             &lt;enumeration value="F1US"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="logDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *                                       &lt;element name="boStatus" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="12"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="description" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="60"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="user" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="8"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="logMessage" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="4000"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="characteristicType" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="20"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="characteristicValue" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="16"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="adhocValue" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="254"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="fkValue1" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="fkValue2" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="fkValue3" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="fkValue4" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="fkValue5" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="50"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageCategory" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;minExclusive value="-99999"/>
     *                                             &lt;maxExclusive value="99999"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageNumber" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                                             &lt;minExclusive value="-99999"/>
     *                                             &lt;maxExclusive value="99999"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm1" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm2" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm3" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm4" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm5" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm6" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm7" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm8" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                       &lt;element name="messageParm9" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                             &lt;maxLength value="30"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="deviceEventTypes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="deviceEventTypesList" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="deviceEventType" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;maxLength value="30"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "isShiftedStartEnd",
        "isShiftedIntervals",
        "isShiftCorrectedStartEnd",
        "isShiftCorrectedIntervals",
        "isTimeZoneConverted",
        "isErrorEncountered",
        "isEndDateTimeDerived",
        "servicePointId",
        "installationConstant",
        "deviceId",
        "allowNonZeroIntervalsForEstimate",
        "disableReEstimate",
        "reEstimationActivity",
        "disableSubtractiveConsumptionCalculation",
        "currentErrorMessage",
        "intervalScalarIndicator",
        "imdImportDateTimeFormat",
        "multiplierApplied",
        "logs",
        "deviceEventTypes"
    })
    public static class ProcessData {

        @XmlElementRef(name = "isShiftedStartEnd", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isShiftedStartEnd;
        @XmlElementRef(name = "isShiftedIntervals", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isShiftedIntervals;
        @XmlElementRef(name = "isShiftCorrectedStartEnd", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isShiftCorrectedStartEnd;
        @XmlElementRef(name = "isShiftCorrectedIntervals", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isShiftCorrectedIntervals;
        @XmlElementRef(name = "isTimeZoneConverted", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isTimeZoneConverted;
        @XmlElementRef(name = "isErrorEncountered", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isErrorEncountered;
        @XmlElementRef(name = "isEndDateTimeDerived", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> isEndDateTimeDerived;
        protected String servicePointId;
        protected BigDecimal installationConstant;
        protected String deviceId;
        @XmlElementRef(name = "allowNonZeroIntervalsForEstimate", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> allowNonZeroIntervalsForEstimate;
        @XmlElementRef(name = "disableReEstimate", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> disableReEstimate;
        protected String reEstimationActivity;
        @XmlElementRef(name = "disableSubtractiveConsumptionCalculation", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> disableSubtractiveConsumptionCalculation;
        protected String currentErrorMessage;
        @XmlElementRef(name = "intervalScalarIndicator", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> intervalScalarIndicator;
        @XmlElementRef(name = "imdImportDateTimeFormat", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<String> imdImportDateTimeFormat;
        @XmlElementRef(name = "multiplierApplied", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> multiplierApplied;
        protected CMIMDSeeder.ProcessData.Logs logs;
        protected CMIMDSeeder.ProcessData.DeviceEventTypes deviceEventTypes;

        /**
         * Gets the value of the isShiftedStartEnd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsShiftedStartEnd() {
            return isShiftedStartEnd;
        }

        /**
         * Sets the value of the isShiftedStartEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsShiftedStartEnd(JAXBElement<String> value) {
            this.isShiftedStartEnd = value;
        }

        /**
         * Gets the value of the isShiftedIntervals property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsShiftedIntervals() {
            return isShiftedIntervals;
        }

        /**
         * Sets the value of the isShiftedIntervals property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsShiftedIntervals(JAXBElement<String> value) {
            this.isShiftedIntervals = value;
        }

        /**
         * Gets the value of the isShiftCorrectedStartEnd property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsShiftCorrectedStartEnd() {
            return isShiftCorrectedStartEnd;
        }

        /**
         * Sets the value of the isShiftCorrectedStartEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsShiftCorrectedStartEnd(JAXBElement<String> value) {
            this.isShiftCorrectedStartEnd = value;
        }

        /**
         * Gets the value of the isShiftCorrectedIntervals property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsShiftCorrectedIntervals() {
            return isShiftCorrectedIntervals;
        }

        /**
         * Sets the value of the isShiftCorrectedIntervals property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsShiftCorrectedIntervals(JAXBElement<String> value) {
            this.isShiftCorrectedIntervals = value;
        }

        /**
         * Gets the value of the isTimeZoneConverted property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsTimeZoneConverted() {
            return isTimeZoneConverted;
        }

        /**
         * Sets the value of the isTimeZoneConverted property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsTimeZoneConverted(JAXBElement<String> value) {
            this.isTimeZoneConverted = value;
        }

        /**
         * Gets the value of the isErrorEncountered property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsErrorEncountered() {
            return isErrorEncountered;
        }

        /**
         * Sets the value of the isErrorEncountered property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsErrorEncountered(JAXBElement<String> value) {
            this.isErrorEncountered = value;
        }

        /**
         * Gets the value of the isEndDateTimeDerived property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIsEndDateTimeDerived() {
            return isEndDateTimeDerived;
        }

        /**
         * Sets the value of the isEndDateTimeDerived property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIsEndDateTimeDerived(JAXBElement<String> value) {
            this.isEndDateTimeDerived = value;
        }

        /**
         * Gets the value of the servicePointId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServicePointId() {
            return servicePointId;
        }

        /**
         * Sets the value of the servicePointId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServicePointId(String value) {
            this.servicePointId = value;
        }

        /**
         * Gets the value of the installationConstant property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getInstallationConstant() {
            return installationConstant;
        }

        /**
         * Sets the value of the installationConstant property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setInstallationConstant(BigDecimal value) {
            this.installationConstant = value;
        }

        /**
         * Gets the value of the deviceId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceId() {
            return deviceId;
        }

        /**
         * Sets the value of the deviceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceId(String value) {
            this.deviceId = value;
        }

        /**
         * Gets the value of the allowNonZeroIntervalsForEstimate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAllowNonZeroIntervalsForEstimate() {
            return allowNonZeroIntervalsForEstimate;
        }

        /**
         * Sets the value of the allowNonZeroIntervalsForEstimate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAllowNonZeroIntervalsForEstimate(JAXBElement<String> value) {
            this.allowNonZeroIntervalsForEstimate = value;
        }

        /**
         * Gets the value of the disableReEstimate property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDisableReEstimate() {
            return disableReEstimate;
        }

        /**
         * Sets the value of the disableReEstimate property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDisableReEstimate(JAXBElement<String> value) {
            this.disableReEstimate = value;
        }

        /**
         * Gets the value of the reEstimationActivity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReEstimationActivity() {
            return reEstimationActivity;
        }

        /**
         * Sets the value of the reEstimationActivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReEstimationActivity(String value) {
            this.reEstimationActivity = value;
        }

        /**
         * Gets the value of the disableSubtractiveConsumptionCalculation property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDisableSubtractiveConsumptionCalculation() {
            return disableSubtractiveConsumptionCalculation;
        }

        /**
         * Sets the value of the disableSubtractiveConsumptionCalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDisableSubtractiveConsumptionCalculation(JAXBElement<String> value) {
            this.disableSubtractiveConsumptionCalculation = value;
        }

        /**
         * Gets the value of the currentErrorMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentErrorMessage() {
            return currentErrorMessage;
        }

        /**
         * Sets the value of the currentErrorMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentErrorMessage(String value) {
            this.currentErrorMessage = value;
        }

        /**
         * Gets the value of the intervalScalarIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIntervalScalarIndicator() {
            return intervalScalarIndicator;
        }

        /**
         * Sets the value of the intervalScalarIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIntervalScalarIndicator(JAXBElement<String> value) {
            this.intervalScalarIndicator = value;
        }

        /**
         * Gets the value of the imdImportDateTimeFormat property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getImdImportDateTimeFormat() {
            return imdImportDateTimeFormat;
        }

        /**
         * Sets the value of the imdImportDateTimeFormat property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setImdImportDateTimeFormat(JAXBElement<String> value) {
            this.imdImportDateTimeFormat = value;
        }

        /**
         * Gets the value of the multiplierApplied property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public JAXBElement<Boolean> getMultiplierApplied() {
            return multiplierApplied;
        }

        /**
         * Sets the value of the multiplierApplied property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *     
         */
        public void setMultiplierApplied(JAXBElement<Boolean> value) {
            this.multiplierApplied = value;
        }

        /**
         * Gets the value of the logs property.
         * 
         * @return
         *     possible object is
         *     {@link CMIMDSeeder.ProcessData.Logs }
         *     
         */
        public CMIMDSeeder.ProcessData.Logs getLogs() {
            return logs;
        }

        /**
         * Sets the value of the logs property.
         * 
         * @param value
         *     allowed object is
         *     {@link CMIMDSeeder.ProcessData.Logs }
         *     
         */
        public void setLogs(CMIMDSeeder.ProcessData.Logs value) {
            this.logs = value;
        }

        /**
         * Gets the value of the deviceEventTypes property.
         * 
         * @return
         *     possible object is
         *     {@link CMIMDSeeder.ProcessData.DeviceEventTypes }
         *     
         */
        public CMIMDSeeder.ProcessData.DeviceEventTypes getDeviceEventTypes() {
            return deviceEventTypes;
        }

        /**
         * Sets the value of the deviceEventTypes property.
         * 
         * @param value
         *     allowed object is
         *     {@link CMIMDSeeder.ProcessData.DeviceEventTypes }
         *     
         */
        public void setDeviceEventTypes(CMIMDSeeder.ProcessData.DeviceEventTypes value) {
            this.deviceEventTypes = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="deviceEventTypesList" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="deviceEventType" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "deviceEventTypesList"
        })
        public static class DeviceEventTypes {

            protected List<CMIMDSeeder.ProcessData.DeviceEventTypes.DeviceEventTypesList> deviceEventTypesList;

            /**
             * Gets the value of the deviceEventTypesList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the deviceEventTypesList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDeviceEventTypesList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CMIMDSeeder.ProcessData.DeviceEventTypes.DeviceEventTypesList }
             * 
             * 
             */
            public List<CMIMDSeeder.ProcessData.DeviceEventTypes.DeviceEventTypesList> getDeviceEventTypesList() {
                if (deviceEventTypesList == null) {
                    deviceEventTypesList = new ArrayList<CMIMDSeeder.ProcessData.DeviceEventTypes.DeviceEventTypesList>();
                }
                return this.deviceEventTypesList;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="deviceEventType" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "deviceEventType"
            })
            public static class DeviceEventTypesList {

                protected String deviceEventType;
                @XmlAttribute(name = "action")
                protected ListAction action;

                /**
                 * Gets the value of the deviceEventType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDeviceEventType() {
                    return deviceEventType;
                }

                /**
                 * Sets the value of the deviceEventType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDeviceEventType(String value) {
                    this.deviceEventType = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListAction }
                 *     
                 */
                public ListAction getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListAction }
                 *     
                 */
                public void setAction(ListAction value) {
                    this.action = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="logsList" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="logsEntry" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="sequence" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;minExclusive value="-999"/>
         *                                   &lt;maxExclusive value="999"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="mo" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="12"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="pkValue1" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="pkValue2" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="pkValue3" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="pkValue4" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="pkValue5" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="logEntryType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;enumeration value="D1TD"/>
         *                                   &lt;enumeration value="F1CR"/>
         *                                   &lt;enumeration value="F1ER"/>
         *                                   &lt;enumeration value="F1EX"/>
         *                                   &lt;enumeration value="F1ST"/>
         *                                   &lt;enumeration value="F1SY"/>
         *                                   &lt;enumeration value="F1TD"/>
         *                                   &lt;enumeration value="F1US"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="logDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
         *                             &lt;element name="boStatus" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="12"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="description" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="user" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="8"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="logMessage" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="4000"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="characteristicType" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="characteristicValue" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="16"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="adhocValue" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="254"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="fkValue1" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="fkValue2" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="fkValue3" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="fkValue4" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="fkValue5" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="50"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageCategory" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;minExclusive value="-99999"/>
         *                                   &lt;maxExclusive value="99999"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageNumber" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *                                   &lt;minExclusive value="-99999"/>
         *                                   &lt;maxExclusive value="99999"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm1" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm2" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm3" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm4" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm5" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm6" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm7" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm8" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="messageParm9" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;maxLength value="30"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "logsList"
        })
        public static class Logs {

            protected List<CMIMDSeeder.ProcessData.Logs.LogsList> logsList;

            /**
             * Gets the value of the logsList property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the logsList property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLogsList().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CMIMDSeeder.ProcessData.Logs.LogsList }
             * 
             * 
             */
            public List<CMIMDSeeder.ProcessData.Logs.LogsList> getLogsList() {
                if (logsList == null) {
                    logsList = new ArrayList<CMIMDSeeder.ProcessData.Logs.LogsList>();
                }
                return this.logsList;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="logsEntry" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="sequence" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;minExclusive value="-999"/>
             *                         &lt;maxExclusive value="999"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="mo" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="12"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="pkValue1" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="pkValue2" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="pkValue3" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="pkValue4" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="pkValue5" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="logEntryType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;enumeration value="D1TD"/>
             *                         &lt;enumeration value="F1CR"/>
             *                         &lt;enumeration value="F1ER"/>
             *                         &lt;enumeration value="F1EX"/>
             *                         &lt;enumeration value="F1ST"/>
             *                         &lt;enumeration value="F1SY"/>
             *                         &lt;enumeration value="F1TD"/>
             *                         &lt;enumeration value="F1US"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="logDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
             *                   &lt;element name="boStatus" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="12"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="description" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="user" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="8"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="logMessage" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="4000"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="characteristicType" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="characteristicValue" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="16"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="adhocValue" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="254"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="fkValue1" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="fkValue2" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="fkValue3" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="fkValue4" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="fkValue5" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="50"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageCategory" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;minExclusive value="-99999"/>
             *                         &lt;maxExclusive value="99999"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageNumber" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
             *                         &lt;minExclusive value="-99999"/>
             *                         &lt;maxExclusive value="99999"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm1" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm2" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm3" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm4" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm5" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm6" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm7" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm8" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="messageParm9" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                         &lt;maxLength value="30"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="action" type="{http://ouaf.oracle.com/}listAction" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "logsEntry"
            })
            public static class LogsList {

                protected CMIMDSeeder.ProcessData.Logs.LogsList.LogsEntry logsEntry;
                @XmlAttribute(name = "action")
                protected ListAction action;

                /**
                 * Gets the value of the logsEntry property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CMIMDSeeder.ProcessData.Logs.LogsList.LogsEntry }
                 *     
                 */
                public CMIMDSeeder.ProcessData.Logs.LogsList.LogsEntry getLogsEntry() {
                    return logsEntry;
                }

                /**
                 * Sets the value of the logsEntry property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CMIMDSeeder.ProcessData.Logs.LogsList.LogsEntry }
                 *     
                 */
                public void setLogsEntry(CMIMDSeeder.ProcessData.Logs.LogsList.LogsEntry value) {
                    this.logsEntry = value;
                }

                /**
                 * Gets the value of the action property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ListAction }
                 *     
                 */
                public ListAction getAction() {
                    return action;
                }

                /**
                 * Sets the value of the action property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ListAction }
                 *     
                 */
                public void setAction(ListAction value) {
                    this.action = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="sequence" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;minExclusive value="-999"/>
                 *               &lt;maxExclusive value="999"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="mo" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="12"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pkValue1" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pkValue2" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pkValue3" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pkValue4" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="pkValue5" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="logEntryType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;enumeration value="D1TD"/>
                 *               &lt;enumeration value="F1CR"/>
                 *               &lt;enumeration value="F1ER"/>
                 *               &lt;enumeration value="F1EX"/>
                 *               &lt;enumeration value="F1ST"/>
                 *               &lt;enumeration value="F1SY"/>
                 *               &lt;enumeration value="F1TD"/>
                 *               &lt;enumeration value="F1US"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="logDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
                 *         &lt;element name="boStatus" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="12"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="description" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="user" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="8"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="logMessage" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="4000"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="characteristicType" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="characteristicValue" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="16"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="adhocValue" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="254"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="fkValue1" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="fkValue2" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="fkValue3" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="fkValue4" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="fkValue5" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="50"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageCategory" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;minExclusive value="-99999"/>
                 *               &lt;maxExclusive value="99999"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageNumber" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
                 *               &lt;minExclusive value="-99999"/>
                 *               &lt;maxExclusive value="99999"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm1" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm2" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm3" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm4" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm5" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm6" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm7" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm8" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="messageParm9" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;maxLength value="30"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "sequence",
                    "mo",
                    "pkValue1",
                    "pkValue2",
                    "pkValue3",
                    "pkValue4",
                    "pkValue5",
                    "logEntryType",
                    "logDateTime",
                    "boStatus",
                    "description",
                    "user",
                    "logMessage",
                    "characteristicType",
                    "characteristicValue",
                    "adhocValue",
                    "fkValue1",
                    "fkValue2",
                    "fkValue3",
                    "fkValue4",
                    "fkValue5",
                    "messageCategory",
                    "messageNumber",
                    "messageParm1",
                    "messageParm2",
                    "messageParm3",
                    "messageParm4",
                    "messageParm5",
                    "messageParm6",
                    "messageParm7",
                    "messageParm8",
                    "messageParm9"
                })
                public static class LogsEntry {

                    protected BigDecimal sequence;
                    protected String mo;
                    protected String pkValue1;
                    protected String pkValue2;
                    protected String pkValue3;
                    protected String pkValue4;
                    protected String pkValue5;
                    @XmlElementRef(name = "logEntryType", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> logEntryType;
                    @XmlElementRef(name = "logDateTime", namespace = "http://oracle.com/CM-IMDSeeder.xsd", type = JAXBElement.class, required = false)
                    protected JAXBElement<XMLGregorianCalendar> logDateTime;
                    protected String boStatus;
                    protected String description;
                    protected String user;
                    protected String logMessage;
                    protected String characteristicType;
                    protected String characteristicValue;
                    protected String adhocValue;
                    protected String fkValue1;
                    protected String fkValue2;
                    protected String fkValue3;
                    protected String fkValue4;
                    protected String fkValue5;
                    protected BigDecimal messageCategory;
                    protected BigDecimal messageNumber;
                    protected String messageParm1;
                    protected String messageParm2;
                    protected String messageParm3;
                    protected String messageParm4;
                    protected String messageParm5;
                    protected String messageParm6;
                    protected String messageParm7;
                    protected String messageParm8;
                    protected String messageParm9;

                    /**
                     * Gets the value of the sequence property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getSequence() {
                        return sequence;
                    }

                    /**
                     * Sets the value of the sequence property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setSequence(BigDecimal value) {
                        this.sequence = value;
                    }

                    /**
                     * Gets the value of the mo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMo() {
                        return mo;
                    }

                    /**
                     * Sets the value of the mo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMo(String value) {
                        this.mo = value;
                    }

                    /**
                     * Gets the value of the pkValue1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPkValue1() {
                        return pkValue1;
                    }

                    /**
                     * Sets the value of the pkValue1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPkValue1(String value) {
                        this.pkValue1 = value;
                    }

                    /**
                     * Gets the value of the pkValue2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPkValue2() {
                        return pkValue2;
                    }

                    /**
                     * Sets the value of the pkValue2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPkValue2(String value) {
                        this.pkValue2 = value;
                    }

                    /**
                     * Gets the value of the pkValue3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPkValue3() {
                        return pkValue3;
                    }

                    /**
                     * Sets the value of the pkValue3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPkValue3(String value) {
                        this.pkValue3 = value;
                    }

                    /**
                     * Gets the value of the pkValue4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPkValue4() {
                        return pkValue4;
                    }

                    /**
                     * Sets the value of the pkValue4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPkValue4(String value) {
                        this.pkValue4 = value;
                    }

                    /**
                     * Gets the value of the pkValue5 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPkValue5() {
                        return pkValue5;
                    }

                    /**
                     * Sets the value of the pkValue5 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPkValue5(String value) {
                        this.pkValue5 = value;
                    }

                    /**
                     * Gets the value of the logEntryType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getLogEntryType() {
                        return logEntryType;
                    }

                    /**
                     * Sets the value of the logEntryType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setLogEntryType(JAXBElement<String> value) {
                        this.logEntryType = value;
                    }

                    /**
                     * Gets the value of the logDateTime property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public JAXBElement<XMLGregorianCalendar> getLogDateTime() {
                        return logDateTime;
                    }

                    /**
                     * Sets the value of the logDateTime property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
                     *     
                     */
                    public void setLogDateTime(JAXBElement<XMLGregorianCalendar> value) {
                        this.logDateTime = value;
                    }

                    /**
                     * Gets the value of the boStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBoStatus() {
                        return boStatus;
                    }

                    /**
                     * Sets the value of the boStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBoStatus(String value) {
                        this.boStatus = value;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * Sets the value of the description property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                    /**
                     * Gets the value of the user property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUser() {
                        return user;
                    }

                    /**
                     * Sets the value of the user property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUser(String value) {
                        this.user = value;
                    }

                    /**
                     * Gets the value of the logMessage property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLogMessage() {
                        return logMessage;
                    }

                    /**
                     * Sets the value of the logMessage property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLogMessage(String value) {
                        this.logMessage = value;
                    }

                    /**
                     * Gets the value of the characteristicType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCharacteristicType() {
                        return characteristicType;
                    }

                    /**
                     * Sets the value of the characteristicType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCharacteristicType(String value) {
                        this.characteristicType = value;
                    }

                    /**
                     * Gets the value of the characteristicValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCharacteristicValue() {
                        return characteristicValue;
                    }

                    /**
                     * Sets the value of the characteristicValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCharacteristicValue(String value) {
                        this.characteristicValue = value;
                    }

                    /**
                     * Gets the value of the adhocValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAdhocValue() {
                        return adhocValue;
                    }

                    /**
                     * Sets the value of the adhocValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAdhocValue(String value) {
                        this.adhocValue = value;
                    }

                    /**
                     * Gets the value of the fkValue1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFkValue1() {
                        return fkValue1;
                    }

                    /**
                     * Sets the value of the fkValue1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFkValue1(String value) {
                        this.fkValue1 = value;
                    }

                    /**
                     * Gets the value of the fkValue2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFkValue2() {
                        return fkValue2;
                    }

                    /**
                     * Sets the value of the fkValue2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFkValue2(String value) {
                        this.fkValue2 = value;
                    }

                    /**
                     * Gets the value of the fkValue3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFkValue3() {
                        return fkValue3;
                    }

                    /**
                     * Sets the value of the fkValue3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFkValue3(String value) {
                        this.fkValue3 = value;
                    }

                    /**
                     * Gets the value of the fkValue4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFkValue4() {
                        return fkValue4;
                    }

                    /**
                     * Sets the value of the fkValue4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFkValue4(String value) {
                        this.fkValue4 = value;
                    }

                    /**
                     * Gets the value of the fkValue5 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFkValue5() {
                        return fkValue5;
                    }

                    /**
                     * Sets the value of the fkValue5 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFkValue5(String value) {
                        this.fkValue5 = value;
                    }

                    /**
                     * Gets the value of the messageCategory property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMessageCategory() {
                        return messageCategory;
                    }

                    /**
                     * Sets the value of the messageCategory property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMessageCategory(BigDecimal value) {
                        this.messageCategory = value;
                    }

                    /**
                     * Gets the value of the messageNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getMessageNumber() {
                        return messageNumber;
                    }

                    /**
                     * Sets the value of the messageNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setMessageNumber(BigDecimal value) {
                        this.messageNumber = value;
                    }

                    /**
                     * Gets the value of the messageParm1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm1() {
                        return messageParm1;
                    }

                    /**
                     * Sets the value of the messageParm1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm1(String value) {
                        this.messageParm1 = value;
                    }

                    /**
                     * Gets the value of the messageParm2 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm2() {
                        return messageParm2;
                    }

                    /**
                     * Sets the value of the messageParm2 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm2(String value) {
                        this.messageParm2 = value;
                    }

                    /**
                     * Gets the value of the messageParm3 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm3() {
                        return messageParm3;
                    }

                    /**
                     * Sets the value of the messageParm3 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm3(String value) {
                        this.messageParm3 = value;
                    }

                    /**
                     * Gets the value of the messageParm4 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm4() {
                        return messageParm4;
                    }

                    /**
                     * Sets the value of the messageParm4 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm4(String value) {
                        this.messageParm4 = value;
                    }

                    /**
                     * Gets the value of the messageParm5 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm5() {
                        return messageParm5;
                    }

                    /**
                     * Sets the value of the messageParm5 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm5(String value) {
                        this.messageParm5 = value;
                    }

                    /**
                     * Gets the value of the messageParm6 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm6() {
                        return messageParm6;
                    }

                    /**
                     * Sets the value of the messageParm6 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm6(String value) {
                        this.messageParm6 = value;
                    }

                    /**
                     * Gets the value of the messageParm7 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm7() {
                        return messageParm7;
                    }

                    /**
                     * Sets the value of the messageParm7 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm7(String value) {
                        this.messageParm7 = value;
                    }

                    /**
                     * Gets the value of the messageParm8 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm8() {
                        return messageParm8;
                    }

                    /**
                     * Sets the value of the messageParm8 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm8(String value) {
                        this.messageParm8 = value;
                    }

                    /**
                     * Gets the value of the messageParm9 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMessageParm9() {
                        return messageParm9;
                    }

                    /**
                     * Sets the value of the messageParm9 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMessageParm9(String value) {
                        this.messageParm9 = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SyncIMDOtherInfo {


    }

}
