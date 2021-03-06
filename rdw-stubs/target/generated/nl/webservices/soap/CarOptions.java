
package nl.webservices.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="car_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serie_jaar_van" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="serie_jaar_tot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model_maand_van" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model_jaar_van" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model_maand_tot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="model_jaar_tot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="belasting_min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="belasting_max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="algemene_garantie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="algemene_garantie_km" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrosserie_garantie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deuren" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="carrosserietype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aantal_versnellingen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="soort_schakeling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aandrijving" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brandstoftype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aantal_cilinders" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bouwwijze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kleppen_per_cilinder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cilinderinhoud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="boring" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="slag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compressieverhouding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vermogen_kw" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vermogen_pk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vermogen_tpm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koppel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koppel_tpm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="katalysator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="brandstofsysteem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="klepbediening" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="turbo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wielophanging_voor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wielophanging_achter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vering_voor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vering_achter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stabilisator_voor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stabilisator_achter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remmen_voor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remmen_voor_mm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remmen_achter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remmen_achter_mm" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cw_waarde" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lengte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="breedte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hoogte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wielbasis" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spoorbreedte_voor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spoorbreedte_achter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="draaicirkel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bandenmaat_voor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bandenmaat_achter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="massa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max_toelaatbare_massa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max_aanhanger_geremd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max_aanhanger_ongeremd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max_kogeldruk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="max_dakbelasting" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koffer_min" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="koffer_max" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tankinhoud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="topsnelheid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="acceleratie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verbruik_binnen_bebouwde_kom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verbruik_buiten_bebouwde_kom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verbruik_gecombineerd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="co2_uitstoot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="verbruik_gemiddeld" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abs" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="remkrachtverdeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="brakeassist" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="tractiecontrole" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="sperdifferentieel" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="stabiliteitsregeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="regelbare_schokdemping" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="niveauregeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airbag_bestuurder" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airbag_passagier" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airbag_opzijvoor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airbag_opzijachter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airbag_hoofdvoor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airbag_hoofdachter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="gordelspanners" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verstelbare_gordelhoogte" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="startonderbreker" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="inbraakalarm" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="centrale_deurvergrendeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="afstandbediening_deurvergrendeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="automatische_vergrendeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="keyless_entry" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="elektrische_ramen_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="elektrische_ramen_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="stuurbekrachtiging" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="stuurschakeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="cruise_control" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="radar_cruise_control" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="airconditioning" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="klimaatregeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="gescheiden_temperatuurregeling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="pollenfilter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="parkeersensor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="hoofdsteunen_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="hoofdsteunen_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verstelbare_hoofdsteunen_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="derde_hoofdsteun_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="derde_driepuntsgordel_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verstelbare_lendensteun_bestuurder" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verstelbare_lendensteun_passagier" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="hoogteverstelling_bestuurder" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="hoogteverstelling_passagier" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="elektrische_stoelverstelling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="geheugen_stoelverstelling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verwarmde_zitplaatsen_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verwarmde_zitplaatsen_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="sportstoelen" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="bekledingstof_leer" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="lerenbekleding" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="hoogteverstelling_stuur" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="diepteverstelling_stuur" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="elektrische_stuurverstelling" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="leer_bekleed_stuur" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="middenarmsteun_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="middenarmsteun_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="neerklapbare_achterbank" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="in_delen_neerklapbaar_achterbank" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="opbergvak_linkerportier" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="bekerhouder_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="bekerhouder_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="zonnescherm_achterruit" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="dagteller" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="toerenteller" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="temperatuurmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="oliepeilmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="oliedrukmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="olietemperatuurmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="voltmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verbruiksmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="turbodrukmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="buitentemperatuurmeter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="klokje" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="boardcomputer" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="luidsprekers" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="stereoinstallatie" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="cdspeler" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="cdwisselaar" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="audiostuurbediening" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="bandenspanningssensor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="navigatiesysteem" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="televisie" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="telefoonvoorbereiding" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="telefoon" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="intervalruitenwisser" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="regelbare_interval" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="regensensor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="ruitenwisser_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="achterruitverwarming" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="voorruitverwarming" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verwarmde_ruitensproeiers" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="gelaagde_voorruit" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="getintglas" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="schuifdak" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="elektrisch_schuifdak" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="beschermstrips_opzij" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="bumpers_meegespoten" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="metallic_lak" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="lichtmetalen_velgen" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="rechter_buitenspiegel" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="binnenuit_verstelbare_buitenspiegel" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="elektrische_spiegels" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verwarmde_spiegels" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="inklapbare_spiegels" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="meegespoten_spiegels" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="dodehoekspiegel_bestuurder" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="dimmende_binnenspiegel" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="dimmende_buitenspiegel" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="dakrails" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="binnenuit_te_openen_tankklep" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="binnenuit_te_openen_bagageklep" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="op_afstand_te_openen_bagageklep" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="halogeen_koplampen" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="xenon_koplampen" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verstelbare_koplampen" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="koplampsproeiers" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="automatisch_inschakelende_koplampen" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verstralers" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="mistlampen_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="mistlampen_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="zoemer_vergeten_verlichting" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verlichte_bagageruimte" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verlichte_motorruimte" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verlicht_dashboardkastje" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="regelbare_dashboardverlichting" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="leeslampje_voor" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="leeslampje_achter" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="verlichte_makeupspiegel" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="vertraging_interieurverlichting" type="{http://www.webservices.nl/soap/}CarOption"/>
 *         &lt;element name="portierverlichting" type="{http://www.webservices.nl/soap/}CarOption"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarOptions", propOrder = {

})
public class CarOptions {

    @XmlElement(name = "car_id", required = true)
    protected String carId;
    @XmlElement(required = true)
    protected String merk;
    @XmlElement(required = true)
    protected String serie;
    @XmlElement(name = "serie_jaar_van")
    protected int serieJaarVan;
    @XmlElement(name = "serie_jaar_tot")
    protected int serieJaarTot;
    @XmlElement(required = true)
    protected String model;
    @XmlElement(name = "model_maand_van")
    protected int modelMaandVan;
    @XmlElement(name = "model_jaar_van")
    protected int modelJaarVan;
    @XmlElement(name = "model_maand_tot")
    protected int modelMaandTot;
    @XmlElement(name = "model_jaar_tot")
    protected int modelJaarTot;
    @XmlElement(name = "belasting_min", required = true)
    protected String belastingMin;
    @XmlElement(name = "belasting_max", required = true)
    protected String belastingMax;
    @XmlElement(name = "algemene_garantie", required = true)
    protected String algemeneGarantie;
    @XmlElement(name = "algemene_garantie_km", required = true)
    protected String algemeneGarantieKm;
    @XmlElement(name = "carrosserie_garantie", required = true)
    protected String carrosserieGarantie;
    @XmlElement(required = true)
    protected String deuren;
    @XmlElement(required = true)
    protected String carrosserietype;
    @XmlElement(name = "aantal_versnellingen", required = true)
    protected String aantalVersnellingen;
    @XmlElement(name = "soort_schakeling", required = true)
    protected String soortSchakeling;
    @XmlElement(required = true)
    protected String aandrijving;
    @XmlElement(required = true)
    protected String brandstoftype;
    @XmlElement(name = "aantal_cilinders", required = true)
    protected String aantalCilinders;
    @XmlElement(required = true)
    protected String bouwwijze;
    @XmlElement(name = "kleppen_per_cilinder", required = true)
    protected String kleppenPerCilinder;
    @XmlElement(required = true)
    protected String cilinderinhoud;
    @XmlElement(required = true)
    protected String boring;
    @XmlElement(required = true)
    protected String slag;
    @XmlElement(required = true)
    protected String compressieverhouding;
    @XmlElement(name = "vermogen_kw", required = true)
    protected String vermogenKw;
    @XmlElement(name = "vermogen_pk", required = true)
    protected String vermogenPk;
    @XmlElement(name = "vermogen_tpm", required = true)
    protected String vermogenTpm;
    @XmlElement(required = true)
    protected String koppel;
    @XmlElement(name = "koppel_tpm", required = true)
    protected String koppelTpm;
    @XmlElement(required = true)
    protected String katalysator;
    @XmlElement(required = true)
    protected String brandstofsysteem;
    @XmlElement(required = true)
    protected String klepbediening;
    @XmlElement(required = true)
    protected String turbo;
    @XmlElement(name = "wielophanging_voor", required = true)
    protected String wielophangingVoor;
    @XmlElement(name = "wielophanging_achter", required = true)
    protected String wielophangingAchter;
    @XmlElement(name = "vering_voor", required = true)
    protected String veringVoor;
    @XmlElement(name = "vering_achter", required = true)
    protected String veringAchter;
    @XmlElement(name = "stabilisator_voor", required = true)
    protected String stabilisatorVoor;
    @XmlElement(name = "stabilisator_achter", required = true)
    protected String stabilisatorAchter;
    @XmlElement(name = "remmen_voor", required = true)
    protected String remmenVoor;
    @XmlElement(name = "remmen_voor_mm", required = true)
    protected String remmenVoorMm;
    @XmlElement(name = "remmen_achter", required = true)
    protected String remmenAchter;
    @XmlElement(name = "remmen_achter_mm", required = true)
    protected String remmenAchterMm;
    @XmlElement(name = "cw_waarde", required = true)
    protected String cwWaarde;
    @XmlElement(required = true)
    protected String lengte;
    @XmlElement(required = true)
    protected String breedte;
    @XmlElement(required = true)
    protected String hoogte;
    @XmlElement(required = true)
    protected String wielbasis;
    @XmlElement(name = "spoorbreedte_voor", required = true)
    protected String spoorbreedteVoor;
    @XmlElement(name = "spoorbreedte_achter", required = true)
    protected String spoorbreedteAchter;
    @XmlElement(required = true)
    protected String draaicirkel;
    @XmlElement(name = "bandenmaat_voor", required = true)
    protected String bandenmaatVoor;
    @XmlElement(name = "bandenmaat_achter", required = true)
    protected String bandenmaatAchter;
    @XmlElement(required = true)
    protected String massa;
    @XmlElement(name = "max_toelaatbare_massa", required = true)
    protected String maxToelaatbareMassa;
    @XmlElement(name = "max_aanhanger_geremd", required = true)
    protected String maxAanhangerGeremd;
    @XmlElement(name = "max_aanhanger_ongeremd", required = true)
    protected String maxAanhangerOngeremd;
    @XmlElement(name = "max_kogeldruk", required = true)
    protected String maxKogeldruk;
    @XmlElement(name = "max_dakbelasting", required = true)
    protected String maxDakbelasting;
    @XmlElement(name = "koffer_min", required = true)
    protected String kofferMin;
    @XmlElement(name = "koffer_max", required = true)
    protected String kofferMax;
    @XmlElement(required = true)
    protected String tankinhoud;
    @XmlElement(required = true)
    protected String topsnelheid;
    @XmlElement(required = true)
    protected String acceleratie;
    @XmlElement(name = "verbruik_binnen_bebouwde_kom", required = true)
    protected String verbruikBinnenBebouwdeKom;
    @XmlElement(name = "verbruik_buiten_bebouwde_kom", required = true)
    protected String verbruikBuitenBebouwdeKom;
    @XmlElement(name = "verbruik_gecombineerd", required = true)
    protected String verbruikGecombineerd;
    @XmlElement(name = "co2_uitstoot", required = true)
    protected String co2Uitstoot;
    @XmlElement(name = "verbruik_gemiddeld", required = true)
    protected String verbruikGemiddeld;
    @XmlElement(required = true)
    protected CarOption abs;
    @XmlElement(required = true)
    protected CarOption remkrachtverdeling;
    @XmlElement(required = true)
    protected CarOption brakeassist;
    @XmlElement(required = true)
    protected CarOption tractiecontrole;
    @XmlElement(required = true)
    protected CarOption sperdifferentieel;
    @XmlElement(required = true)
    protected CarOption stabiliteitsregeling;
    @XmlElement(name = "regelbare_schokdemping", required = true)
    protected CarOption regelbareSchokdemping;
    @XmlElement(required = true)
    protected CarOption niveauregeling;
    @XmlElement(name = "airbag_bestuurder", required = true)
    protected CarOption airbagBestuurder;
    @XmlElement(name = "airbag_passagier", required = true)
    protected CarOption airbagPassagier;
    @XmlElement(name = "airbag_opzijvoor", required = true)
    protected CarOption airbagOpzijvoor;
    @XmlElement(name = "airbag_opzijachter", required = true)
    protected CarOption airbagOpzijachter;
    @XmlElement(name = "airbag_hoofdvoor", required = true)
    protected CarOption airbagHoofdvoor;
    @XmlElement(name = "airbag_hoofdachter", required = true)
    protected CarOption airbagHoofdachter;
    @XmlElement(required = true)
    protected CarOption gordelspanners;
    @XmlElement(name = "verstelbare_gordelhoogte", required = true)
    protected CarOption verstelbareGordelhoogte;
    @XmlElement(required = true)
    protected CarOption startonderbreker;
    @XmlElement(required = true)
    protected CarOption inbraakalarm;
    @XmlElement(name = "centrale_deurvergrendeling", required = true)
    protected CarOption centraleDeurvergrendeling;
    @XmlElement(name = "afstandbediening_deurvergrendeling", required = true)
    protected CarOption afstandbedieningDeurvergrendeling;
    @XmlElement(name = "automatische_vergrendeling", required = true)
    protected CarOption automatischeVergrendeling;
    @XmlElement(name = "keyless_entry", required = true)
    protected CarOption keylessEntry;
    @XmlElement(name = "elektrische_ramen_voor", required = true)
    protected CarOption elektrischeRamenVoor;
    @XmlElement(name = "elektrische_ramen_achter", required = true)
    protected CarOption elektrischeRamenAchter;
    @XmlElement(required = true)
    protected CarOption stuurbekrachtiging;
    @XmlElement(required = true)
    protected CarOption stuurschakeling;
    @XmlElement(name = "cruise_control", required = true)
    protected CarOption cruiseControl;
    @XmlElement(name = "radar_cruise_control", required = true)
    protected CarOption radarCruiseControl;
    @XmlElement(required = true)
    protected CarOption airconditioning;
    @XmlElement(required = true)
    protected CarOption klimaatregeling;
    @XmlElement(name = "gescheiden_temperatuurregeling", required = true)
    protected CarOption gescheidenTemperatuurregeling;
    @XmlElement(required = true)
    protected CarOption pollenfilter;
    @XmlElement(required = true)
    protected CarOption parkeersensor;
    @XmlElement(name = "hoofdsteunen_voor", required = true)
    protected CarOption hoofdsteunenVoor;
    @XmlElement(name = "hoofdsteunen_achter", required = true)
    protected CarOption hoofdsteunenAchter;
    @XmlElement(name = "verstelbare_hoofdsteunen_achter", required = true)
    protected CarOption verstelbareHoofdsteunenAchter;
    @XmlElement(name = "derde_hoofdsteun_achter", required = true)
    protected CarOption derdeHoofdsteunAchter;
    @XmlElement(name = "derde_driepuntsgordel_achter", required = true)
    protected CarOption derdeDriepuntsgordelAchter;
    @XmlElement(name = "verstelbare_lendensteun_bestuurder", required = true)
    protected CarOption verstelbareLendensteunBestuurder;
    @XmlElement(name = "verstelbare_lendensteun_passagier", required = true)
    protected CarOption verstelbareLendensteunPassagier;
    @XmlElement(name = "hoogteverstelling_bestuurder", required = true)
    protected CarOption hoogteverstellingBestuurder;
    @XmlElement(name = "hoogteverstelling_passagier", required = true)
    protected CarOption hoogteverstellingPassagier;
    @XmlElement(name = "elektrische_stoelverstelling", required = true)
    protected CarOption elektrischeStoelverstelling;
    @XmlElement(name = "geheugen_stoelverstelling", required = true)
    protected CarOption geheugenStoelverstelling;
    @XmlElement(name = "verwarmde_zitplaatsen_voor", required = true)
    protected CarOption verwarmdeZitplaatsenVoor;
    @XmlElement(name = "verwarmde_zitplaatsen_achter", required = true)
    protected CarOption verwarmdeZitplaatsenAchter;
    @XmlElement(required = true)
    protected CarOption sportstoelen;
    @XmlElement(name = "bekledingstof_leer", required = true)
    protected CarOption bekledingstofLeer;
    @XmlElement(required = true)
    protected CarOption lerenbekleding;
    @XmlElement(name = "hoogteverstelling_stuur", required = true)
    protected CarOption hoogteverstellingStuur;
    @XmlElement(name = "diepteverstelling_stuur", required = true)
    protected CarOption diepteverstellingStuur;
    @XmlElement(name = "elektrische_stuurverstelling", required = true)
    protected CarOption elektrischeStuurverstelling;
    @XmlElement(name = "leer_bekleed_stuur", required = true)
    protected CarOption leerBekleedStuur;
    @XmlElement(name = "middenarmsteun_voor", required = true)
    protected CarOption middenarmsteunVoor;
    @XmlElement(name = "middenarmsteun_achter", required = true)
    protected CarOption middenarmsteunAchter;
    @XmlElement(name = "neerklapbare_achterbank", required = true)
    protected CarOption neerklapbareAchterbank;
    @XmlElement(name = "in_delen_neerklapbaar_achterbank", required = true)
    protected CarOption inDelenNeerklapbaarAchterbank;
    @XmlElement(name = "opbergvak_linkerportier", required = true)
    protected CarOption opbergvakLinkerportier;
    @XmlElement(name = "bekerhouder_voor", required = true)
    protected CarOption bekerhouderVoor;
    @XmlElement(name = "bekerhouder_achter", required = true)
    protected CarOption bekerhouderAchter;
    @XmlElement(name = "zonnescherm_achterruit", required = true)
    protected CarOption zonneschermAchterruit;
    @XmlElement(required = true)
    protected CarOption dagteller;
    @XmlElement(required = true)
    protected CarOption toerenteller;
    @XmlElement(required = true)
    protected CarOption temperatuurmeter;
    @XmlElement(required = true)
    protected CarOption oliepeilmeter;
    @XmlElement(required = true)
    protected CarOption oliedrukmeter;
    @XmlElement(required = true)
    protected CarOption olietemperatuurmeter;
    @XmlElement(required = true)
    protected CarOption voltmeter;
    @XmlElement(required = true)
    protected CarOption verbruiksmeter;
    @XmlElement(required = true)
    protected CarOption turbodrukmeter;
    @XmlElement(required = true)
    protected CarOption buitentemperatuurmeter;
    @XmlElement(required = true)
    protected CarOption klokje;
    @XmlElement(required = true)
    protected CarOption boardcomputer;
    @XmlElement(required = true)
    protected CarOption luidsprekers;
    @XmlElement(required = true)
    protected CarOption stereoinstallatie;
    @XmlElement(required = true)
    protected CarOption cdspeler;
    @XmlElement(required = true)
    protected CarOption cdwisselaar;
    @XmlElement(required = true)
    protected CarOption audiostuurbediening;
    @XmlElement(required = true)
    protected CarOption bandenspanningssensor;
    @XmlElement(required = true)
    protected CarOption navigatiesysteem;
    @XmlElement(required = true)
    protected CarOption televisie;
    @XmlElement(required = true)
    protected CarOption telefoonvoorbereiding;
    @XmlElement(required = true)
    protected CarOption telefoon;
    @XmlElement(required = true)
    protected CarOption intervalruitenwisser;
    @XmlElement(name = "regelbare_interval", required = true)
    protected CarOption regelbareInterval;
    @XmlElement(required = true)
    protected CarOption regensensor;
    @XmlElement(name = "ruitenwisser_achter", required = true)
    protected CarOption ruitenwisserAchter;
    @XmlElement(required = true)
    protected CarOption achterruitverwarming;
    @XmlElement(required = true)
    protected CarOption voorruitverwarming;
    @XmlElement(name = "verwarmde_ruitensproeiers", required = true)
    protected CarOption verwarmdeRuitensproeiers;
    @XmlElement(name = "gelaagde_voorruit", required = true)
    protected CarOption gelaagdeVoorruit;
    @XmlElement(required = true)
    protected CarOption getintglas;
    @XmlElement(required = true)
    protected CarOption schuifdak;
    @XmlElement(name = "elektrisch_schuifdak", required = true)
    protected CarOption elektrischSchuifdak;
    @XmlElement(name = "beschermstrips_opzij", required = true)
    protected CarOption beschermstripsOpzij;
    @XmlElement(name = "bumpers_meegespoten", required = true)
    protected CarOption bumpersMeegespoten;
    @XmlElement(name = "metallic_lak", required = true)
    protected CarOption metallicLak;
    @XmlElement(name = "lichtmetalen_velgen", required = true)
    protected CarOption lichtmetalenVelgen;
    @XmlElement(name = "rechter_buitenspiegel", required = true)
    protected CarOption rechterBuitenspiegel;
    @XmlElement(name = "binnenuit_verstelbare_buitenspiegel", required = true)
    protected CarOption binnenuitVerstelbareBuitenspiegel;
    @XmlElement(name = "elektrische_spiegels", required = true)
    protected CarOption elektrischeSpiegels;
    @XmlElement(name = "verwarmde_spiegels", required = true)
    protected CarOption verwarmdeSpiegels;
    @XmlElement(name = "inklapbare_spiegels", required = true)
    protected CarOption inklapbareSpiegels;
    @XmlElement(name = "meegespoten_spiegels", required = true)
    protected CarOption meegespotenSpiegels;
    @XmlElement(name = "dodehoekspiegel_bestuurder", required = true)
    protected CarOption dodehoekspiegelBestuurder;
    @XmlElement(name = "dimmende_binnenspiegel", required = true)
    protected CarOption dimmendeBinnenspiegel;
    @XmlElement(name = "dimmende_buitenspiegel", required = true)
    protected CarOption dimmendeBuitenspiegel;
    @XmlElement(required = true)
    protected CarOption dakrails;
    @XmlElement(name = "binnenuit_te_openen_tankklep", required = true)
    protected CarOption binnenuitTeOpenenTankklep;
    @XmlElement(name = "binnenuit_te_openen_bagageklep", required = true)
    protected CarOption binnenuitTeOpenenBagageklep;
    @XmlElement(name = "op_afstand_te_openen_bagageklep", required = true)
    protected CarOption opAfstandTeOpenenBagageklep;
    @XmlElement(name = "halogeen_koplampen", required = true)
    protected CarOption halogeenKoplampen;
    @XmlElement(name = "xenon_koplampen", required = true)
    protected CarOption xenonKoplampen;
    @XmlElement(name = "verstelbare_koplampen", required = true)
    protected CarOption verstelbareKoplampen;
    @XmlElement(required = true)
    protected CarOption koplampsproeiers;
    @XmlElement(name = "automatisch_inschakelende_koplampen", required = true)
    protected CarOption automatischInschakelendeKoplampen;
    @XmlElement(required = true)
    protected CarOption verstralers;
    @XmlElement(name = "mistlampen_voor", required = true)
    protected CarOption mistlampenVoor;
    @XmlElement(name = "mistlampen_achter", required = true)
    protected CarOption mistlampenAchter;
    @XmlElement(name = "zoemer_vergeten_verlichting", required = true)
    protected CarOption zoemerVergetenVerlichting;
    @XmlElement(name = "verlichte_bagageruimte", required = true)
    protected CarOption verlichteBagageruimte;
    @XmlElement(name = "verlichte_motorruimte", required = true)
    protected CarOption verlichteMotorruimte;
    @XmlElement(name = "verlicht_dashboardkastje", required = true)
    protected CarOption verlichtDashboardkastje;
    @XmlElement(name = "regelbare_dashboardverlichting", required = true)
    protected CarOption regelbareDashboardverlichting;
    @XmlElement(name = "leeslampje_voor", required = true)
    protected CarOption leeslampjeVoor;
    @XmlElement(name = "leeslampje_achter", required = true)
    protected CarOption leeslampjeAchter;
    @XmlElement(name = "verlichte_makeupspiegel", required = true)
    protected CarOption verlichteMakeupspiegel;
    @XmlElement(name = "vertraging_interieurverlichting", required = true)
    protected CarOption vertragingInterieurverlichting;
    @XmlElement(required = true)
    protected CarOption portierverlichting;

    /**
     * Gets the value of the carId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarId(String value) {
        this.carId = value;
    }

    /**
     * Gets the value of the merk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerk() {
        return merk;
    }

    /**
     * Sets the value of the merk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerk(String value) {
        this.merk = value;
    }

    /**
     * Gets the value of the serie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerie() {
        return serie;
    }

    /**
     * Sets the value of the serie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerie(String value) {
        this.serie = value;
    }

    /**
     * Gets the value of the serieJaarVan property.
     * 
     */
    public int getSerieJaarVan() {
        return serieJaarVan;
    }

    /**
     * Sets the value of the serieJaarVan property.
     * 
     */
    public void setSerieJaarVan(int value) {
        this.serieJaarVan = value;
    }

    /**
     * Gets the value of the serieJaarTot property.
     * 
     */
    public int getSerieJaarTot() {
        return serieJaarTot;
    }

    /**
     * Sets the value of the serieJaarTot property.
     * 
     */
    public void setSerieJaarTot(int value) {
        this.serieJaarTot = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the modelMaandVan property.
     * 
     */
    public int getModelMaandVan() {
        return modelMaandVan;
    }

    /**
     * Sets the value of the modelMaandVan property.
     * 
     */
    public void setModelMaandVan(int value) {
        this.modelMaandVan = value;
    }

    /**
     * Gets the value of the modelJaarVan property.
     * 
     */
    public int getModelJaarVan() {
        return modelJaarVan;
    }

    /**
     * Sets the value of the modelJaarVan property.
     * 
     */
    public void setModelJaarVan(int value) {
        this.modelJaarVan = value;
    }

    /**
     * Gets the value of the modelMaandTot property.
     * 
     */
    public int getModelMaandTot() {
        return modelMaandTot;
    }

    /**
     * Sets the value of the modelMaandTot property.
     * 
     */
    public void setModelMaandTot(int value) {
        this.modelMaandTot = value;
    }

    /**
     * Gets the value of the modelJaarTot property.
     * 
     */
    public int getModelJaarTot() {
        return modelJaarTot;
    }

    /**
     * Sets the value of the modelJaarTot property.
     * 
     */
    public void setModelJaarTot(int value) {
        this.modelJaarTot = value;
    }

    /**
     * Gets the value of the belastingMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelastingMin() {
        return belastingMin;
    }

    /**
     * Sets the value of the belastingMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelastingMin(String value) {
        this.belastingMin = value;
    }

    /**
     * Gets the value of the belastingMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelastingMax() {
        return belastingMax;
    }

    /**
     * Sets the value of the belastingMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelastingMax(String value) {
        this.belastingMax = value;
    }

    /**
     * Gets the value of the algemeneGarantie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgemeneGarantie() {
        return algemeneGarantie;
    }

    /**
     * Sets the value of the algemeneGarantie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgemeneGarantie(String value) {
        this.algemeneGarantie = value;
    }

    /**
     * Gets the value of the algemeneGarantieKm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgemeneGarantieKm() {
        return algemeneGarantieKm;
    }

    /**
     * Sets the value of the algemeneGarantieKm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgemeneGarantieKm(String value) {
        this.algemeneGarantieKm = value;
    }

    /**
     * Gets the value of the carrosserieGarantie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrosserieGarantie() {
        return carrosserieGarantie;
    }

    /**
     * Sets the value of the carrosserieGarantie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrosserieGarantie(String value) {
        this.carrosserieGarantie = value;
    }

    /**
     * Gets the value of the deuren property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeuren() {
        return deuren;
    }

    /**
     * Sets the value of the deuren property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeuren(String value) {
        this.deuren = value;
    }

    /**
     * Gets the value of the carrosserietype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrosserietype() {
        return carrosserietype;
    }

    /**
     * Sets the value of the carrosserietype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrosserietype(String value) {
        this.carrosserietype = value;
    }

    /**
     * Gets the value of the aantalVersnellingen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAantalVersnellingen() {
        return aantalVersnellingen;
    }

    /**
     * Sets the value of the aantalVersnellingen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAantalVersnellingen(String value) {
        this.aantalVersnellingen = value;
    }

    /**
     * Gets the value of the soortSchakeling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoortSchakeling() {
        return soortSchakeling;
    }

    /**
     * Sets the value of the soortSchakeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoortSchakeling(String value) {
        this.soortSchakeling = value;
    }

    /**
     * Gets the value of the aandrijving property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAandrijving() {
        return aandrijving;
    }

    /**
     * Sets the value of the aandrijving property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAandrijving(String value) {
        this.aandrijving = value;
    }

    /**
     * Gets the value of the brandstoftype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandstoftype() {
        return brandstoftype;
    }

    /**
     * Sets the value of the brandstoftype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandstoftype(String value) {
        this.brandstoftype = value;
    }

    /**
     * Gets the value of the aantalCilinders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAantalCilinders() {
        return aantalCilinders;
    }

    /**
     * Sets the value of the aantalCilinders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAantalCilinders(String value) {
        this.aantalCilinders = value;
    }

    /**
     * Gets the value of the bouwwijze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBouwwijze() {
        return bouwwijze;
    }

    /**
     * Sets the value of the bouwwijze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBouwwijze(String value) {
        this.bouwwijze = value;
    }

    /**
     * Gets the value of the kleppenPerCilinder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKleppenPerCilinder() {
        return kleppenPerCilinder;
    }

    /**
     * Sets the value of the kleppenPerCilinder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKleppenPerCilinder(String value) {
        this.kleppenPerCilinder = value;
    }

    /**
     * Gets the value of the cilinderinhoud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCilinderinhoud() {
        return cilinderinhoud;
    }

    /**
     * Sets the value of the cilinderinhoud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCilinderinhoud(String value) {
        this.cilinderinhoud = value;
    }

    /**
     * Gets the value of the boring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoring() {
        return boring;
    }

    /**
     * Sets the value of the boring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoring(String value) {
        this.boring = value;
    }

    /**
     * Gets the value of the slag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlag() {
        return slag;
    }

    /**
     * Sets the value of the slag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlag(String value) {
        this.slag = value;
    }

    /**
     * Gets the value of the compressieverhouding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressieverhouding() {
        return compressieverhouding;
    }

    /**
     * Sets the value of the compressieverhouding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressieverhouding(String value) {
        this.compressieverhouding = value;
    }

    /**
     * Gets the value of the vermogenKw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVermogenKw() {
        return vermogenKw;
    }

    /**
     * Sets the value of the vermogenKw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermogenKw(String value) {
        this.vermogenKw = value;
    }

    /**
     * Gets the value of the vermogenPk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVermogenPk() {
        return vermogenPk;
    }

    /**
     * Sets the value of the vermogenPk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermogenPk(String value) {
        this.vermogenPk = value;
    }

    /**
     * Gets the value of the vermogenTpm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVermogenTpm() {
        return vermogenTpm;
    }

    /**
     * Sets the value of the vermogenTpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVermogenTpm(String value) {
        this.vermogenTpm = value;
    }

    /**
     * Gets the value of the koppel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoppel() {
        return koppel;
    }

    /**
     * Sets the value of the koppel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoppel(String value) {
        this.koppel = value;
    }

    /**
     * Gets the value of the koppelTpm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoppelTpm() {
        return koppelTpm;
    }

    /**
     * Sets the value of the koppelTpm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoppelTpm(String value) {
        this.koppelTpm = value;
    }

    /**
     * Gets the value of the katalysator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatalysator() {
        return katalysator;
    }

    /**
     * Sets the value of the katalysator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatalysator(String value) {
        this.katalysator = value;
    }

    /**
     * Gets the value of the brandstofsysteem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandstofsysteem() {
        return brandstofsysteem;
    }

    /**
     * Sets the value of the brandstofsysteem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandstofsysteem(String value) {
        this.brandstofsysteem = value;
    }

    /**
     * Gets the value of the klepbediening property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlepbediening() {
        return klepbediening;
    }

    /**
     * Sets the value of the klepbediening property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlepbediening(String value) {
        this.klepbediening = value;
    }

    /**
     * Gets the value of the turbo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurbo() {
        return turbo;
    }

    /**
     * Sets the value of the turbo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurbo(String value) {
        this.turbo = value;
    }

    /**
     * Gets the value of the wielophangingVoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWielophangingVoor() {
        return wielophangingVoor;
    }

    /**
     * Sets the value of the wielophangingVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWielophangingVoor(String value) {
        this.wielophangingVoor = value;
    }

    /**
     * Gets the value of the wielophangingAchter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWielophangingAchter() {
        return wielophangingAchter;
    }

    /**
     * Sets the value of the wielophangingAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWielophangingAchter(String value) {
        this.wielophangingAchter = value;
    }

    /**
     * Gets the value of the veringVoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeringVoor() {
        return veringVoor;
    }

    /**
     * Sets the value of the veringVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeringVoor(String value) {
        this.veringVoor = value;
    }

    /**
     * Gets the value of the veringAchter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeringAchter() {
        return veringAchter;
    }

    /**
     * Sets the value of the veringAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeringAchter(String value) {
        this.veringAchter = value;
    }

    /**
     * Gets the value of the stabilisatorVoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStabilisatorVoor() {
        return stabilisatorVoor;
    }

    /**
     * Sets the value of the stabilisatorVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStabilisatorVoor(String value) {
        this.stabilisatorVoor = value;
    }

    /**
     * Gets the value of the stabilisatorAchter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStabilisatorAchter() {
        return stabilisatorAchter;
    }

    /**
     * Sets the value of the stabilisatorAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStabilisatorAchter(String value) {
        this.stabilisatorAchter = value;
    }

    /**
     * Gets the value of the remmenVoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemmenVoor() {
        return remmenVoor;
    }

    /**
     * Sets the value of the remmenVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemmenVoor(String value) {
        this.remmenVoor = value;
    }

    /**
     * Gets the value of the remmenVoorMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemmenVoorMm() {
        return remmenVoorMm;
    }

    /**
     * Sets the value of the remmenVoorMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemmenVoorMm(String value) {
        this.remmenVoorMm = value;
    }

    /**
     * Gets the value of the remmenAchter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemmenAchter() {
        return remmenAchter;
    }

    /**
     * Sets the value of the remmenAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemmenAchter(String value) {
        this.remmenAchter = value;
    }

    /**
     * Gets the value of the remmenAchterMm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemmenAchterMm() {
        return remmenAchterMm;
    }

    /**
     * Sets the value of the remmenAchterMm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemmenAchterMm(String value) {
        this.remmenAchterMm = value;
    }

    /**
     * Gets the value of the cwWaarde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCwWaarde() {
        return cwWaarde;
    }

    /**
     * Sets the value of the cwWaarde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCwWaarde(String value) {
        this.cwWaarde = value;
    }

    /**
     * Gets the value of the lengte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLengte() {
        return lengte;
    }

    /**
     * Sets the value of the lengte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLengte(String value) {
        this.lengte = value;
    }

    /**
     * Gets the value of the breedte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreedte() {
        return breedte;
    }

    /**
     * Sets the value of the breedte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreedte(String value) {
        this.breedte = value;
    }

    /**
     * Gets the value of the hoogte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoogte() {
        return hoogte;
    }

    /**
     * Sets the value of the hoogte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoogte(String value) {
        this.hoogte = value;
    }

    /**
     * Gets the value of the wielbasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWielbasis() {
        return wielbasis;
    }

    /**
     * Sets the value of the wielbasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWielbasis(String value) {
        this.wielbasis = value;
    }

    /**
     * Gets the value of the spoorbreedteVoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpoorbreedteVoor() {
        return spoorbreedteVoor;
    }

    /**
     * Sets the value of the spoorbreedteVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpoorbreedteVoor(String value) {
        this.spoorbreedteVoor = value;
    }

    /**
     * Gets the value of the spoorbreedteAchter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpoorbreedteAchter() {
        return spoorbreedteAchter;
    }

    /**
     * Sets the value of the spoorbreedteAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpoorbreedteAchter(String value) {
        this.spoorbreedteAchter = value;
    }

    /**
     * Gets the value of the draaicirkel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDraaicirkel() {
        return draaicirkel;
    }

    /**
     * Sets the value of the draaicirkel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDraaicirkel(String value) {
        this.draaicirkel = value;
    }

    /**
     * Gets the value of the bandenmaatVoor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandenmaatVoor() {
        return bandenmaatVoor;
    }

    /**
     * Sets the value of the bandenmaatVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandenmaatVoor(String value) {
        this.bandenmaatVoor = value;
    }

    /**
     * Gets the value of the bandenmaatAchter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBandenmaatAchter() {
        return bandenmaatAchter;
    }

    /**
     * Sets the value of the bandenmaatAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBandenmaatAchter(String value) {
        this.bandenmaatAchter = value;
    }

    /**
     * Gets the value of the massa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMassa() {
        return massa;
    }

    /**
     * Sets the value of the massa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassa(String value) {
        this.massa = value;
    }

    /**
     * Gets the value of the maxToelaatbareMassa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxToelaatbareMassa() {
        return maxToelaatbareMassa;
    }

    /**
     * Sets the value of the maxToelaatbareMassa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxToelaatbareMassa(String value) {
        this.maxToelaatbareMassa = value;
    }

    /**
     * Gets the value of the maxAanhangerGeremd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAanhangerGeremd() {
        return maxAanhangerGeremd;
    }

    /**
     * Sets the value of the maxAanhangerGeremd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAanhangerGeremd(String value) {
        this.maxAanhangerGeremd = value;
    }

    /**
     * Gets the value of the maxAanhangerOngeremd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxAanhangerOngeremd() {
        return maxAanhangerOngeremd;
    }

    /**
     * Sets the value of the maxAanhangerOngeremd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxAanhangerOngeremd(String value) {
        this.maxAanhangerOngeremd = value;
    }

    /**
     * Gets the value of the maxKogeldruk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxKogeldruk() {
        return maxKogeldruk;
    }

    /**
     * Sets the value of the maxKogeldruk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxKogeldruk(String value) {
        this.maxKogeldruk = value;
    }

    /**
     * Gets the value of the maxDakbelasting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDakbelasting() {
        return maxDakbelasting;
    }

    /**
     * Sets the value of the maxDakbelasting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDakbelasting(String value) {
        this.maxDakbelasting = value;
    }

    /**
     * Gets the value of the kofferMin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKofferMin() {
        return kofferMin;
    }

    /**
     * Sets the value of the kofferMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKofferMin(String value) {
        this.kofferMin = value;
    }

    /**
     * Gets the value of the kofferMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKofferMax() {
        return kofferMax;
    }

    /**
     * Sets the value of the kofferMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKofferMax(String value) {
        this.kofferMax = value;
    }

    /**
     * Gets the value of the tankinhoud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTankinhoud() {
        return tankinhoud;
    }

    /**
     * Sets the value of the tankinhoud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTankinhoud(String value) {
        this.tankinhoud = value;
    }

    /**
     * Gets the value of the topsnelheid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopsnelheid() {
        return topsnelheid;
    }

    /**
     * Sets the value of the topsnelheid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopsnelheid(String value) {
        this.topsnelheid = value;
    }

    /**
     * Gets the value of the acceleratie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcceleratie() {
        return acceleratie;
    }

    /**
     * Sets the value of the acceleratie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcceleratie(String value) {
        this.acceleratie = value;
    }

    /**
     * Gets the value of the verbruikBinnenBebouwdeKom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbruikBinnenBebouwdeKom() {
        return verbruikBinnenBebouwdeKom;
    }

    /**
     * Sets the value of the verbruikBinnenBebouwdeKom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbruikBinnenBebouwdeKom(String value) {
        this.verbruikBinnenBebouwdeKom = value;
    }

    /**
     * Gets the value of the verbruikBuitenBebouwdeKom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbruikBuitenBebouwdeKom() {
        return verbruikBuitenBebouwdeKom;
    }

    /**
     * Sets the value of the verbruikBuitenBebouwdeKom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbruikBuitenBebouwdeKom(String value) {
        this.verbruikBuitenBebouwdeKom = value;
    }

    /**
     * Gets the value of the verbruikGecombineerd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbruikGecombineerd() {
        return verbruikGecombineerd;
    }

    /**
     * Sets the value of the verbruikGecombineerd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbruikGecombineerd(String value) {
        this.verbruikGecombineerd = value;
    }

    /**
     * Gets the value of the co2Uitstoot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCo2Uitstoot() {
        return co2Uitstoot;
    }

    /**
     * Sets the value of the co2Uitstoot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCo2Uitstoot(String value) {
        this.co2Uitstoot = value;
    }

    /**
     * Gets the value of the verbruikGemiddeld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerbruikGemiddeld() {
        return verbruikGemiddeld;
    }

    /**
     * Sets the value of the verbruikGemiddeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerbruikGemiddeld(String value) {
        this.verbruikGemiddeld = value;
    }

    /**
     * Gets the value of the abs property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAbs() {
        return abs;
    }

    /**
     * Sets the value of the abs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAbs(CarOption value) {
        this.abs = value;
    }

    /**
     * Gets the value of the remkrachtverdeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRemkrachtverdeling() {
        return remkrachtverdeling;
    }

    /**
     * Sets the value of the remkrachtverdeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRemkrachtverdeling(CarOption value) {
        this.remkrachtverdeling = value;
    }

    /**
     * Gets the value of the brakeassist property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBrakeassist() {
        return brakeassist;
    }

    /**
     * Sets the value of the brakeassist property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBrakeassist(CarOption value) {
        this.brakeassist = value;
    }

    /**
     * Gets the value of the tractiecontrole property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getTractiecontrole() {
        return tractiecontrole;
    }

    /**
     * Sets the value of the tractiecontrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setTractiecontrole(CarOption value) {
        this.tractiecontrole = value;
    }

    /**
     * Gets the value of the sperdifferentieel property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getSperdifferentieel() {
        return sperdifferentieel;
    }

    /**
     * Sets the value of the sperdifferentieel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setSperdifferentieel(CarOption value) {
        this.sperdifferentieel = value;
    }

    /**
     * Gets the value of the stabiliteitsregeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getStabiliteitsregeling() {
        return stabiliteitsregeling;
    }

    /**
     * Sets the value of the stabiliteitsregeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setStabiliteitsregeling(CarOption value) {
        this.stabiliteitsregeling = value;
    }

    /**
     * Gets the value of the regelbareSchokdemping property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRegelbareSchokdemping() {
        return regelbareSchokdemping;
    }

    /**
     * Sets the value of the regelbareSchokdemping property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRegelbareSchokdemping(CarOption value) {
        this.regelbareSchokdemping = value;
    }

    /**
     * Gets the value of the niveauregeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getNiveauregeling() {
        return niveauregeling;
    }

    /**
     * Sets the value of the niveauregeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setNiveauregeling(CarOption value) {
        this.niveauregeling = value;
    }

    /**
     * Gets the value of the airbagBestuurder property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirbagBestuurder() {
        return airbagBestuurder;
    }

    /**
     * Sets the value of the airbagBestuurder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirbagBestuurder(CarOption value) {
        this.airbagBestuurder = value;
    }

    /**
     * Gets the value of the airbagPassagier property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirbagPassagier() {
        return airbagPassagier;
    }

    /**
     * Sets the value of the airbagPassagier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirbagPassagier(CarOption value) {
        this.airbagPassagier = value;
    }

    /**
     * Gets the value of the airbagOpzijvoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirbagOpzijvoor() {
        return airbagOpzijvoor;
    }

    /**
     * Sets the value of the airbagOpzijvoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirbagOpzijvoor(CarOption value) {
        this.airbagOpzijvoor = value;
    }

    /**
     * Gets the value of the airbagOpzijachter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirbagOpzijachter() {
        return airbagOpzijachter;
    }

    /**
     * Sets the value of the airbagOpzijachter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirbagOpzijachter(CarOption value) {
        this.airbagOpzijachter = value;
    }

    /**
     * Gets the value of the airbagHoofdvoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirbagHoofdvoor() {
        return airbagHoofdvoor;
    }

    /**
     * Sets the value of the airbagHoofdvoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirbagHoofdvoor(CarOption value) {
        this.airbagHoofdvoor = value;
    }

    /**
     * Gets the value of the airbagHoofdachter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirbagHoofdachter() {
        return airbagHoofdachter;
    }

    /**
     * Sets the value of the airbagHoofdachter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirbagHoofdachter(CarOption value) {
        this.airbagHoofdachter = value;
    }

    /**
     * Gets the value of the gordelspanners property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getGordelspanners() {
        return gordelspanners;
    }

    /**
     * Sets the value of the gordelspanners property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setGordelspanners(CarOption value) {
        this.gordelspanners = value;
    }

    /**
     * Gets the value of the verstelbareGordelhoogte property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerstelbareGordelhoogte() {
        return verstelbareGordelhoogte;
    }

    /**
     * Sets the value of the verstelbareGordelhoogte property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerstelbareGordelhoogte(CarOption value) {
        this.verstelbareGordelhoogte = value;
    }

    /**
     * Gets the value of the startonderbreker property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getStartonderbreker() {
        return startonderbreker;
    }

    /**
     * Sets the value of the startonderbreker property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setStartonderbreker(CarOption value) {
        this.startonderbreker = value;
    }

    /**
     * Gets the value of the inbraakalarm property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getInbraakalarm() {
        return inbraakalarm;
    }

    /**
     * Sets the value of the inbraakalarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setInbraakalarm(CarOption value) {
        this.inbraakalarm = value;
    }

    /**
     * Gets the value of the centraleDeurvergrendeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getCentraleDeurvergrendeling() {
        return centraleDeurvergrendeling;
    }

    /**
     * Sets the value of the centraleDeurvergrendeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setCentraleDeurvergrendeling(CarOption value) {
        this.centraleDeurvergrendeling = value;
    }

    /**
     * Gets the value of the afstandbedieningDeurvergrendeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAfstandbedieningDeurvergrendeling() {
        return afstandbedieningDeurvergrendeling;
    }

    /**
     * Sets the value of the afstandbedieningDeurvergrendeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAfstandbedieningDeurvergrendeling(CarOption value) {
        this.afstandbedieningDeurvergrendeling = value;
    }

    /**
     * Gets the value of the automatischeVergrendeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAutomatischeVergrendeling() {
        return automatischeVergrendeling;
    }

    /**
     * Sets the value of the automatischeVergrendeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAutomatischeVergrendeling(CarOption value) {
        this.automatischeVergrendeling = value;
    }

    /**
     * Gets the value of the keylessEntry property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getKeylessEntry() {
        return keylessEntry;
    }

    /**
     * Sets the value of the keylessEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setKeylessEntry(CarOption value) {
        this.keylessEntry = value;
    }

    /**
     * Gets the value of the elektrischeRamenVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getElektrischeRamenVoor() {
        return elektrischeRamenVoor;
    }

    /**
     * Sets the value of the elektrischeRamenVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setElektrischeRamenVoor(CarOption value) {
        this.elektrischeRamenVoor = value;
    }

    /**
     * Gets the value of the elektrischeRamenAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getElektrischeRamenAchter() {
        return elektrischeRamenAchter;
    }

    /**
     * Sets the value of the elektrischeRamenAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setElektrischeRamenAchter(CarOption value) {
        this.elektrischeRamenAchter = value;
    }

    /**
     * Gets the value of the stuurbekrachtiging property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getStuurbekrachtiging() {
        return stuurbekrachtiging;
    }

    /**
     * Sets the value of the stuurbekrachtiging property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setStuurbekrachtiging(CarOption value) {
        this.stuurbekrachtiging = value;
    }

    /**
     * Gets the value of the stuurschakeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getStuurschakeling() {
        return stuurschakeling;
    }

    /**
     * Sets the value of the stuurschakeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setStuurschakeling(CarOption value) {
        this.stuurschakeling = value;
    }

    /**
     * Gets the value of the cruiseControl property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getCruiseControl() {
        return cruiseControl;
    }

    /**
     * Sets the value of the cruiseControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setCruiseControl(CarOption value) {
        this.cruiseControl = value;
    }

    /**
     * Gets the value of the radarCruiseControl property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRadarCruiseControl() {
        return radarCruiseControl;
    }

    /**
     * Sets the value of the radarCruiseControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRadarCruiseControl(CarOption value) {
        this.radarCruiseControl = value;
    }

    /**
     * Gets the value of the airconditioning property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAirconditioning() {
        return airconditioning;
    }

    /**
     * Sets the value of the airconditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAirconditioning(CarOption value) {
        this.airconditioning = value;
    }

    /**
     * Gets the value of the klimaatregeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getKlimaatregeling() {
        return klimaatregeling;
    }

    /**
     * Sets the value of the klimaatregeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setKlimaatregeling(CarOption value) {
        this.klimaatregeling = value;
    }

    /**
     * Gets the value of the gescheidenTemperatuurregeling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getGescheidenTemperatuurregeling() {
        return gescheidenTemperatuurregeling;
    }

    /**
     * Sets the value of the gescheidenTemperatuurregeling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setGescheidenTemperatuurregeling(CarOption value) {
        this.gescheidenTemperatuurregeling = value;
    }

    /**
     * Gets the value of the pollenfilter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getPollenfilter() {
        return pollenfilter;
    }

    /**
     * Sets the value of the pollenfilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setPollenfilter(CarOption value) {
        this.pollenfilter = value;
    }

    /**
     * Gets the value of the parkeersensor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getParkeersensor() {
        return parkeersensor;
    }

    /**
     * Sets the value of the parkeersensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setParkeersensor(CarOption value) {
        this.parkeersensor = value;
    }

    /**
     * Gets the value of the hoofdsteunenVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getHoofdsteunenVoor() {
        return hoofdsteunenVoor;
    }

    /**
     * Sets the value of the hoofdsteunenVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setHoofdsteunenVoor(CarOption value) {
        this.hoofdsteunenVoor = value;
    }

    /**
     * Gets the value of the hoofdsteunenAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getHoofdsteunenAchter() {
        return hoofdsteunenAchter;
    }

    /**
     * Sets the value of the hoofdsteunenAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setHoofdsteunenAchter(CarOption value) {
        this.hoofdsteunenAchter = value;
    }

    /**
     * Gets the value of the verstelbareHoofdsteunenAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerstelbareHoofdsteunenAchter() {
        return verstelbareHoofdsteunenAchter;
    }

    /**
     * Sets the value of the verstelbareHoofdsteunenAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerstelbareHoofdsteunenAchter(CarOption value) {
        this.verstelbareHoofdsteunenAchter = value;
    }

    /**
     * Gets the value of the derdeHoofdsteunAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDerdeHoofdsteunAchter() {
        return derdeHoofdsteunAchter;
    }

    /**
     * Sets the value of the derdeHoofdsteunAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDerdeHoofdsteunAchter(CarOption value) {
        this.derdeHoofdsteunAchter = value;
    }

    /**
     * Gets the value of the derdeDriepuntsgordelAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDerdeDriepuntsgordelAchter() {
        return derdeDriepuntsgordelAchter;
    }

    /**
     * Sets the value of the derdeDriepuntsgordelAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDerdeDriepuntsgordelAchter(CarOption value) {
        this.derdeDriepuntsgordelAchter = value;
    }

    /**
     * Gets the value of the verstelbareLendensteunBestuurder property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerstelbareLendensteunBestuurder() {
        return verstelbareLendensteunBestuurder;
    }

    /**
     * Sets the value of the verstelbareLendensteunBestuurder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerstelbareLendensteunBestuurder(CarOption value) {
        this.verstelbareLendensteunBestuurder = value;
    }

    /**
     * Gets the value of the verstelbareLendensteunPassagier property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerstelbareLendensteunPassagier() {
        return verstelbareLendensteunPassagier;
    }

    /**
     * Sets the value of the verstelbareLendensteunPassagier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerstelbareLendensteunPassagier(CarOption value) {
        this.verstelbareLendensteunPassagier = value;
    }

    /**
     * Gets the value of the hoogteverstellingBestuurder property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getHoogteverstellingBestuurder() {
        return hoogteverstellingBestuurder;
    }

    /**
     * Sets the value of the hoogteverstellingBestuurder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setHoogteverstellingBestuurder(CarOption value) {
        this.hoogteverstellingBestuurder = value;
    }

    /**
     * Gets the value of the hoogteverstellingPassagier property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getHoogteverstellingPassagier() {
        return hoogteverstellingPassagier;
    }

    /**
     * Sets the value of the hoogteverstellingPassagier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setHoogteverstellingPassagier(CarOption value) {
        this.hoogteverstellingPassagier = value;
    }

    /**
     * Gets the value of the elektrischeStoelverstelling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getElektrischeStoelverstelling() {
        return elektrischeStoelverstelling;
    }

    /**
     * Sets the value of the elektrischeStoelverstelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setElektrischeStoelverstelling(CarOption value) {
        this.elektrischeStoelverstelling = value;
    }

    /**
     * Gets the value of the geheugenStoelverstelling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getGeheugenStoelverstelling() {
        return geheugenStoelverstelling;
    }

    /**
     * Sets the value of the geheugenStoelverstelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setGeheugenStoelverstelling(CarOption value) {
        this.geheugenStoelverstelling = value;
    }

    /**
     * Gets the value of the verwarmdeZitplaatsenVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerwarmdeZitplaatsenVoor() {
        return verwarmdeZitplaatsenVoor;
    }

    /**
     * Sets the value of the verwarmdeZitplaatsenVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerwarmdeZitplaatsenVoor(CarOption value) {
        this.verwarmdeZitplaatsenVoor = value;
    }

    /**
     * Gets the value of the verwarmdeZitplaatsenAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerwarmdeZitplaatsenAchter() {
        return verwarmdeZitplaatsenAchter;
    }

    /**
     * Sets the value of the verwarmdeZitplaatsenAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerwarmdeZitplaatsenAchter(CarOption value) {
        this.verwarmdeZitplaatsenAchter = value;
    }

    /**
     * Gets the value of the sportstoelen property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getSportstoelen() {
        return sportstoelen;
    }

    /**
     * Sets the value of the sportstoelen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setSportstoelen(CarOption value) {
        this.sportstoelen = value;
    }

    /**
     * Gets the value of the bekledingstofLeer property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBekledingstofLeer() {
        return bekledingstofLeer;
    }

    /**
     * Sets the value of the bekledingstofLeer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBekledingstofLeer(CarOption value) {
        this.bekledingstofLeer = value;
    }

    /**
     * Gets the value of the lerenbekleding property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getLerenbekleding() {
        return lerenbekleding;
    }

    /**
     * Sets the value of the lerenbekleding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setLerenbekleding(CarOption value) {
        this.lerenbekleding = value;
    }

    /**
     * Gets the value of the hoogteverstellingStuur property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getHoogteverstellingStuur() {
        return hoogteverstellingStuur;
    }

    /**
     * Sets the value of the hoogteverstellingStuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setHoogteverstellingStuur(CarOption value) {
        this.hoogteverstellingStuur = value;
    }

    /**
     * Gets the value of the diepteverstellingStuur property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDiepteverstellingStuur() {
        return diepteverstellingStuur;
    }

    /**
     * Sets the value of the diepteverstellingStuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDiepteverstellingStuur(CarOption value) {
        this.diepteverstellingStuur = value;
    }

    /**
     * Gets the value of the elektrischeStuurverstelling property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getElektrischeStuurverstelling() {
        return elektrischeStuurverstelling;
    }

    /**
     * Sets the value of the elektrischeStuurverstelling property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setElektrischeStuurverstelling(CarOption value) {
        this.elektrischeStuurverstelling = value;
    }

    /**
     * Gets the value of the leerBekleedStuur property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getLeerBekleedStuur() {
        return leerBekleedStuur;
    }

    /**
     * Sets the value of the leerBekleedStuur property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setLeerBekleedStuur(CarOption value) {
        this.leerBekleedStuur = value;
    }

    /**
     * Gets the value of the middenarmsteunVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getMiddenarmsteunVoor() {
        return middenarmsteunVoor;
    }

    /**
     * Sets the value of the middenarmsteunVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setMiddenarmsteunVoor(CarOption value) {
        this.middenarmsteunVoor = value;
    }

    /**
     * Gets the value of the middenarmsteunAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getMiddenarmsteunAchter() {
        return middenarmsteunAchter;
    }

    /**
     * Sets the value of the middenarmsteunAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setMiddenarmsteunAchter(CarOption value) {
        this.middenarmsteunAchter = value;
    }

    /**
     * Gets the value of the neerklapbareAchterbank property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getNeerklapbareAchterbank() {
        return neerklapbareAchterbank;
    }

    /**
     * Sets the value of the neerklapbareAchterbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setNeerklapbareAchterbank(CarOption value) {
        this.neerklapbareAchterbank = value;
    }

    /**
     * Gets the value of the inDelenNeerklapbaarAchterbank property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getInDelenNeerklapbaarAchterbank() {
        return inDelenNeerklapbaarAchterbank;
    }

    /**
     * Sets the value of the inDelenNeerklapbaarAchterbank property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setInDelenNeerklapbaarAchterbank(CarOption value) {
        this.inDelenNeerklapbaarAchterbank = value;
    }

    /**
     * Gets the value of the opbergvakLinkerportier property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getOpbergvakLinkerportier() {
        return opbergvakLinkerportier;
    }

    /**
     * Sets the value of the opbergvakLinkerportier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setOpbergvakLinkerportier(CarOption value) {
        this.opbergvakLinkerportier = value;
    }

    /**
     * Gets the value of the bekerhouderVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBekerhouderVoor() {
        return bekerhouderVoor;
    }

    /**
     * Sets the value of the bekerhouderVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBekerhouderVoor(CarOption value) {
        this.bekerhouderVoor = value;
    }

    /**
     * Gets the value of the bekerhouderAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBekerhouderAchter() {
        return bekerhouderAchter;
    }

    /**
     * Sets the value of the bekerhouderAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBekerhouderAchter(CarOption value) {
        this.bekerhouderAchter = value;
    }

    /**
     * Gets the value of the zonneschermAchterruit property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getZonneschermAchterruit() {
        return zonneschermAchterruit;
    }

    /**
     * Sets the value of the zonneschermAchterruit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setZonneschermAchterruit(CarOption value) {
        this.zonneschermAchterruit = value;
    }

    /**
     * Gets the value of the dagteller property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDagteller() {
        return dagteller;
    }

    /**
     * Sets the value of the dagteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDagteller(CarOption value) {
        this.dagteller = value;
    }

    /**
     * Gets the value of the toerenteller property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getToerenteller() {
        return toerenteller;
    }

    /**
     * Sets the value of the toerenteller property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setToerenteller(CarOption value) {
        this.toerenteller = value;
    }

    /**
     * Gets the value of the temperatuurmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getTemperatuurmeter() {
        return temperatuurmeter;
    }

    /**
     * Sets the value of the temperatuurmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setTemperatuurmeter(CarOption value) {
        this.temperatuurmeter = value;
    }

    /**
     * Gets the value of the oliepeilmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getOliepeilmeter() {
        return oliepeilmeter;
    }

    /**
     * Sets the value of the oliepeilmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setOliepeilmeter(CarOption value) {
        this.oliepeilmeter = value;
    }

    /**
     * Gets the value of the oliedrukmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getOliedrukmeter() {
        return oliedrukmeter;
    }

    /**
     * Sets the value of the oliedrukmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setOliedrukmeter(CarOption value) {
        this.oliedrukmeter = value;
    }

    /**
     * Gets the value of the olietemperatuurmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getOlietemperatuurmeter() {
        return olietemperatuurmeter;
    }

    /**
     * Sets the value of the olietemperatuurmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setOlietemperatuurmeter(CarOption value) {
        this.olietemperatuurmeter = value;
    }

    /**
     * Gets the value of the voltmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVoltmeter() {
        return voltmeter;
    }

    /**
     * Sets the value of the voltmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVoltmeter(CarOption value) {
        this.voltmeter = value;
    }

    /**
     * Gets the value of the verbruiksmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerbruiksmeter() {
        return verbruiksmeter;
    }

    /**
     * Sets the value of the verbruiksmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerbruiksmeter(CarOption value) {
        this.verbruiksmeter = value;
    }

    /**
     * Gets the value of the turbodrukmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getTurbodrukmeter() {
        return turbodrukmeter;
    }

    /**
     * Sets the value of the turbodrukmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setTurbodrukmeter(CarOption value) {
        this.turbodrukmeter = value;
    }

    /**
     * Gets the value of the buitentemperatuurmeter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBuitentemperatuurmeter() {
        return buitentemperatuurmeter;
    }

    /**
     * Sets the value of the buitentemperatuurmeter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBuitentemperatuurmeter(CarOption value) {
        this.buitentemperatuurmeter = value;
    }

    /**
     * Gets the value of the klokje property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getKlokje() {
        return klokje;
    }

    /**
     * Sets the value of the klokje property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setKlokje(CarOption value) {
        this.klokje = value;
    }

    /**
     * Gets the value of the boardcomputer property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBoardcomputer() {
        return boardcomputer;
    }

    /**
     * Sets the value of the boardcomputer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBoardcomputer(CarOption value) {
        this.boardcomputer = value;
    }

    /**
     * Gets the value of the luidsprekers property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getLuidsprekers() {
        return luidsprekers;
    }

    /**
     * Sets the value of the luidsprekers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setLuidsprekers(CarOption value) {
        this.luidsprekers = value;
    }

    /**
     * Gets the value of the stereoinstallatie property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getStereoinstallatie() {
        return stereoinstallatie;
    }

    /**
     * Sets the value of the stereoinstallatie property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setStereoinstallatie(CarOption value) {
        this.stereoinstallatie = value;
    }

    /**
     * Gets the value of the cdspeler property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getCdspeler() {
        return cdspeler;
    }

    /**
     * Sets the value of the cdspeler property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setCdspeler(CarOption value) {
        this.cdspeler = value;
    }

    /**
     * Gets the value of the cdwisselaar property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getCdwisselaar() {
        return cdwisselaar;
    }

    /**
     * Sets the value of the cdwisselaar property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setCdwisselaar(CarOption value) {
        this.cdwisselaar = value;
    }

    /**
     * Gets the value of the audiostuurbediening property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAudiostuurbediening() {
        return audiostuurbediening;
    }

    /**
     * Sets the value of the audiostuurbediening property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAudiostuurbediening(CarOption value) {
        this.audiostuurbediening = value;
    }

    /**
     * Gets the value of the bandenspanningssensor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBandenspanningssensor() {
        return bandenspanningssensor;
    }

    /**
     * Sets the value of the bandenspanningssensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBandenspanningssensor(CarOption value) {
        this.bandenspanningssensor = value;
    }

    /**
     * Gets the value of the navigatiesysteem property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getNavigatiesysteem() {
        return navigatiesysteem;
    }

    /**
     * Sets the value of the navigatiesysteem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setNavigatiesysteem(CarOption value) {
        this.navigatiesysteem = value;
    }

    /**
     * Gets the value of the televisie property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getTelevisie() {
        return televisie;
    }

    /**
     * Sets the value of the televisie property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setTelevisie(CarOption value) {
        this.televisie = value;
    }

    /**
     * Gets the value of the telefoonvoorbereiding property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getTelefoonvoorbereiding() {
        return telefoonvoorbereiding;
    }

    /**
     * Sets the value of the telefoonvoorbereiding property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setTelefoonvoorbereiding(CarOption value) {
        this.telefoonvoorbereiding = value;
    }

    /**
     * Gets the value of the telefoon property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getTelefoon() {
        return telefoon;
    }

    /**
     * Sets the value of the telefoon property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setTelefoon(CarOption value) {
        this.telefoon = value;
    }

    /**
     * Gets the value of the intervalruitenwisser property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getIntervalruitenwisser() {
        return intervalruitenwisser;
    }

    /**
     * Sets the value of the intervalruitenwisser property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setIntervalruitenwisser(CarOption value) {
        this.intervalruitenwisser = value;
    }

    /**
     * Gets the value of the regelbareInterval property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRegelbareInterval() {
        return regelbareInterval;
    }

    /**
     * Sets the value of the regelbareInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRegelbareInterval(CarOption value) {
        this.regelbareInterval = value;
    }

    /**
     * Gets the value of the regensensor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRegensensor() {
        return regensensor;
    }

    /**
     * Sets the value of the regensensor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRegensensor(CarOption value) {
        this.regensensor = value;
    }

    /**
     * Gets the value of the ruitenwisserAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRuitenwisserAchter() {
        return ruitenwisserAchter;
    }

    /**
     * Sets the value of the ruitenwisserAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRuitenwisserAchter(CarOption value) {
        this.ruitenwisserAchter = value;
    }

    /**
     * Gets the value of the achterruitverwarming property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAchterruitverwarming() {
        return achterruitverwarming;
    }

    /**
     * Sets the value of the achterruitverwarming property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAchterruitverwarming(CarOption value) {
        this.achterruitverwarming = value;
    }

    /**
     * Gets the value of the voorruitverwarming property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVoorruitverwarming() {
        return voorruitverwarming;
    }

    /**
     * Sets the value of the voorruitverwarming property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVoorruitverwarming(CarOption value) {
        this.voorruitverwarming = value;
    }

    /**
     * Gets the value of the verwarmdeRuitensproeiers property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerwarmdeRuitensproeiers() {
        return verwarmdeRuitensproeiers;
    }

    /**
     * Sets the value of the verwarmdeRuitensproeiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerwarmdeRuitensproeiers(CarOption value) {
        this.verwarmdeRuitensproeiers = value;
    }

    /**
     * Gets the value of the gelaagdeVoorruit property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getGelaagdeVoorruit() {
        return gelaagdeVoorruit;
    }

    /**
     * Sets the value of the gelaagdeVoorruit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setGelaagdeVoorruit(CarOption value) {
        this.gelaagdeVoorruit = value;
    }

    /**
     * Gets the value of the getintglas property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getGetintglas() {
        return getintglas;
    }

    /**
     * Sets the value of the getintglas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setGetintglas(CarOption value) {
        this.getintglas = value;
    }

    /**
     * Gets the value of the schuifdak property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getSchuifdak() {
        return schuifdak;
    }

    /**
     * Sets the value of the schuifdak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setSchuifdak(CarOption value) {
        this.schuifdak = value;
    }

    /**
     * Gets the value of the elektrischSchuifdak property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getElektrischSchuifdak() {
        return elektrischSchuifdak;
    }

    /**
     * Sets the value of the elektrischSchuifdak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setElektrischSchuifdak(CarOption value) {
        this.elektrischSchuifdak = value;
    }

    /**
     * Gets the value of the beschermstripsOpzij property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBeschermstripsOpzij() {
        return beschermstripsOpzij;
    }

    /**
     * Sets the value of the beschermstripsOpzij property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBeschermstripsOpzij(CarOption value) {
        this.beschermstripsOpzij = value;
    }

    /**
     * Gets the value of the bumpersMeegespoten property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBumpersMeegespoten() {
        return bumpersMeegespoten;
    }

    /**
     * Sets the value of the bumpersMeegespoten property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBumpersMeegespoten(CarOption value) {
        this.bumpersMeegespoten = value;
    }

    /**
     * Gets the value of the metallicLak property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getMetallicLak() {
        return metallicLak;
    }

    /**
     * Sets the value of the metallicLak property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setMetallicLak(CarOption value) {
        this.metallicLak = value;
    }

    /**
     * Gets the value of the lichtmetalenVelgen property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getLichtmetalenVelgen() {
        return lichtmetalenVelgen;
    }

    /**
     * Sets the value of the lichtmetalenVelgen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setLichtmetalenVelgen(CarOption value) {
        this.lichtmetalenVelgen = value;
    }

    /**
     * Gets the value of the rechterBuitenspiegel property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRechterBuitenspiegel() {
        return rechterBuitenspiegel;
    }

    /**
     * Sets the value of the rechterBuitenspiegel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRechterBuitenspiegel(CarOption value) {
        this.rechterBuitenspiegel = value;
    }

    /**
     * Gets the value of the binnenuitVerstelbareBuitenspiegel property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBinnenuitVerstelbareBuitenspiegel() {
        return binnenuitVerstelbareBuitenspiegel;
    }

    /**
     * Sets the value of the binnenuitVerstelbareBuitenspiegel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBinnenuitVerstelbareBuitenspiegel(CarOption value) {
        this.binnenuitVerstelbareBuitenspiegel = value;
    }

    /**
     * Gets the value of the elektrischeSpiegels property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getElektrischeSpiegels() {
        return elektrischeSpiegels;
    }

    /**
     * Sets the value of the elektrischeSpiegels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setElektrischeSpiegels(CarOption value) {
        this.elektrischeSpiegels = value;
    }

    /**
     * Gets the value of the verwarmdeSpiegels property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerwarmdeSpiegels() {
        return verwarmdeSpiegels;
    }

    /**
     * Sets the value of the verwarmdeSpiegels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerwarmdeSpiegels(CarOption value) {
        this.verwarmdeSpiegels = value;
    }

    /**
     * Gets the value of the inklapbareSpiegels property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getInklapbareSpiegels() {
        return inklapbareSpiegels;
    }

    /**
     * Sets the value of the inklapbareSpiegels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setInklapbareSpiegels(CarOption value) {
        this.inklapbareSpiegels = value;
    }

    /**
     * Gets the value of the meegespotenSpiegels property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getMeegespotenSpiegels() {
        return meegespotenSpiegels;
    }

    /**
     * Sets the value of the meegespotenSpiegels property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setMeegespotenSpiegels(CarOption value) {
        this.meegespotenSpiegels = value;
    }

    /**
     * Gets the value of the dodehoekspiegelBestuurder property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDodehoekspiegelBestuurder() {
        return dodehoekspiegelBestuurder;
    }

    /**
     * Sets the value of the dodehoekspiegelBestuurder property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDodehoekspiegelBestuurder(CarOption value) {
        this.dodehoekspiegelBestuurder = value;
    }

    /**
     * Gets the value of the dimmendeBinnenspiegel property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDimmendeBinnenspiegel() {
        return dimmendeBinnenspiegel;
    }

    /**
     * Sets the value of the dimmendeBinnenspiegel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDimmendeBinnenspiegel(CarOption value) {
        this.dimmendeBinnenspiegel = value;
    }

    /**
     * Gets the value of the dimmendeBuitenspiegel property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDimmendeBuitenspiegel() {
        return dimmendeBuitenspiegel;
    }

    /**
     * Sets the value of the dimmendeBuitenspiegel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDimmendeBuitenspiegel(CarOption value) {
        this.dimmendeBuitenspiegel = value;
    }

    /**
     * Gets the value of the dakrails property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getDakrails() {
        return dakrails;
    }

    /**
     * Sets the value of the dakrails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setDakrails(CarOption value) {
        this.dakrails = value;
    }

    /**
     * Gets the value of the binnenuitTeOpenenTankklep property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBinnenuitTeOpenenTankklep() {
        return binnenuitTeOpenenTankklep;
    }

    /**
     * Sets the value of the binnenuitTeOpenenTankklep property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBinnenuitTeOpenenTankklep(CarOption value) {
        this.binnenuitTeOpenenTankklep = value;
    }

    /**
     * Gets the value of the binnenuitTeOpenenBagageklep property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getBinnenuitTeOpenenBagageklep() {
        return binnenuitTeOpenenBagageklep;
    }

    /**
     * Sets the value of the binnenuitTeOpenenBagageklep property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setBinnenuitTeOpenenBagageklep(CarOption value) {
        this.binnenuitTeOpenenBagageklep = value;
    }

    /**
     * Gets the value of the opAfstandTeOpenenBagageklep property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getOpAfstandTeOpenenBagageklep() {
        return opAfstandTeOpenenBagageklep;
    }

    /**
     * Sets the value of the opAfstandTeOpenenBagageklep property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setOpAfstandTeOpenenBagageklep(CarOption value) {
        this.opAfstandTeOpenenBagageklep = value;
    }

    /**
     * Gets the value of the halogeenKoplampen property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getHalogeenKoplampen() {
        return halogeenKoplampen;
    }

    /**
     * Sets the value of the halogeenKoplampen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setHalogeenKoplampen(CarOption value) {
        this.halogeenKoplampen = value;
    }

    /**
     * Gets the value of the xenonKoplampen property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getXenonKoplampen() {
        return xenonKoplampen;
    }

    /**
     * Sets the value of the xenonKoplampen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setXenonKoplampen(CarOption value) {
        this.xenonKoplampen = value;
    }

    /**
     * Gets the value of the verstelbareKoplampen property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerstelbareKoplampen() {
        return verstelbareKoplampen;
    }

    /**
     * Sets the value of the verstelbareKoplampen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerstelbareKoplampen(CarOption value) {
        this.verstelbareKoplampen = value;
    }

    /**
     * Gets the value of the koplampsproeiers property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getKoplampsproeiers() {
        return koplampsproeiers;
    }

    /**
     * Sets the value of the koplampsproeiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setKoplampsproeiers(CarOption value) {
        this.koplampsproeiers = value;
    }

    /**
     * Gets the value of the automatischInschakelendeKoplampen property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getAutomatischInschakelendeKoplampen() {
        return automatischInschakelendeKoplampen;
    }

    /**
     * Sets the value of the automatischInschakelendeKoplampen property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setAutomatischInschakelendeKoplampen(CarOption value) {
        this.automatischInschakelendeKoplampen = value;
    }

    /**
     * Gets the value of the verstralers property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerstralers() {
        return verstralers;
    }

    /**
     * Sets the value of the verstralers property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerstralers(CarOption value) {
        this.verstralers = value;
    }

    /**
     * Gets the value of the mistlampenVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getMistlampenVoor() {
        return mistlampenVoor;
    }

    /**
     * Sets the value of the mistlampenVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setMistlampenVoor(CarOption value) {
        this.mistlampenVoor = value;
    }

    /**
     * Gets the value of the mistlampenAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getMistlampenAchter() {
        return mistlampenAchter;
    }

    /**
     * Sets the value of the mistlampenAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setMistlampenAchter(CarOption value) {
        this.mistlampenAchter = value;
    }

    /**
     * Gets the value of the zoemerVergetenVerlichting property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getZoemerVergetenVerlichting() {
        return zoemerVergetenVerlichting;
    }

    /**
     * Sets the value of the zoemerVergetenVerlichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setZoemerVergetenVerlichting(CarOption value) {
        this.zoemerVergetenVerlichting = value;
    }

    /**
     * Gets the value of the verlichteBagageruimte property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerlichteBagageruimte() {
        return verlichteBagageruimte;
    }

    /**
     * Sets the value of the verlichteBagageruimte property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerlichteBagageruimte(CarOption value) {
        this.verlichteBagageruimte = value;
    }

    /**
     * Gets the value of the verlichteMotorruimte property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerlichteMotorruimte() {
        return verlichteMotorruimte;
    }

    /**
     * Sets the value of the verlichteMotorruimte property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerlichteMotorruimte(CarOption value) {
        this.verlichteMotorruimte = value;
    }

    /**
     * Gets the value of the verlichtDashboardkastje property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerlichtDashboardkastje() {
        return verlichtDashboardkastje;
    }

    /**
     * Sets the value of the verlichtDashboardkastje property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerlichtDashboardkastje(CarOption value) {
        this.verlichtDashboardkastje = value;
    }

    /**
     * Gets the value of the regelbareDashboardverlichting property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getRegelbareDashboardverlichting() {
        return regelbareDashboardverlichting;
    }

    /**
     * Sets the value of the regelbareDashboardverlichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setRegelbareDashboardverlichting(CarOption value) {
        this.regelbareDashboardverlichting = value;
    }

    /**
     * Gets the value of the leeslampjeVoor property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getLeeslampjeVoor() {
        return leeslampjeVoor;
    }

    /**
     * Sets the value of the leeslampjeVoor property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setLeeslampjeVoor(CarOption value) {
        this.leeslampjeVoor = value;
    }

    /**
     * Gets the value of the leeslampjeAchter property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getLeeslampjeAchter() {
        return leeslampjeAchter;
    }

    /**
     * Sets the value of the leeslampjeAchter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setLeeslampjeAchter(CarOption value) {
        this.leeslampjeAchter = value;
    }

    /**
     * Gets the value of the verlichteMakeupspiegel property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVerlichteMakeupspiegel() {
        return verlichteMakeupspiegel;
    }

    /**
     * Sets the value of the verlichteMakeupspiegel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVerlichteMakeupspiegel(CarOption value) {
        this.verlichteMakeupspiegel = value;
    }

    /**
     * Gets the value of the vertragingInterieurverlichting property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getVertragingInterieurverlichting() {
        return vertragingInterieurverlichting;
    }

    /**
     * Sets the value of the vertragingInterieurverlichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setVertragingInterieurverlichting(CarOption value) {
        this.vertragingInterieurverlichting = value;
    }

    /**
     * Gets the value of the portierverlichting property.
     * 
     * @return
     *     possible object is
     *     {@link CarOption }
     *     
     */
    public CarOption getPortierverlichting() {
        return portierverlichting;
    }

    /**
     * Sets the value of the portierverlichting property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarOption }
     *     
     */
    public void setPortierverlichting(CarOption value) {
        this.portierverlichting = value;
    }

}
