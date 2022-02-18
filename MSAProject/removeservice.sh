ufw disable
kubectl delete -f https://k8s.io/examples/admin/dns/dnsutils.yaml
kubectl delete secret mysql-pass
kubectl delete -f mysql-service.yaml
kubectl delete -f mysql-pv.yaml
kubectl delete -f app-service.yaml
kubectl delete -f cl-service.yaml

