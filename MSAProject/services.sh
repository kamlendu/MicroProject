ufw disable
kubectl apply -f https://k8s.io/examples/admin/dns/dnsutils.yaml
kubectl create secret generic mysql-pass --from-literal=password=ompandey
kubectl apply -f mysql-pv.yaml
kubectl apply -f mysql-service.yaml
kubectl apply -f app-service.yaml
kubectl apply -f cl-service.yaml

