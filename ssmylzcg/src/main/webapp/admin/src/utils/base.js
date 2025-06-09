const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmylzcg/",
            name: "ssmylzcg",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmylzcg/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "即动运动网站设计"
        } 
    }
}
export default base
