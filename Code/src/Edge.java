
//边节点
public class Edge {
    //对应的点下表
    public int vertexId;
    //边的权重
    public int weight;
    //下一个边节点
    public Edge next;
    //getter and setter自行补充

    public int getWeight() {
        return weight;
    }

    public int getVertexId() {
        return vertexId;
    }

    public Edge getNext() {
        return next;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNext(Edge next) {
        this.next = next;
    }

    public void setVertexId(int vertexId) {
        this.vertexId = vertexId;
    }
}
