package jp.primecloud.auto.api.response.lb;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import jp.primecloud.auto.api.response.AbstractResponse;


public class ListLoadBalancerResponse extends AbstractResponse {

    /**
     * インスタンス情報のリスト
     */
    @JsonProperty("LoadBalancers")
    private List<LoadBalancerResponse> loadBalancers = new ArrayList<LoadBalancerResponse>();

    public ListLoadBalancerResponse() {}

   /**
    *
    * loadBalancersを取得します。
    *
    * @return loadBalancers
    */
    public List<LoadBalancerResponse> getLoadBalancers() {
        return loadBalancers;
    }

   /**
    *
    * loadBalancersを設定します。
    *
    * @param loadBalancers
    */
    public void setLoadBalancers(List<LoadBalancerResponse> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }

}