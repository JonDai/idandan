G_SERVERS = {
	"0":{web:"http://127.0.0.1:8080/",name:"local"},
	"1":{web:"http://192.168.1.2:8080/",name:"home"},
	"2":{web:"http://192.168.2.107:8080/", name:"gebi"},
	"3":{web:"http://192.168.3.186:8080/" , name:"zthz"}
};
G_EVN = "2";
//G_ROOTDIR=(window.location +"").substring(0,(window.location +"").lastIndexOf("/")+1);
//G_ISBROWSE=(G_ROOTDIR.indexOf("file://")== 0);
//C_EVN = G_ISBROWSE ? 3 : G_EVN;
G_ROOTURL=G_SERVERS[G_EVN].web;