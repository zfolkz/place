package com.placesapp.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zfolkz on 6/16/2017 AD.
 */

public class NearbyData implements Parcelable {

    /**
     * html_attributions : ["Listings by <a href=\"http://www.where-in-thailand.com/\">Where In Thailand<\/a>","Listings by <a href=\"http://www.space-miner.com/\">Space Miner<\/a>"]
     * next_page_token : CoQC_QAAAOoV7Btb7jWFAsbNDTYCdw2SXMt-joIZvmkqbekJDKyApXIaK7cLYTE24ATShAxgaXBo8eE3ncyAt0bRuQpDh3CGRi-Muj96ztxm3g5puRBxMpLfnr8HSvqWpchbDoTP1u4aRPbjm1BdpXqtzhm4I6ehQhTTJ7mdvsXrNdQ3agdDucHQad21nkyhURPFAFSAjfCqGwR-3Shtm1vwaJ2kn8GXXip2cZuPhyrPeEkQpQmaBBM2RiMdP0v-0pSIuIyZxIqGrL14U4-QUbeBTkCu_LXGAmB-lu0LdFHXJtjEGvBIsaQuMy6qUQO-KRqhq8TA6c-SJHxM9uTqfchrFZMP0cgSEPaFlVP8nNZq9GXvwyqbCAoaFOoQ5qxeBFR57xSW-YGHTIAZOSGn
     * results : [{"geometry":{"location":{"lat":13.7563309,"lng":100.5017651},"viewport":{"northeast":{"lat":13.955111,"lng":100.938408},"southwest":{"lat":13.49409,"lng":100.3278136}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png","id":"56ef65d942d42054613887fd09cee596d5949359","name":"Bangkok","photos":[{"height":1152,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112407919959278921592/photos\">Christopher Snyder<\/a>"],"photo_reference":"CmRaAAAAEiWU6vkz1QDvuDP_bz0eXjSIE26fETwXe14oJvQuOo2Ve9ASv5fi2OLBSbvObKMKu760dNGhF7rLCC8SpJSaRh3fDmRqrJm-yCrk-a8Ol7FO9EYfezNOIXndUyuktnj0EhAZx0_XMXvV8Ua2w6g6U6SIGhSLmANWD9uo3_CUDatFnB9G4CxWxA","width":2048}],"place_id":"ChIJ82ENKDJgHTERIEjiXbIAAQE","reference":"CmRbAAAAmQteC4tAMIj00JQZPsOBRQC97GkbeS65PafMmKb0fNIt6gmYN5z4b79jqcE1WO-0CQn1kmbiEVbIiPiu51Z9J-ECFtkZQANRPo0dQGxBciyPWk19_Raz7ppFhvW4lnrFEhDQv2Blnhru7l-3rRKdGoehGhRctZxyq-c_1_JYZoGJyqoSIQl2Uw","scope":"GOOGLE","types":["locality","political"],"vicinity":"Bangkok"},{"geometry":{"location":{"lat":13.7331092,"lng":100.6887203},"viewport":{"northeast":{"lat":13.7344581802915,"lng":100.6900692802915},"southwest":{"lat":13.7317602197085,"lng":100.6873713197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"0c219e0fc607777c63684726a3a20b726ec25366","name":"Ban Tab Chang Railway Station","opening_hours":{"open_now":true,"weekday_text":[]},"photos":[{"height":1836,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105120181641958526589/photos\">พรประชา ขันเขตต์<\/a>"],"photo_reference":"CmRaAAAAz1IJCZ_ReaC2ODSrnGcidBZ9gecj8kwbCTeI7_fUryW6YXFHdjO6K4RfSk-R8Iw-6rE0Z1jZucQeE7qNUy6dpBNzM4YfqgHhDIltSyYakYDWL2QL8_blUXPEi6qYsenWEhDyyHwBVgYoQVTiMSBlx6XkGhRc1pfT70N4pUfX0WHSe4dH2Av5wQ","width":3264}],"place_id":"ChIJ2Wa-jCFhHTERmki6-0BGCqo","rating":3.7,"reference":"CmRSAAAA9uQL4jjl1dtoxA5fVo5vw2nBZecte6yiP3j1NpiLYG37G2WMEey-PB_1-lsbVJ0oHtTeejE8cgCVEaU-brCS7Gy3O29Imu_pBoCGwcsfaE-CR8FtszibhkC3iTYuB6XLEhCSjDQyghcBJpoPG7zWcksZGhSnb7rlL6yTXdOwKJCQABQbDiyMHg","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"Prawet"},{"geometry":{"location":{"lat":13.7278323,"lng":100.6815804},"viewport":{"northeast":{"lat":13.7291812802915,"lng":100.6829293802915},"southwest":{"lat":13.7264833197085,"lng":100.6802314197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/school-71.png","id":"21e9c946e012ca73e724a97640fbab8af37b258b","name":"Wattana Sin Wittaya School","place_id":"ChIJ10_kAeJgHTERky-semaBjLA","reference":"CmRSAAAAeABeAQheMUs2F6Mo2HwnD93lTpuzY9jEay27X0zEXw5H45xlV3Nng3WWPB8vzW83itpt0-JJ06H6bCib53puxZeJHjzjDh51EtSg5q_bL0fHp4gU9BCBAyrdi8zUM8sCEhA81xqoBh-ySE1E4C3YFpTLGhSBZWH0D_A-CAhbA8EHOwyvM_t-sg","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"Prawet"},{"geometry":{"location":{"lat":13.7256324,"lng":100.68469},"viewport":{"northeast":{"lat":13.7269813802915,"lng":100.6860389802915},"southwest":{"lat":13.7242834197085,"lng":100.6833410197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/civic_building-71.png","id":"c25cc96954298235616fac85b790a693a4683814","name":"On Nut Electricity Generating Authority of Thailand","place_id":"ChIJvfq3U-BgHTERhijp3WGX7Z0","rating":4,"reference":"CmRSAAAAW-jrR_kHAWdCZd8h1D1KJq20yXnbOGE0d8giBz2W82LlBo7x3p7gNBoqEv8L21R3Vy-1c1orTMIj5Jf661yMTkTmB5y6eXxSfam03ufDiEn4UBfn3yx2qpzBVLVb-U-1EhAJKC8GNj7QKKhOV4Mk1Je9GhRXAV5LE6TT_n4N5qXMr5KRnkgliA","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"Prawet"},{"geometry":{"location":{"lat":13.7353654,"lng":100.6879194},"viewport":{"northeast":{"lat":13.7367143802915,"lng":100.6892683802915},"southwest":{"lat":13.7340164197085,"lng":100.6865704197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/worship_islam-71.png","id":"c3ccff850d7969d36b3572d3292706dd1ea1f5ea","name":"Niamatul Islam Mosque","photos":[{"height":720,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/109338170557752292976/photos\">Kosem Ksm<\/a>"],"photo_reference":"CmRaAAAAkgHtbJ6RBiiwAT3xRV2cmYx9QSYt0PAY8GMbArn1j4uPAtAoXmCZm8kcYk29m8F557OId_IGqk9WssC5CkKKa6fd9CFr_Fp9BNp767LMoLYmeqJJb9IAzSXc1k4pcEblEhBrWtu1WkctB2QU4n9GWe_bGhTXEv4_tyuPbhf0qO-AnixYGr1nbQ","width":960}],"place_id":"ChIJJ0oLciJhHTERi7lJbpNXQqY","rating":4,"reference":"CmRSAAAApbBMQyIJhvtoZn81F-Co_myUTytm33F58UqSRAJKTkPnTgz4NdXsrYXU0XIqsui-7STVPQb3p8JxFbi1E80tsGvmtUdk7jvjfB3ewtBsOb506TyxIgqliZYa9VGOhAGGEhDSLTSeOOdbOPJKzG6k3BT8GhSTmexVujNSb3WlBRaBUbssCt1XeQ","scope":"GOOGLE","types":["mosque","place_of_worship","point_of_interest","establishment"],"vicinity":"Saphan Sung"},{"geometry":{"location":{"lat":13.7286324,"lng":100.698442},"viewport":{"northeast":{"lat":13.7299813802915,"lng":100.6997909802915},"southwest":{"lat":13.7272834197085,"lng":100.6970930197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"cf53af1f4209aefec76ee1b32d117214fa3f754c","name":"บริษัท พิจิตรอุตสาหกรรม จำกัด","place_id":"ChIJcadE6Q1hHTERcfrBc5ncRqc","reference":"CmRSAAAAe2_QJwx57mnQmJU9OMM776gqALTDUTr6ZJgvf8sNuDe_eLStbJpieqZjT75wqCAvsrtTAmIclAnNfmp9THF0Px5RihgYWOat6zgu8F-9jaJ7C6DPPktXD13Evbgn0cwyEhCTTbMYsL-7O5hOwor4pRz8GhT2EcFPuARsgOxG11E5mMivhNoWqA","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"หมู่ที่ 13, 52/3 Thanon Krung Thep Kritha, Saphan Sung"},{"geometry":{"location":{"lat":13.726958,"lng":100.69327},"viewport":{"northeast":{"lat":13.7283069802915,"lng":100.6946189802915},"southwest":{"lat":13.7256090197085,"lng":100.6919210197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"0c68b17c0e1513f30ba6c0f82973f02b4284a68d","name":"พฤกษาทาวน์ เน็กซ์ อ่อนนุช-พระราม 9 (Pruksatown nexts Onnut -Rama 9)","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":2560,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/114057236240830937857/photos\">เพชรรุ้ง เจริญสุข<\/a>"],"photo_reference":"CmRaAAAA5UaL6UZnrfZMDhYP4R_nzijrACQovfYWJVN-_Pu08SNvzkfc8VoI83ojdiQ7dhl3TSI54xdfad61HEQ6YXlhXKi903gKkCcLEwpvxQV-dempDVANzaZuJ38emp7TtjSlEhDI1wIfVZr_8IPikC7G8y14GhTtYnNpJkwhUdHc-EqTQ1VuainXdQ","width":1920}],"place_id":"ChIJEz0-bMVgHTERT1Ehwk4xoeg","rating":4.6,"reference":"CmRSAAAA3SvPDmo4zctgyBLTf99eSMsvGgCw95CPzx4NmuWPCF2eBfdsXdZd87-x7bH6n05Zwzb7JGDseepSE8TAWNhEwAfE8hR8qAmpZC7xlOZrVFJB1NC8--VT-LqQJ0BhFdy4EhCrviCrS3m-iS99L9JxhVjKGhQjlQtlbgNtNANfacAEmhMTK3XpdA","scope":"GOOGLE","types":["real_estate_agency","point_of_interest","establishment"],"vicinity":"Chaloem Phrakiat Rama 9, ประเวศ, Prawet"},{"geometry":{"location":{"lat":13.720791,"lng":100.682997},"viewport":{"northeast":{"lat":13.7221399802915,"lng":100.6843459802915},"southwest":{"lat":13.7194420197085,"lng":100.6816480197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"1f5eed946bc6c1bc1679b026c54675bafec81405","name":"บริษัท ทียูแพ็ค จำกัด","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":902,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107175963970083931857/photos\">บริษัท ทียู แพ็ค จำกัด (TU PACK)<\/a>"],"photo_reference":"CmRaAAAAj7zQoCIDMRDYrW3P42skjqp8mfQ9Fa3Zyo0whdTMfHOJwJVCkOVTkdLAADJLCBzOFP9DF2sXNl-cmXhcrcaQKk5SlqV-U-7Uoj4yJrkjK0CuKoRUug3yu6ine7rGFtqtEhD1SMc6kbsZ3gnE3q5p1Dl7GhSA9fp7mAPdfiqEF14lDJHx6O7LrQ","width":902}],"place_id":"ChIJ77UoRuRgHTERJPUyPjlcgKg","rating":4.1,"reference":"CmRSAAAA7dQvAVvDVWpyCj1wqJ6zVIuoeLfd2tfXrKPtKnE2MsgA0uez2G-FAU_VXJ-wLfNC23ZJPcapUJFXzGyZh3vkKFCSl9W4svvdPItnqTBH46cxfY5EVaeQG6VPtYAS_VznEhDGBCHSzwEUJi16RrfZhR2jGhREhX4Hpr9DU1zouofVFpRTcCbJTw","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"549/9 ถนนอ่อนนุช แขวงประเวศ เขตประเวศ"},{"geometry":{"location":{"lat":13.725421,"lng":100.6813798},"viewport":{"northeast":{"lat":13.7267699802915,"lng":100.6827287802915},"southwest":{"lat":13.7240720197085,"lng":100.6800308197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/lodging-71.png","id":"9951c7630d9f756eaf37d1d30451a012f2ec1be9","name":"Pa Chalermchai Guesthouse","place_id":"ChIJnzQOK-JgHTERJI0Q37dBUP4","reference":"CmRSAAAAIgab5KLIZPrMoz5XH3GgnWoRYsK3Bblh1Fne3ZoVbF2Wzfm98g6egHP8tz5S5ERKV5qQn34zxcYruVp2VjRkpzTgDI_sV0EeYmEjKcxM_NrwzvZeXqbbFmHdt195XEiwEhCyExjWMe8gNca6Bs3ECptdGhQP5XPY65V5IFx1kU7sc0crZDUkgQ","scope":"GOOGLE","types":["lodging","point_of_interest","establishment"],"vicinity":"61 On-Nut Road, On-Nut 65 Yeak 3, Prawet Bang Kapi"},{"geometry":{"location":{"lat":13.7270291,"lng":100.6962648},"viewport":{"northeast":{"lat":13.7283780802915,"lng":100.6976137802915},"southwest":{"lat":13.7256801197085,"lng":100.6949158197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"3a61eab756137b89fab06e6fe82aeefea07b3cbb","name":"The Connect On Nut","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":662,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/108680492883637929446/photos\">เดอะ คอนเนค อ่อนนุช<\/a>"],"photo_reference":"CmRZAAAAA4JKawmSpkWEzq44mAMy_20OqUmSjikHj2YSm_PlbDNxLdbASDQPcz3ZFLwVL0YTsbuvgkUTbOLxyqOTGT-ZQQtCN4Ia7b_nkMDoQElB0AvtGLZuz5oP0EcpHRHfyfacEhDZUpXt4oiaiBXy5oRbancIGhRshfbh22fN1enoZMbQ_M7X1R9prg","width":664}],"place_id":"ChIJYzpTfNhgHTERlSDjNUhvw4s","rating":4.1,"reference":"CmRSAAAAy4GNCwbknyH3sOcEj7O5UNtFHftXFYdF3Klg46-BB5tMzoluknK4lnU5mHCelTyN2VjXE2oQCEH9G9ZA2R7sadEURYSxpFSBmJDy-2W3KixKIAJZ3eWu6cSOPHO2bCOdEhBIXpfJDrEXXh2aBtbB_dr1GhR34OtImfbovqpqzAN60Ph3-hkNMA","scope":"GOOGLE","types":["general_contractor","point_of_interest","establishment"],"vicinity":"Sukhumvit 77 Road, Prawet"},{"geometry":{"location":{"lat":13.7306629,"lng":100.6837755},"viewport":{"northeast":{"lat":13.7320118802915,"lng":100.6851244802915},"southwest":{"lat":13.7293139197085,"lng":100.6824265197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"15d75d7729de8f69131340d6e6a386d196c84f3d","name":"Golden Nakara Housing","photos":[{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105110267991893873307/photos\">Pianchai3<\/a>"],"photo_reference":"CmRaAAAAIQxWj23ZqmPwgXVXBuX9jU2KvafswxQLjSPbmzEczfoRhOHvHcYRYhEPldI7ZB3eRDUuMvy6Yw5bUEbuMdaz31dDM63_heV3O0z02QC1IAQP0_CCpQFYZBMM3winfizmEhB_edJUoBn-DRJ3XmZHQQ5ZGhS2AjV-_SdihczDw5YxhTG2M6n-dA","width":3264}],"place_id":"ChIJQW4yJB1hHTERaDx6W5yRDQA","rating":4.3,"reference":"ClRQAAAAjinKsz5w6ovIWHq06ANXNV5EqcaRvKIhW9W5siz0fQMLdsfzhKYApwHO-W1Zi9J-lAdWHJfmzHZKqEw1rDM3BTPg3SBfSZ581Ae1hxd-7OESEMEPhWqhctn4qlFGtqOQbTcaFHb6QDAj89j80MyBibViBE_7Dhja","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"Prawet"},{"geometry":{"location":{"lat":13.73087,"lng":100.687851},"viewport":{"northeast":{"lat":13.7322189802915,"lng":100.6891999802915},"southwest":{"lat":13.7295210197085,"lng":100.6865020197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"7e64f601b729e401e104ea50194dde27315baa00","name":"Lalin Green View Village","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJf3_z0iFhHTERwbt2-eQ9mZs","rating":5,"reference":"CmRSAAAA1-bZTYIirE29m-aV5WMLkw1FD68nvoDUZhLcGrkwf7c9kOck401sXYzI348Kh-_xC7GqU71ivJyNv_vO_6wNl-P7G7iOfFOLpJnQPjes5Viyyob-m0eGKUIn9y5gzmlxEhAGF0i8nFfa5V42g21v3MLxGhSc4v7gT8dsw1yDIUR-I31ln4bIlA","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"431/208 Chaleam Prakiat Row 9, Prawet"},{"geometry":{"location":{"lat":13.7229189,"lng":100.6869741},"viewport":{"northeast":{"lat":13.7242678802915,"lng":100.6883230802915},"southwest":{"lat":13.7215699197085,"lng":100.6856251197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"1e9174b2d2d69f9dcaa4d2d42e1470076ddae457","name":"บริษัท กุสุมา แอคเคาท์ติ้ง เซอร์วิสเซส จำกัด(สาขาประเวศ)","photos":[{"height":1536,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/117434564928123819018/photos\">บริษัท กุสุมา แอคเคาท์ติ้ง เซอร์วิสเซส จำกัด(สาขาประเวศ)<\/a>"],"photo_reference":"CmRaAAAAzsdWuuNT61_fBLIccgodhbL1r_oT_cffr4v5QjZTn6phohcEHosQaYnMS5AzD9GFE34A6yJMtoGV10Jz04pmqcAUb6Nsml6gMOhhZdahwyZT-dTOQUbQp6qfyElJadVbEhAcYBtlQcllDe1L-m018A8fGhTcuB8ihKo8ei14mcl6kIK7-k3Gqw","width":2048}],"place_id":"ChIJe1PhNzxgHTER7WeMZDhmG4o","rating":3,"reference":"CmRSAAAAUqNak4Hc8dp8m4gIlpsST11BIu3rfrg3ot3jTiN-ec2uo2hIMk2S5I-9jrP2-_tE7CFiU7p1gB-lOydsElRzaWsQJs1Okr5szzeq-YffxlDbwCJSgvxFbUH0K_04kciwEhBaz_cUw4cdZ0Kj6xsHqNynGhRN3wDLheG3j_N0uRHoRPU4ReB2VA","scope":"GOOGLE","types":["accounting","finance","point_of_interest","establishment"],"vicinity":"13 ซอยอ่อนนุช65 ถนนอ่อนนุช, แขวงประเวศ เขตประเวศ"},{"geometry":{"location":{"lat":13.7220209,"lng":100.6867256},"viewport":{"northeast":{"lat":13.7233698802915,"lng":100.6880745802915},"southwest":{"lat":13.7206719197085,"lng":100.6853766197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"61c07a1b1857f518175253b76165296ee718d3ed","name":"Extra Holidays Co.,Ltd.","opening_hours":{"open_now":false,"weekday_text":[]},"place_id":"ChIJjQmm5_1jHTERd1WZtsl2tHw","reference":"CmRRAAAA7fNIJ8c2AZnUoSR-qXTvN0pvOvzDo8JyBHzGPn5my3pYGN6Kydn5_WPh4NkXARZ0VLI-Xvk8ERXqYHJdahUTBuMQ7PTMaspCE15jOIIdemzKdoX4fSpYk3-_x2NI6ufQEhA4KFDcjbeAImqc-ByOcxzOGhTXMJ63_mtRGm_gqzB5kjo3Z6YIsA","scope":"GOOGLE","types":["travel_agency","point_of_interest","establishment"],"vicinity":"555/221 ถนน อ่อนนุช, Prawet"},{"geometry":{"location":{"lat":13.724325,"lng":100.689381},"viewport":{"northeast":{"lat":13.7256739802915,"lng":100.6907299802915},"southwest":{"lat":13.7229760197085,"lng":100.6880320197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"63a4cb0e2e0e321409f5c459c55326117d8f7161","name":"บริษัท เนอวานา ดีเวลลอปเม้นท์ จำกัด","place_id":"ChIJldgjUN5gHTER1DM0ZWQyb30","rating":5,"reference":"CmRRAAAA6wEVffXrRH4LzgEfOohNQo7B31oS4mXUsoUHOmVBLMvfLRwNnA7AUDhHO5Aoqj9DdX0zeUY0IYFYxFzpwRzE4uedscgnNgx7KGRwDyJG3AazeDAxPGTVIgEUYfJKH0CsEhCI4jjIRbdqWkMKjk50ETS_GhQa_eHCQKAiON7NtjW7csMoA84OJw","scope":"GOOGLE","types":["general_contractor","point_of_interest","establishment"],"vicinity":"555 ถนนอ่อนนุช, แขวงประเวศ, ประเวศ"},{"geometry":{"location":{"lat":13.720841,"lng":100.6854487},"viewport":{"northeast":{"lat":13.7221445302915,"lng":100.6867996802915},"southwest":{"lat":13.7194465697085,"lng":100.6841017197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"8c7a675e5fcca33979353a5126a7c3b848229d4f","name":"เนอวานา พาร์ค สุขุมวิท77","photos":[{"height":2448,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/107196116830144029575/photos\">raungthong pimthong<\/a>"],"photo_reference":"CmRaAAAA515LNnwklr-qYqBjzZd7ewIE7x9zCRPGo4PU2FU4vIKHPqQVuMWuTXXRGh64HSaigaY7Llkpgo8BMeJxPCg2S8OwzRWz1GKlQ7KL1hB4dCtg76CGqf2caZaBj4kp3GmYEhD3d9N8ntqPCyj4_08qf82tGhSv1qMza70uIeF2gQvsIryYillhEQ","width":3264}],"place_id":"ChIJ-3_6PedgHTERF6BS35nupxc","rating":4.3,"reference":"CmRRAAAA-p4bTM9Y_LxNt9GjN-WtUCGJRDrDhwqBm3GtNjfzRYh6JNDxvbWzuFFvgXrbKfcYmDGP9dWl4IdFKMRFqn2jJBTmWB9mVpSy2_bxQWD3pvGoW1J0Hlu6HDRCh-sKW9-LEhBqa9ZPGUbdbbftXcZBuj_sGhTMwIdZl9r0k2ah0L7JIMwxRgXmqQ","scope":"GOOGLE","types":["point_of_interest","establishment"],"vicinity":"12/4 On Nut Road, Prawet"},{"geometry":{"location":{"lat":13.726658,"lng":100.692983},"viewport":{"northeast":{"lat":13.7280069802915,"lng":100.6943319802915},"southwest":{"lat":13.7253090197085,"lng":100.6916340197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"ad8768c4cf3fc24f9dae93f59dec4e337d5cffe4","name":"วี ทู อ่อนนุช - พระราม9 (WE/2 Onnut - Rama9)","opening_hours":{"open_now":false,"weekday_text":[]},"photos":[{"height":1856,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/103995828625381226563/photos\">ซากินา เอี่ยมใจรัก<\/a>"],"photo_reference":"CmRaAAAAI2TuJrwgUwbEZKHpdrhTUc14W2uYkimJANOrnPNx_Dn4ASAnvxK93ylNsv_w5CCFoq6uTWdLuBfduZZDsYKYZkmRTDyPuBY30f_VzNUcvFok66YAq7ZLfqqxi0Zsq-9MEhC6PihFniFSw0boBuGrgAEUGhTmZooBd3EYCmduJBGJa76AmO9R7A","width":5744}],"place_id":"ChIJJ2s0G9hgHTERoop7q52YU7g","rating":3.4,"reference":"CmRSAAAAweKkHxbUE8zqdBtJs2lgdFYg085RHG-28Szpwyu4zMuAZnFvGfvZMyHuTvvIPKLkkKHfaZjYRFqXkwhv6a2Qfs2PFmL1zSBtACqiKBLQ39syfFgjmSRX_j2pOHvD_k2pEhArD9NvMoP1nWu3yvymRPkcGhTmolo8Mms5VY9FIwXg8tJGX5dctg","scope":"GOOGLE","types":["general_contractor","point_of_interest","establishment"],"vicinity":"Chaloem Phrakiat Rama 9, ประเวศ"},{"geometry":{"location":{"lat":13.7226933,"lng":100.6897761},"viewport":{"northeast":{"lat":13.7240422802915,"lng":100.6911250802915},"southwest":{"lat":13.7213443197085,"lng":100.6884271197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/shopping-71.png","id":"0c4136f77bcc11cdecc4a9d429db496a5be24825","name":"บริษัท กรุงเทพไวท์บอร์ด จำกัด","photos":[{"height":472,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/102645723661759925737/photos\">บริษัท กรุงเทพไวท์บอร์ด จำกัด<\/a>"],"photo_reference":"CmRaAAAAVw1GZSB4Nz_N5iLYLwBumnQAinOQCQpAHIzYd233odXOKH58SGnxtWeV_afEt3HHuCfYNPvVLcaGRqOH-83siqwvUpmk-dyibocmaZ27WXblXaITlQDjctkbDakEPB1yEhDRjsFdeCVZjyYUzYE9YGd3GhTrEY2uvsaUWx05p3HSfj1-cFpgYg","width":750}],"place_id":"ChIJowCiTyKZ4jARVGWn7F0kBg0","reference":"CmRRAAAAZKYT2iP19NBVxOExKkSKxEmoqSsaEtyWzURJ1KhM2-I7tRoDuSOsmkM4w6yo10S0vrvuDfOqaMa1y5A-1abDRYxP0bKcw97Byh857T7NcaWvnVD9EoyX6pOjb_XijTtCEhDS9hpq7PstP5hkOi8f5XcqGhR4d9pNMEO8vGlwk0GSCjtYQzBRbg","scope":"GOOGLE","types":["store","point_of_interest","establishment"],"vicinity":"306/14 ปากซอยศรีธรรมาธิราช-เจริญกรุง ถนน เสือป่า แขงป้อมปราบ"},{"geometry":{"location":{"lat":13.732652,"lng":100.689643},"viewport":{"northeast":{"lat":13.7340009802915,"lng":100.6909919802915},"southwest":{"lat":13.7313030197085,"lng":100.6882940197085}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/generic_business-71.png","id":"194063ffa636f43cf7b4322827fa03128ea29309","name":"กิฟฟารีนออนไลล์","photos":[{"height":487,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/105791032267290862313/photos\">กิฟฟารีนออนไลล์<\/a>"],"photo_reference":"CmRaAAAAm16X8IVLegk3KP83vmOP0ILqtTSoW5Gnfz2LFi6AgmXtZJ1seJ74XLorXRu-HmwvG56Dxvc08_5ao3-g3Hz9v1cXb_2gW9BKl7e4zVWZ6v2BZejhgNUkw2NeYmw2oZ5AEhAK0bDmXGnVl2fF4x9xKM7uGhSHQCFXMsBPb5OU1MYOEXX3klmJxQ","width":536}],"place_id":"ChIJddxtmyFhHTERj-4iKqx39jA","rating":5,"reference":"CmRRAAAA_ZbP4qJOPWoRQ11lbFQSqLCONo4Xhc7xFPFCSHHLKMN4UMqrUBhgjt2UMtY20S99H_B5UuA3KUlgLujSHAwPWWEzzCilI2u9sfDVKTQzl_rH15wdhVK-KA7R9Qoh0gZpEhB5cU1MlTnU8XRB5fk2v-ITGhR-tNER2sAMuJCiO6te8BuurmTzCg","scope":"GOOGLE","types":["store","point_of_interest","establishment"],"vicinity":"431/109 หมู่บ้าน ลลินกรีนวิลล์ ประเวศ"},{"geometry":{"location":{"lat":13.7156255,"lng":100.6958924},"viewport":{"northeast":{"lat":13.7378297,"lng":100.7123148},"southwest":{"lat":13.6562046,"lng":100.6340342}}},"icon":"https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png","id":"fc4fe6bbd44e3b921dc72a8e893968c6dc4e132b","name":"Prawet","photos":[{"height":1000,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/104318710526596337450/photos\">arkomny<\/a>"],"photo_reference":"CmRaAAAA03L9OEtq1i4m3bEjMnTKyAqvrU9mxBvPlfDoKdQhADNEPUoAb_MIlNHIy9Jph1qeLY2ua30xXItAcib7fgCeSJsKvgj_XElrXEK5kyuzIzc659Vb0xey98Ck7gB4bfo0EhCkV6t_9349VAoWhcT94ft5GhQQdeOsr9xOAMOxOv4_8x4Gxd8Smg","width":1718}],"place_id":"ChIJiWT_qY9gHTERgE_iXbIAAQM","reference":"CmRbAAAAamR3sd1dv42OH_JMwA7dhECsWOTCCYKD8zWZndidhDL_yK4jMPS6LuxhS9Q5E-du-xwO3t1hsPEh0zX4LXJUDVGMe-vsLl1KX-1houUzG5zQSMkx76q7InMFPipm7qQREhBS1-Ba9PmicSuBIu1ZZB24GhRzxQZT7QbQEuZeTHVfVILVGZRwpQ","scope":"GOOGLE","types":["sublocality_level_1","sublocality","political"],"vicinity":"Prawet"}]
     * status : OK
     */

    private String next_page_token;
    private String status;
    private List<String> html_attributions;
    private List<ResultsBean> results;

    public String getNext_page_token() {
        return next_page_token;
    }

    public void setNext_page_token(String next_page_token) {
        this.next_page_token = next_page_token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getHtml_attributions() {
        return html_attributions;
    }

    public void setHtml_attributions(List<String> html_attributions) {
        this.html_attributions = html_attributions;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * geometry : {"location":{"lat":13.7563309,"lng":100.5017651},"viewport":{"northeast":{"lat":13.955111,"lng":100.938408},"southwest":{"lat":13.49409,"lng":100.3278136}}}
         * icon : https://maps.gstatic.com/mapfiles/place_api/icons/geocode-71.png
         * id : 56ef65d942d42054613887fd09cee596d5949359
         * name : Bangkok
         * photos : [{"height":1152,"html_attributions":["<a href=\"https://maps.google.com/maps/contrib/112407919959278921592/photos\">Christopher Snyder<\/a>"],"photo_reference":"CmRaAAAAEiWU6vkz1QDvuDP_bz0eXjSIE26fETwXe14oJvQuOo2Ve9ASv5fi2OLBSbvObKMKu760dNGhF7rLCC8SpJSaRh3fDmRqrJm-yCrk-a8Ol7FO9EYfezNOIXndUyuktnj0EhAZx0_XMXvV8Ua2w6g6U6SIGhSLmANWD9uo3_CUDatFnB9G4CxWxA","width":2048}]
         * place_id : ChIJ82ENKDJgHTERIEjiXbIAAQE
         * reference : CmRbAAAAmQteC4tAMIj00JQZPsOBRQC97GkbeS65PafMmKb0fNIt6gmYN5z4b79jqcE1WO-0CQn1kmbiEVbIiPiu51Z9J-ECFtkZQANRPo0dQGxBciyPWk19_Raz7ppFhvW4lnrFEhDQv2Blnhru7l-3rRKdGoehGhRctZxyq-c_1_JYZoGJyqoSIQl2Uw
         * scope : GOOGLE
         * types : ["locality","political"]
         * vicinity : Bangkok
         * opening_hours : {"open_now":true,"weekday_text":[]}
         * rating : 3.7
         */

        private GeometryBean geometry;
        private String icon;
        private String id;
        private String name;
        private String place_id;
        private String reference;
        private String scope;
        private String vicinity;
        private OpeningHoursBean opening_hours;
        private double rating;
        private List<PhotosBean> photos;
        private List<String> types;

        public GeometryBean getGeometry() {
            return geometry;
        }

        public void setGeometry(GeometryBean geometry) {
            this.geometry = geometry;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPlace_id() {
            return place_id;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public String getReference() {
            return reference;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getVicinity() {
            return vicinity;
        }

        public void setVicinity(String vicinity) {
            this.vicinity = vicinity;
        }

        public OpeningHoursBean getOpening_hours() {
            return opening_hours;
        }

        public void setOpening_hours(OpeningHoursBean opening_hours) {
            this.opening_hours = opening_hours;
        }

        public double getRating() {
            return rating;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<String> getTypes() {
            return types;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public static class GeometryBean {
            /**
             * location : {"lat":13.7563309,"lng":100.5017651}
             * viewport : {"northeast":{"lat":13.955111,"lng":100.938408},"southwest":{"lat":13.49409,"lng":100.3278136}}
             */

            private LocationBean location;
            private ViewportBean viewport;

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public ViewportBean getViewport() {
                return viewport;
            }

            public void setViewport(ViewportBean viewport) {
                this.viewport = viewport;
            }

            public static class LocationBean {
                /**
                 * lat : 13.7563309
                 * lng : 100.5017651
                 */

                private double lat;
                private double lng;

                public double getLat() {
                    return lat;
                }

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public double getLng() {
                    return lng;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }
            }

            public static class ViewportBean {
                /**
                 * northeast : {"lat":13.955111,"lng":100.938408}
                 * southwest : {"lat":13.49409,"lng":100.3278136}
                 */

                private NortheastBean northeast;
                private SouthwestBean southwest;

                public NortheastBean getNortheast() {
                    return northeast;
                }

                public void setNortheast(NortheastBean northeast) {
                    this.northeast = northeast;
                }

                public SouthwestBean getSouthwest() {
                    return southwest;
                }

                public void setSouthwest(SouthwestBean southwest) {
                    this.southwest = southwest;
                }

                public static class NortheastBean {
                    /**
                     * lat : 13.955111
                     * lng : 100.938408
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }

                public static class SouthwestBean {
                    /**
                     * lat : 13.49409
                     * lng : 100.3278136
                     */

                    private double lat;
                    private double lng;

                    public double getLat() {
                        return lat;
                    }

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public double getLng() {
                        return lng;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }
                }
            }
        }

        public static class OpeningHoursBean {
            /**
             * open_now : true
             * weekday_text : []
             */

            private boolean open_now;
            private List<?> weekday_text;

            public boolean isOpen_now() {
                return open_now;
            }

            public void setOpen_now(boolean open_now) {
                this.open_now = open_now;
            }

            public List<?> getWeekday_text() {
                return weekday_text;
            }

            public void setWeekday_text(List<?> weekday_text) {
                this.weekday_text = weekday_text;
            }
        }

        public static class PhotosBean {
            /**
             * height : 1152
             * html_attributions : ["<a href=\"https://maps.google.com/maps/contrib/112407919959278921592/photos\">Christopher Snyder<\/a>"]
             * photo_reference : CmRaAAAAEiWU6vkz1QDvuDP_bz0eXjSIE26fETwXe14oJvQuOo2Ve9ASv5fi2OLBSbvObKMKu760dNGhF7rLCC8SpJSaRh3fDmRqrJm-yCrk-a8Ol7FO9EYfezNOIXndUyuktnj0EhAZx0_XMXvV8Ua2w6g6U6SIGhSLmANWD9uo3_CUDatFnB9G4CxWxA
             * width : 2048
             */

            private int height;
            private String photo_reference;
            private int width;
            private List<String> html_attributions;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getPhoto_reference() {
                return photo_reference;
            }

            public void setPhoto_reference(String photo_reference) {
                this.photo_reference = photo_reference;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public List<String> getHtml_attributions() {
                return html_attributions;
            }

            public void setHtml_attributions(List<String> html_attributions) {
                this.html_attributions = html_attributions;
            }
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.next_page_token);
        dest.writeString(this.status);
        dest.writeStringList(this.html_attributions);
        dest.writeList(this.results);
    }

    public NearbyData() {
    }

    protected NearbyData(Parcel in) {
        this.next_page_token = in.readString();
        this.status = in.readString();
        this.html_attributions = in.createStringArrayList();
        this.results = new ArrayList<ResultsBean>();
        in.readList(this.results, ResultsBean.class.getClassLoader());
    }

    public static final Creator<NearbyData> CREATOR = new Creator<NearbyData>() {
        @Override
        public NearbyData createFromParcel(Parcel source) {
            return new NearbyData(source);
        }

        @Override
        public NearbyData[] newArray(int size) {
            return new NearbyData[size];
        }
    };
}
